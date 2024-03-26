package io.prophecy.pipelines.testperf4.graph.T21Gems1000LOC

import io.prophecy.libs._
import io.prophecy.pipelines.testperf4.udfs.PipelineInitCode._
import io.prophecy.pipelines.testperf4.udfs.UDFs._
import io.prophecy.pipelines.testperf4.graph.T21Gems1000LOC.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Repartition_1_1 {
  def apply(context: Context, in: DataFrame): DataFrame = in.coalesce(10)
}
