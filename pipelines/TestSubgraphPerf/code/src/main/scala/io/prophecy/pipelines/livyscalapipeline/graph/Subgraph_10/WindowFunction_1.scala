package io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_10

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.udfs.UDFs._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_10.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object WindowFunction_1 {

  def apply(context: Context, in: DataFrame): DataFrame = {
    import org.apache.spark.sql.expressions.{Window, WindowSpec}
    in.withColumn("rme_size_grp",
                  row_number().over(
                    Window
                      .partitionBy(col("year"),
                                   col("industry_code_ANZSIC_1"),
                                   col("value")
                      )
                      .orderBy(col("industry_name_ANZSIC").asc)
                  )
      )
      .withColumn("variable",
                  row_number().over(
                    Window
                      .partitionBy(col("year"),
                                   col("industry_code_ANZSIC_1"),
                                   col("value")
                      )
                      .orderBy(col("industry_name_ANZSIC").asc)
                  )
      )
  }

}
