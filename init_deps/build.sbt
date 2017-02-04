
scalaVersion := "2.12.1"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.3")

libraryDependencies ++= Seq(
      "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
      "ch.qos.logback" % "logback-classic" % "1.1.9",

      //Selenium (using Scalatest DSL)
      "org.seleniumhq.selenium" % "selenium-java" % "2.53.1",
      "org.scalactic" %% "scalactic" % "3.0.1",
      "org.scalatest" %% "scalatest" % "3.0.1",
      "com.codeborne" % "phantomjsdriver" % "1.3.0",

      //Guice DI
      "net.codingwell" %% "scala-guice" % "4.1.0",

      //Cucumber
      "info.cukes" %% "cucumber-scala" % "1.2.5",
      "info.cukes" % "cucumber-guice" % "1.2.5" exclude("info.cukes", "cucumber-java"),

      //JUnit Runner (for cucumber)
      "info.cukes" % "cucumber-junit" % "1.2.5",
      "junit" % "junit" % "4.12",
      "com.novocode" % "junit-interface" % "0.11")
