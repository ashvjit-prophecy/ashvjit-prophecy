package io.prophecy.pipelines.testperflargetotalnodes.config

import org.apache.spark.sql.SparkSession
case class Context(spark: SparkSession, config: Config)
