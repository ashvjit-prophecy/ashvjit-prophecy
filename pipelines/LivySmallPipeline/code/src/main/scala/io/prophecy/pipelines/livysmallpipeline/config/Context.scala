package io.prophecy.pipelines.livysmallpipeline.config

import org.apache.spark.sql.SparkSession
case class Context(spark: SparkSession, config: Config)
