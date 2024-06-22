ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.14"

lazy val root = (project in file("."))
  .settings(
    name := "rc505-config"
  )

// Custom source directory paths
unmanagedSourceDirectories in Compile := Seq(baseDirectory.value / "src")

// Custom test directory paths
unmanagedSourceDirectories in Test := Seq(baseDirectory.value / "test")

libraryDependencies ++= Seq(
  "com.lucidchart" %% "xtract" % "2.3.0",
  "org.openjfx" % "javafx-controls" % "17.0.2",
  "org.openjfx" % "javafx-fxml" % "17.0.2"
)