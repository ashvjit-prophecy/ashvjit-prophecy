package io.prophecy.pipelines.livyscalapipeline.graph

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_9.config._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object Subgraph_9 {

  def apply(context: Context, in: DataFrame): DataFrame = {
    val df_Reformat_1_1      = Reformat_1_1(context,      in)
    val df_FlattenSchema_1_1 = FlattenSchema_1_1(context, df_Reformat_1_1)
    df_FlattenSchema_1_1
  }

}
