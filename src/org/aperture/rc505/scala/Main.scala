package org.aperture.rc505.scala

import javafx.application.Application
import javafx.scene.control.{Button, ScrollPane, TreeView}
import javafx.scene.layout.{HBox, Priority, VBox}
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

  def buttonConfigs(vbox: VBox): HBox = {
    val hbox = new HBox(10)
    val button1 = new Button("Generate")
    button1.setOnAction(_ => XmlParserGenerator.generate())

    val button2 = new Button("Read")
    button2.setOnAction(_ => {
      memoriesCache = XmlParser.read().map(x => new MutableMemory(x))
      updateHBox(vbox, memoriesCache)
    })

    val button3 = new Button("Save")
    button3.setOnAction(_ => {
      XmlWriter.write(memoriesCache.map(_.memory))
    })

    hbox.getChildren.addAll(button1, button2, button3)
    hbox
  }

  def updateHBox(vbox: VBox, memories: List[MutableMemory]): Unit = {
    // Clear previous content except the buttons
    vbox.getChildren.clear()

    val hbox = buttonConfigs(vbox)

    val treeVbox = new VBox()

    treeVbox.getChildren.add(hbox)
    // Add new data
    memories.zipWithIndex.map(mem => {
      val rootItem = TreeUtils.createTreeItem(vbox, mem)
      val treeView = new TreeView[Node](rootItem._1)
      treeView.setPrefHeight(500)
      treeView.setMinHeight(500)
      treeView.setPrefWidth(1000)
      treeView.setMinWidth(1000)
      treeVbox.getChildren.add(treeView)
      rootItem._2
    })

    val scrollPane = new ScrollPane()
    scrollPane.setContent(treeVbox)
    scrollPane.setFitToWidth(true)
    scrollPane.setFitToHeight(true)
    scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS)
    scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER)
    vbox.getChildren.add(scrollPane)
  }
}

class MainApp extends Application {

  override def start(primaryStage: Stage): Unit = {
    primaryStage.setTitle("BOSS RC505 configurator")
    val vbox = new VBox()

    val hbox = buttonConfigs(vbox)

    vbox.getChildren.add(hbox)

    primaryStage.setScene(new Scene(vbox, 1600, 900))
    //      primaryStage.setMaximized(true)
    primaryStage.show()
  }

}