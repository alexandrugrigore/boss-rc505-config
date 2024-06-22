package org.aperture.rc505.scala.launcher

import com.lucidchart.open.xtract.{ParseSuccess, XmlReader}

import scala.xml.{Elem, Node, XML}

object XmlParser {

  def read() = {
    val xmlFile = "resources/MEMORY.RC0"
    val xml = XML.loadFile(xmlFile)

    val memories = (xml \\ "mem").toList

    memories.flatMap { node =>
      XmlReader.of[Memory].read(node) match {
        case ParseSuccess(memory) => Some(memory)
        case _ => None
      }
    }
  }

}
