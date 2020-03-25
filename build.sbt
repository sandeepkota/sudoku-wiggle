lazy val root = (project in file(".")).
settings(
  name := "sudoku-wiggle",
  version := "0.0.1",
  scalaVersion := "2.12.11",
  mainClass := Some("Main")
)
