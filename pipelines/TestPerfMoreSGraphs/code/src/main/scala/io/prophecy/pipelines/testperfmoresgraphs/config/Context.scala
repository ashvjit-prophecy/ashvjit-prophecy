package io.prophecy.pipelines.testperfmoresgraphs.config

import org.apache.spark.sql.SparkSession
case class Context(spark: SparkSession, config: Config)
