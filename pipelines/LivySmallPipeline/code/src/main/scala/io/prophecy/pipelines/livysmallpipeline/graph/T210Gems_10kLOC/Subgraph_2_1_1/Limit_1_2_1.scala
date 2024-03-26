package io.prophecy.pipelines.livysmallpipeline.graph.T210Gems_10kLOC.Subgraph_2_1_1

import io.prophecy.libs._
import io.prophecy.pipelines.livysmallpipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livysmallpipeline.udfs.UDFs._
import io.prophecy.pipelines.livysmallpipeline.graph.T210Gems_10kLOC.Subgraph_2_1_1.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Limit_1_2_1 {
  def apply(context: Context, in: DataFrame): DataFrame = in.limit(10)
}
