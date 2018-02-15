package com.techknowera.scala.app

import com.typesafe.config.ConfigFactory

object TestConfigFile {
  def main(args: Array[String]): Unit = {
    val projConfig = ConfigFactory.load()

    println("textInputFile = " + projConfig.getString("sparkAppConf.textInputFile"))

  }
}
