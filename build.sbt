lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """play-scala-Shipments""",
    organization := "com.example",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.13.8",

     libraryDependencies ++= Seq(
      guice,
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,
      "com.typesafe.play" %% "play-slick" % "5.0.0",
      "com.typesafe.slick" %% "slick-codegen" % "3.3.3",
      "com.typesafe.slick" %% "slick-hikaricp" % "3.3.3",
      "org.postgresql" % "postgresql" % "42.2.16"
    ),

    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-Xfatal-warnings"
    )
  )
