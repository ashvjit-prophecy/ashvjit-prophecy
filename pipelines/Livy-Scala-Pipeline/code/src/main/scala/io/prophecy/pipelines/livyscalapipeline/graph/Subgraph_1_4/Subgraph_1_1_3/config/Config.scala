package io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1_4.Subgraph_1_1_3.config

import io.prophecy.libs._
import pureconfig._
import pureconfig.generic.ProductHint
import org.apache.spark.sql.SparkSession
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1_4.Subgraph_1_1_3.Subgraph_1_1_1_1.config.{
  Config => Subgraph_1_1_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1_4.Subgraph_1_1_3.Subgraph_1_2_2.config.{
  Config => Subgraph_1_2_2_Config
}

object Config {

  implicit val confHint: ProductHint[Config] =
    ProductHint[Config](ConfigFieldMapping(CamelCase, CamelCase))

}

case class Config(
  var Subgraph_1_2_2:   Subgraph_1_2_2_Config = Subgraph_1_2_2_Config(),
  var Subgraph_1_1_1_1: Subgraph_1_1_1_1_Config = Subgraph_1_1_1_1_Config()
) extends ConfigBase

case class Context(spark: SparkSession, config: Config)
