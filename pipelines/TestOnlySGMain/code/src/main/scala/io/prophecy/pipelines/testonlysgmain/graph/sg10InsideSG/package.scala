package io.prophecy.pipelines.testonlysgmain.graph

import io.prophecy.libs._
import io.prophecy.pipelines.testonlysgmain.udfs.PipelineInitCode._
import io.prophecy.pipelines.testonlysgmain.graph.sg10InsideSG.config._
import io.prophecy.pipelines.testonlysgmain.graph.sg10InsideSG.Subgraph_13
import io.prophecy.pipelines.testonlysgmain.graph.sg10InsideSG.Subgraph_14
import io.prophecy.pipelines.testonlysgmain.graph.sg10InsideSG.Subgraph_15
import io.prophecy.pipelines.testonlysgmain.graph.sg10InsideSG.Subgraph_16
import io.prophecy.pipelines.testonlysgmain.graph.sg10InsideSG.Subgraph_17
import io.prophecy.pipelines.testonlysgmain.graph.sg10InsideSG.Subgraph_18
import io.prophecy.pipelines.testonlysgmain.graph.sg10InsideSG.Subgraph_19
import io.prophecy.pipelines.testonlysgmain.graph.sg10InsideSG.Subgraph_20
import io.prophecy.pipelines.testonlysgmain.graph.sg10InsideSG.Subgraph_21
import io.prophecy.pipelines.testonlysgmain.graph.sg10InsideSG.Subgraph_22
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object sg10InsideSG {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    val df_Subgraph_13 = Subgraph_13.apply(
      Subgraph_13.config.Context(context.spark, context.config.Subgraph_13),
      in0
    )
    val df_Subgraph_14 = Subgraph_14.apply(
      Subgraph_14.config.Context(context.spark, context.config.Subgraph_14),
      df_Subgraph_13
    )
    val df_Subgraph_15 = Subgraph_15.apply(
      Subgraph_15.config.Context(context.spark, context.config.Subgraph_15),
      df_Subgraph_14
    )
    val df_Subgraph_16 = Subgraph_16.apply(
      Subgraph_16.config.Context(context.spark, context.config.Subgraph_16),
      df_Subgraph_15
    )
    val df_Subgraph_17 = Subgraph_17.apply(
      Subgraph_17.config.Context(context.spark, context.config.Subgraph_17),
      df_Subgraph_16
    )
    val df_Subgraph_18 = Subgraph_18.apply(
      Subgraph_18.config.Context(context.spark, context.config.Subgraph_18),
      df_Subgraph_17
    )
    val df_Subgraph_19 = Subgraph_19.apply(
      Subgraph_19.config.Context(context.spark, context.config.Subgraph_19),
      df_Subgraph_18
    )
    val df_Subgraph_20 = Subgraph_20.apply(
      Subgraph_20.config.Context(context.spark, context.config.Subgraph_20),
      df_Subgraph_19
    )
    val df_Subgraph_21 = Subgraph_21.apply(
      Subgraph_21.config.Context(context.spark, context.config.Subgraph_21),
      df_Subgraph_20
    )
    val df_Subgraph_22 = Subgraph_22.apply(
      Subgraph_22.config.Context(context.spark, context.config.Subgraph_22),
      df_Subgraph_21
    )
    df_Subgraph_22
  }

}
