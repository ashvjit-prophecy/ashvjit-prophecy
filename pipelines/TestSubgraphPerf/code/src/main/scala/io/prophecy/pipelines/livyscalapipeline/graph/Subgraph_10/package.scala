package io.prophecy.pipelines.livyscalapipeline.graph

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_10.config._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object Subgraph_10 {

  def apply(context: Context, in: DataFrame): DataFrame = {
    val df_Aggregate_1      = Aggregate_1(context,      in)
    val df_WindowFunction_1 = WindowFunction_1(context, df_Aggregate_1)
    df_WindowFunction_1
  }

}
