import sbt.Keys._

scalaVersion := "2.11.11"

libraryDependencies += "net.codingwell" %% "scala-guice" % "4.1.0"
libraryDependencies += "io.swagger" %% "swagger-play2" % "1.5.3"

// The Play project itself
lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """sample-swagger"""
  )

