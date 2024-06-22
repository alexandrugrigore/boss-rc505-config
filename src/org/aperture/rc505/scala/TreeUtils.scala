package org.aperture.rc505.scala

import javafx.scene.Node
import javafx.scene.control.{Button, Label, TextField, TreeItem}
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

  def createTreeItem(memoryZip: (Memory, Int)): TreeItem[Node] = {
    val memory = memoryZip._1
    val fieldBox = new HBox(10)
    fieldBox.getChildren.add(new Label(memoryZip._2.toString))

    val copyButton = new Button("Copy to all")
    copyButton.setOnAction(_ => print("Copy"))

    fieldBox.getChildren.add(copyButton)
    val rootItem = new TreeItem[Node](fieldBox)

    val fields = memory.productElementNames.zip(memory.productIterator)
    fields.foreach { case (fieldName, fieldValue: Product) =>
      rootItem.getChildren.add(createTrackTreeItem(fieldName, fieldValue))
    }

    rootItem
  }
}