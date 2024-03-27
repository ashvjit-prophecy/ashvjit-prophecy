package io.prophecy.pipelines.testonlysgmain.graph

import io.prophecy.libs._
import io.prophecy.pipelines.testonlysgmain.udfs.PipelineInitCode._
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_3.config._
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_3.Subgraph_2_4
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_3.Subgraph_2_1_3
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object Subgraph_1_3 {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    val df_Reformat_1_3 = Reformat_1_3(context, in0)
    val df_Filter_1_3   = Filter_1_3(context,   df_Reformat_1_3)
    val df_Subgraph_2_4 = Subgraph_2_4.apply(
      Subgraph_2_4.config.Context(context.spark, context.config.Subgraph_2_4),
      df_Filter_1_3
    )
    val df_Subgraph_2_1_3 = Subgraph_2_1_3.apply(
      Subgraph_2_1_3.config
        .Context(context.spark, context.config.Subgraph_2_1_3),
      df_Subgraph_2_4
    )
    df_Subgraph_2_1_3
  }

}
