package com.techknowera.spark.app

import java.io.File

import org.apache.spark.{SparkConf, SparkContext}

object InitializeSparkContext {

  def createSparkContext(): SparkContext = {

    val conf = new SparkConf().setAppName("Spark Initialization")
    val sc = new SparkContext(conf)
    return sc

  }
}
