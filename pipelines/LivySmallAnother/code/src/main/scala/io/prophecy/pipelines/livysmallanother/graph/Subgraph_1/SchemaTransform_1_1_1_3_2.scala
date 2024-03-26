package io.prophecy.pipelines.livysmallanother.graph.Subgraph_1

import io.prophecy.libs._
import io.prophecy.pipelines.livysmallanother.udfs.PipelineInitCode._
import io.prophecy.pipelines.livysmallanother.udfs.UDFs._
import io.prophecy.pipelines.livysmallanother.graph.Subgraph_1.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object SchemaTransform_1_1_1_3_2 {
  def apply(context: Context, in: DataFrame): DataFrame = in
}
