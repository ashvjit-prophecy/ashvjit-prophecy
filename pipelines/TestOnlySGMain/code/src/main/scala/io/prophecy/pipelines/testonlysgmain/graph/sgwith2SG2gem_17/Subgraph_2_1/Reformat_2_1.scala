package io.prophecy.pipelines.testonlysgmain.graph.sgwith2SG2gem_17.Subgraph_2_1

import io.prophecy.libs._
import io.prophecy.pipelines.testonlysgmain.udfs.PipelineInitCode._
import io.prophecy.pipelines.testonlysgmain.udfs.UDFs._
import io.prophecy.pipelines.testonlysgmain.graph.sgwith2SG2gem_17.Subgraph_2_1.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Reformat_2_1 {
  def apply(context: Context, in: DataFrame): DataFrame = in
}