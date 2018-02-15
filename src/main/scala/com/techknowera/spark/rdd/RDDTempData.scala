package com.techknowera.spark.rdd

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by santo on 1/21/2018.
  */
object RDDTempData extends App{

  val conf = new SparkConf().setAppName("TempData").setMaster("local[1]")
  val sc = new SparkContext(conf)

  val lines = sc.textFile("C:\\Users\\santo\\Documents\\git\\apache-spark-examples\\src\\main\\resources\\TX417945_8515.csv").filter(!_.contains("Source")).filter(!_.contains("Day"))
  val data = lines.flatMap ( line => {
    val p = line.split(",")
    p(0)+p(1)+p(2)
  }
  )

  data.take(9).foreach(x => println(x.toString))

}
