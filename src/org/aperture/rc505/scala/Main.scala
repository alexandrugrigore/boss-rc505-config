package org.aperture.rc505.scala

import javafx.application.Application
import javafx.scene.control.{Button, ScrollPane, TreeView}
import javafx.scene.layout.{HBox, VBox}
import javafx.scene.{Node, Scene}
import javafx.stage.Stage
import org.aperture.rc505.scala.MainApp.buttonConfigs

object Main {
  def main(args: Array[String]): Unit = {
    Application.launch(classOf[MainApp], args: _*)
  }
}

class MutableMemory(var memory: Memory)

object MainApp {
  var memoriesCache: List[MutableMemory] = _

  def buttonConfigs(hbox: HBox): (Button, Button, Button) = {
    val button1 = new Button("Generate")
    button1.setOnAction(_ => XmlParserGenerator.generate())

    val button2 = new Button("Read")
    button2.setOnAction(_ => {
      memoriesCache = XmlParser.read().map(x => new MutableMemory(x))
      updateHBox(hbox, memoriesCache)
    })

    val button3 = new Button("Save")
    button3.setOnAction(_ => {
      XmlWriter.write(memoriesCache.map(_.memory))
    })
    (button1, button2, button3)
  }

  def updateHBox(hbox: HBox, memories: List[MutableMemory]): Unit = {
    // Clear previous content except the buttons
    hbox.getChildren.clear()

    val buttons = buttonConfigs(hbox)
    hbox.getChildren.addAll(buttons._1, buttons._2, buttons._3)

    val vbox = new VBox()
    // Add new data
    memories.zipWithIndex.map(mem => {
      val rootItem = TreeUtils.createTreeItem(hbox, mem)
      val treeView = new TreeView[Node](rootItem._1)
      treeView.setPrefHeight(500)
      treeView.setPrefWidth(500)
      treeView.setMinHeight(500)
      treeView.setMinWidth(500)
      vbox.getChildren.add(treeView)
      rootItem._2
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

class MainApp extends Application {
  var hbox: HBox = _

  override def start(primaryStage: Stage): Unit = {
    primaryStage.setTitle("BossRC505!")
    hbox = new HBox(10)

    val buttons = buttonConfigs(hbox)
    hbox.getChildren.addAll(buttons._1, buttons._2, buttons._3)

    primaryStage.setScene(new Scene(hbox, 1600, 900))
    //      primaryStage.setMaximized(true)
    primaryStage.show()
  }

}