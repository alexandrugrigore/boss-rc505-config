package org.aperture.rc505.scala.launcher

import javafx.scene.Node
import javafx.scene.control.{Label, TextField, TreeItem}
import javafx.scene.layout.HBox

object TreeUtils {

  def createTrackTreeItem(trackName: String, track: Product): TreeItem[Node] = {
    val trackItem = new TreeItem[Node](new Label(trackName))
    val fields = track.productElementNames.zip(track.productIterator)

    fields.foreach { case (fieldName, fieldValue) =>
      val fieldBox = new HBox(10)
      fieldBox.getChildren.add(new Label(fieldName))

      fieldValue match {
        case intValue: Int =>
          val textField = new TextField(intValue.toString)
          fieldBox.getChildren.add(textField)
        case _ =>
          fieldBox.getChildren.add(new Label(fieldValue.toString))
      }

      trackItem.getChildren.add(new TreeItem[Node](fieldBox))
    }

    trackItem
  }

  def createTreeItem(memory: Memory): TreeItem[Node] = {
    val rootItem = new TreeItem[Node](new Label("Memory"))

    val fields = memory.productElementNames.zip(memory.productIterator)
    fields.foreach { case (fieldName, fieldValue: Product) =>
      rootItem.getChildren.add(createTrackTreeItem(fieldName, fieldValue))
    }

    rootItem
  }
}