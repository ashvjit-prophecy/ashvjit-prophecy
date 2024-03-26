package io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1_1

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.udfs.UDFs._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1_1.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object OrderBy_2 {

  def apply(context: Context, in: DataFrame): DataFrame =
    in.orderBy(col("industry_code_ANZSIC").desc, col("variable").asc)

}
