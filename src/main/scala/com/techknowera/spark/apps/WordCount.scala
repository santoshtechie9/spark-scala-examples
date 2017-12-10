package com.techknowera.spark.apps

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by santo on 11/26/2017.
  */
object WordCount extends App{

  val inputFile = "C:\\Users\\santo\\Desktop\\new3.txt"
  val conf = new SparkConf().setMaster("local[*]").setAppName("WordCount")
  val sc = new SparkContext(conf)

  val input = sc.textFile(inputFile)

  println("total line = " + input.count())

}
