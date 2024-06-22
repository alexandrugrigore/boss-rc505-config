package org.aperture.rc505.scala

import scala.xml.{Elem, XML}

object XmlParserGenerator {

  /**
   * the result of this is copied in the Model file
   */
  def generate(): Unit = {
    val xmlFile = "resources/MEMORY.RC0"
    val xml = XML.loadFile(xmlFile)
    print(
      """
        |import com.lucidchart.open.xtract.{XmlReader, __}
        |import com.lucidchart.open.xtract.XmlReader._
        |""".stripMargin)

    val memories = (xml \\ "mem").toList

    memories.head.foreach(node => {
      print(
        s"""case class Memory (
      ${
          node.child.filter(_.isInstanceOf[Elem]).map(x => {
            s"${x.label.toLowerCase()}: ${x.label},"
          }).mkString("\n")
        }
           |)
           |
           |object Memory{
           |implicit val reader: XmlReader[Memory] = {
           |    for {
           |${
          node.child.filter(_.isInstanceOf[Elem]).map(x => {
            s"${x.label.toLowerCase()} <- (__ \\ \"${x.label}\").read[${x.label}]"
          }).mkString("\n")
        }
           |} yield Memory(${
          node.child.filter(_.isInstanceOf[Elem]).map(x => {
            x.label.toLowerCase()
          }).mkString(",")
        })
           |}
           |}\n\n""".stripMargin
      )
    })

    memories.head.foreach(node => {
      print(node.child.filter(_.isInstanceOf[Elem]).map(x => {
        s"""case class ${x.label} (
           |${x.child.filter(_.isInstanceOf[Elem]).map(_.label).mkString(": Int,\n")}: Int
           |)
           |
           |object ${x.label}{
           |implicit val reader: XmlReader[${x.label}] = {
           |    for {
           |${
          x.child.filter(_.isInstanceOf[Elem]).map(x => {
            s"${x.label.toLowerCase()} <- (__ \\ \"${x.label}\").read[Int]"
          }).mkString("\n")
        }
           |} yield ${x.label}(${
          x.child.filter(_.isInstanceOf[Elem]).map(x => {
            x.label.toLowerCase()
          }).mkString(",")
        })
           |}}""".stripMargin
      }).mkString("\n\n"))
    })

  }
}
