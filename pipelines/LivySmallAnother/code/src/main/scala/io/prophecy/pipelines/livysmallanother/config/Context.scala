package io.prophecy.pipelines.livysmallanother.config

import org.apache.spark.sql.SparkSession
case class Context(spark: SparkSession, config: Config)
