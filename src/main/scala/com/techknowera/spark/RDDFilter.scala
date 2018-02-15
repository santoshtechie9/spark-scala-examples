package com.techknowera.spark.apps.rdd

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by santo on 2/7/2018.
  */
object RDDFilter extends App{

  val conf = new SparkConf().setAppName("RDD Filter").setMaster("local[*]")
  val sc = new SparkContext(conf)

  val lines = sc.textFile("C:\\Users\\santo\\Documents\\git\\apache-spark-examples\\src\\main\\resources\\MN212142_9392.csv")

  val filterFirstLine = lines.filter(!_.contains("Day"))

  filterFirstLine.take(9) foreach println

}
