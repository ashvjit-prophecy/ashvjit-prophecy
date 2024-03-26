package io.prophecy.pipelines.livysmallpipeline.graph

import io.prophecy.libs._
import io.prophecy.pipelines.livysmallpipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livysmallpipeline.graph.`210Gems_10kLOC`.config._
import io.prophecy.pipelines.livysmallpipeline.graph.`210Gems_10kLOC`.Subgraph_2_1_1_1
import io.prophecy.pipelines.livysmallpipeline.graph.`210Gems_10kLOC`.Subgraph_2_2
import io.prophecy.pipelines.livysmallpipeline.graph.`210Gems_10kLOC`.Subgraph_2_1_1
import io.prophecy.pipelines.livysmallpipeline.graph.`210Gems_10kLOC`.Subgraph_2_1_1_1_2_1_1
import io.prophecy.pipelines.livysmallpipeline.graph.`210Gems_10kLOC`.Subgraph_2_1_1_1_1
import io.prophecy.pipelines.livysmallpipeline.graph.`210Gems_10kLOC`.Subgraph_2_1_1_1_2
import io.prophecy.pipelines.livysmallpipeline.graph.`210Gems_10kLOC`.Subgraph_2
import io.prophecy.pipelines.livysmallpipeline.graph.`210Gems_10kLOC`.Subgraph_2_1_1_1_2_1
import io.prophecy.pipelines.livysmallpipeline.graph.`210Gems_10kLOC`.Subgraph_2_1_2
import io.prophecy.pipelines.livysmallpipeline.graph.`210Gems_10kLOC`.Subgraph_2_1_1_1_1_1
import io.prophecy.pipelines.livysmallpipeline.graph.`210Gems_10kLOC`.Subgraph_2_1
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object `210Gems_10kLOC` {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    val df_Subgraph_2_1_1_1 = Subgraph_2_1_1_1.apply(
      Subgraph_2_1_1_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1),
      in0
    )
    val df_Subgraph_2_2 = Subgraph_2_2.apply(
      Subgraph_2_2.config.Context(context.spark, context.config.Subgraph_2_2),
      in0
    )
    val df_Subgraph_2_1_1 = Subgraph_2_1_1.apply(
      Subgraph_2_1_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1),
      in0
    )
    val df_Subgraph_2_1_1_1_2_1_1 = Subgraph_2_1_1_1_2_1_1.apply(
      Subgraph_2_1_1_1_2_1_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_2_1_1),
      in0
    )
    val df_Subgraph_2_1_1_1_1 = Subgraph_2_1_1_1_1.apply(
      Subgraph_2_1_1_1_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_1),
      in0
    )
    val df_Subgraph_2_1_1_1_2 = Subgraph_2_1_1_1_2.apply(
      Subgraph_2_1_1_1_2.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_2),
      in0
    )
    val df_Subgraph_2 = Subgraph_2.apply(
      Subgraph_2.config.Context(context.spark, context.config.Subgraph_2),
      in0
    )
    val df_Subgraph_2_1_1_1_2_1 = Subgraph_2_1_1_1_2_1.apply(
      Subgraph_2_1_1_1_2_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_2_1),
      in0
    )
    val df_Subgraph_2_1_2 = Subgraph_2_1_2.apply(
      Subgraph_2_1_2.config
        .Context(context.spark, context.config.Subgraph_2_1_2),
      in0
    )
    val df_Subgraph_2_1_1_1_1_1 = Subgraph_2_1_1_1_1_1.apply(
      Subgraph_2_1_1_1_1_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_1_1),
      in0
    )
    val df_Subgraph_2_1 = Subgraph_2_1.apply(
      Subgraph_2_1.config.Context(context.spark, context.config.Subgraph_2_1),
      in0
    )
    df_Subgraph_2_1_1_1_2_1_1
  }

}
