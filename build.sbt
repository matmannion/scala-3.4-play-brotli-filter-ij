ThisBuild / scalaVersion := "3.4.2"

libraryDependencies ++= Seq(
  "com.gu" %% "play-v30-brotli-filter" % "0.16.1",
)

lazy val root = project in file(".")
