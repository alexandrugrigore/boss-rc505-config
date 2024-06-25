package org.aperture.rc505.scala

import javafx.scene.Node
import javafx.scene.control.{Button, Label, TextField, TreeItem}
import javafx.scene.layout.{HBox, VBox}

object TreeUtils {

  private def createInnerTreeItem(trackName: String, track: Product): TreeItem[Node] = {
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

  def createTreeItem(vbox: VBox, memoryZip: (MutableMemory, Int)): (TreeItem[Node], Memory) = {
    val mutableMemory = memoryZip._1

    val fieldBox = new HBox(10)
    val nameTextField = new TextField(s"${Utils.parseName(mutableMemory.memory.name)}")
    nameTextField.setOnAction(_ => {
      mutableMemory.memory = mutableMemory.memory.copy(name = Utils.nameToConfig(nameTextField.getText))
    })
    fieldBox.getChildren.add(new Label(s"${(memoryZip._2 + 1).toString}"))
    fieldBox.getChildren.add(nameTextField)

    val copyButton = new Button("Copy all configs to all 'INIT MEMORY'")
    copyButton.setOnAction(_ => {
      Utils.copyMemory(mutableMemory)
      MainApp.updateHBox(vbox, MainApp.memoriesCache)
    })

    fieldBox.getChildren.add(copyButton)
    val rootItem = new TreeItem[Node](fieldBox)
    rootItem.setExpanded(true)

    val fields =  mutableMemory.memory.productElementNames.zip( mutableMemory.memory.productIterator)
    fields.foreach { case (fieldName, fieldValue: Product) =>
      rootItem.getChildren.add(createInnerTreeItem(fieldName, fieldValue))
    }

    (rootItem,  mutableMemory.memory)
  }
}