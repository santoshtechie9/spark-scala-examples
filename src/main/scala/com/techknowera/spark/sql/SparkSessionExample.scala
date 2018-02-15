package com.techknowera.spark.sql

import org.apache.spark.sql.SparkSession

object SparkSessionExample extends App {

  val sparkSession = SparkSession.builder().master("local").appName("Spark Session Example").getOrCreate();
  import sparkSession.implicits._

  val dataFrame = sparkSession.read.textFile("")
  dataFrame.show()
  dataFrame.schema.printTreeString()
  sparkSession.stop()

}
