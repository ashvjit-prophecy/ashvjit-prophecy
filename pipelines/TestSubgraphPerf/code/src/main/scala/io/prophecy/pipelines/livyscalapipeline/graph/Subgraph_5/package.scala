package io.prophecy.pipelines.livyscalapipeline.graph

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_5.config._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object Subgraph_5 {

  def apply(context: Context, in: DataFrame): Subgraph2 = {
    val df_Filter_1  = Filter_1(context,  in)
    val df_OrderBy_1 = OrderBy_1(context, df_Filter_1)
    (df_OrderBy_1, df_OrderBy_1)
  }

}
