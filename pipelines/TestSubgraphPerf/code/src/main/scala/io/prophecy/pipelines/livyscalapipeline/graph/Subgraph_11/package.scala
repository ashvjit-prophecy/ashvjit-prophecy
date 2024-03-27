package io.prophecy.pipelines.livyscalapipeline.graph

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_11.config._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object Subgraph_11 {

  def apply(context: Context, in0: DataFrame, in10: DataFrame): DataFrame = {
    val df_SQLStatement_1 = SQLStatement_1(context, in0, in10)
    val df_Script_1       = Script_1(context,       df_SQLStatement_1)
    df_Script_1
  }

}
