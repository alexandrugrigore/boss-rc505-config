package org.aperture.rc505.scala

import java.io.PrintWriter

object XmlWriter {

  def write(memories: List[Memory]): Unit = {
    val xmlContent = buildXml(memories)

    println(xmlContent)

    val pw = new PrintWriter("output.xml")
    pw.write(xmlContent)
    pw.close()
  }

  def buildXml(memories: List[Memory]): String = {
    val sb = new StringBuilder()
    sb.append(
      """<?xml version="1.0" encoding="utf-8"?>
        |<database name="RC-505" revision="2">
        |""".stripMargin
    )

    memories.take(1).zipWithIndex.map{ memory =>
      val mem = memory._1
      sb.append(s"""<mem id="${memory._2}">\n""")
      val fields = mem.productElementNames.zip(mem.productIterator)
      fields.map { case (fieldName, fieldValue) =>
        fieldValue match {
          case product: Product =>
            sb.append(s"""<${fieldName.toUpperCase}>\n""")
            val innerFields = product.productElementNames.zip(product.productIterator)
            innerFields.map { case (innerFieldName, innerFieldValue) =>
              sb.append(s"""\t<$innerFieldName>$innerFieldValue</$innerFieldName>\n""")
            }.toList
            sb.append(s"""</${fieldName.toUpperCase}>\n""")
          case _ =>
            sb.append(s"""\t<$fieldName>$fieldValue</$fieldName>\n""")
        }

      }.toList
      sb.append(s"""</mem>\n""")
    }
    sb.append("""</database>""")

    sb.toString()
  }

}
