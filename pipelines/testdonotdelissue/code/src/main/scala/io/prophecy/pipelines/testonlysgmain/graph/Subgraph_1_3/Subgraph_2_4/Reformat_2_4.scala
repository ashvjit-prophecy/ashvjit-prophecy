package io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_3.Subgraph_2_4

import io.prophecy.libs._
import io.prophecy.pipelines.testonlysgmain.udfs.PipelineInitCode._
import io.prophecy.pipelines.testonlysgmain.udfs.UDFs._
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_3.Subgraph_2_4.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Reformat_2_4 {
  def apply(context: Context, in: DataFrame): DataFrame = in
}