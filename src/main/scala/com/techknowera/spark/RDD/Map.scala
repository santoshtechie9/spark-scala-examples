package com.techknowera.spark.RDD

import com.typesafe.config.ConfigFactory
import org.apache.spark.{SparkConf, SparkContext}

object Map {

  def main(args: Array[String]): Unit = {

  val conf = new SparkConf().setAppName("Map Transformation")
  val sc = new SparkContext(conf)
  val projConfig = ConfigFactory.load()

  val inputDataSet = sc.textFile(projConfig.getString("sparkAppConf.largeInputDataset"))
  val plantEnr = inputDataSet.map(line => line.contains("plant_enr"))
  val plantOpt = inputDataSet.map(line => line.contains("plant_opt"))

  println("plant enr count =" + plantEnr.count())
  println("plant opt count =" + plantOpt.count())

  }
}
