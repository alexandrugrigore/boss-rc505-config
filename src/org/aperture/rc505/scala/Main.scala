package org.aperture.rc505.scala

import javafx.application.Application
import javafx.scene.{Node, Scene}
import javafx.scene.control.{Button, ScrollPane, TreeView}
import javafx.scene.layout.{HBox, VBox}
import javafx.stage.Stage

object Main {
  def main(args: Array[String]): Unit = {
    Application.launch(classOf[MainApp], args: _*)
  }
}

class MainApp extends Application {
    var hbox: HBox = _

    override def start(primaryStage: Stage): Unit = {
      primaryStage.setTitle("BossRC505!")
      val button1 = new Button("Generate")
      button1.setOnAction(_ => XmlParserGenerator.generate())

      var x: List[Memory] = List()
      val button2 = new Button("Read")
      button2.setOnAction(_ => {
        x = XmlParser.read()
        updateHBox(x)
      })

      hbox = new HBox(10)
      hbox.getChildren.addAll(button1, button2)

      primaryStage.setScene(new Scene(hbox, 1600, 900))
//      primaryStage.setMaximized(true)
      primaryStage.show()
    }

    def updateHBox(memories: List[Memory]): Unit = {
      // Clear previous content except the buttons
      hbox.getChildren.clear()
      val button1 = new Button("Generate")
      button1.setOnAction(_ => XmlParserGenerator.generate())
      val button2 = new Button("Read")
      button2.setOnAction(_ => {
        val x = XmlParser.read()
        updateHBox(x)
      })
      hbox.getChildren.addAll(button1, button2)


      val vbox = new VBox()
      // Add new data
      memories.zipWithIndex.foreach(mem => {
        val rootItem = TreeUtils.createTreeItem(mem)
        val treeView = new TreeView[Node](rootItem)
        treeView.setPrefHeight(500) // Set your desired height
        treeView.setPrefWidth(500) // Set your desired width
        treeView.setMinHeight(500) // Ensure maximum height
        treeView.setMinWidth(500) // Ensure maximum width+
        vbox.getChildren.add(treeView)
      })
      val scrollPane = new ScrollPane()
      scrollPane.setContent(vbox)
      scrollPane.setFitToWidth(true)
      scrollPane.setFitToHeight(true)
      scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS)
      scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER)
      hbox.getChildren.add(scrollPane)
    }
}