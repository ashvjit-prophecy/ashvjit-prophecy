package io.prophecy.pipelines.livyscalapipeline.graph.T210Gem_10kLoc.Subgraph_2_1_1_1_2

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.udfs.UDFs._
import io.prophecy.pipelines.livyscalapipeline.graph.T210Gem_10kLoc.Subgraph_2_1_1_1_2.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Filter_1_2_1_1_2 {
  def apply(context: Context, in: DataFrame): DataFrame = in.filter(lit(true))
}