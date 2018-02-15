package com.techknowera.spark.sql

import org.apache.spark.sql.SparkSession

object DataFrameSchemaExample extends App{

  val sparkSession = SparkSession.builder().master("local").appName("DataFrame Schama").getOrCreate()
  import sparkSession.implicits._

}
