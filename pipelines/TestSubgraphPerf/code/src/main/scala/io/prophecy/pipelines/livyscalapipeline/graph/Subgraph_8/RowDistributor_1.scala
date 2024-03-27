package io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_8

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.udfs.UDFs._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_8.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object RowDistributor_1 {

  def apply(context: Context, in: DataFrame): (DataFrame, DataFrame) =
    (in.filter(col("value").isNotNull),
     in.filter(
       (col("c_array_int") > lit(-10)).and(col("c_array_string").isNotNull)
     )
    )

}
