package io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1_4_1.config

import io.prophecy.libs._
import pureconfig._
import pureconfig.generic.ProductHint
import org.apache.spark.sql.SparkSession
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1_4_1.Subgraph_1_1_3_1.config.{
  Config => Subgraph_1_1_3_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1_4_1.Subgraph_1_3_1_1.config.{
  Config => Subgraph_1_3_1_1_Config
}

object Config {

  implicit val confHint: ProductHint[Config] =
    ProductHint[Config](ConfigFieldMapping(CamelCase, CamelCase))

}

case class Config(
  var Subgraph_1_1_3_1: Subgraph_1_1_3_1_Config = Subgraph_1_1_3_1_Config(),
  var Subgraph_1_3_1_1: Subgraph_1_3_1_1_Config = Subgraph_1_3_1_1_Config()
) extends ConfigBase

case class Context(spark: SparkSession, config: Config)
