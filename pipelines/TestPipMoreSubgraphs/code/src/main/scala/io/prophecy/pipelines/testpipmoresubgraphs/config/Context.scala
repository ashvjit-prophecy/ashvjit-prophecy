package io.prophecy.pipelines.testpipmoresubgraphs.config

import org.apache.spark.sql.SparkSession
case class Context(spark: SparkSession, config: Config)
