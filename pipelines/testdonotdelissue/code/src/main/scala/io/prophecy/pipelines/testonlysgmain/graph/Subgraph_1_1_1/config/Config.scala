package io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_1_1.config

import io.prophecy.libs._
import pureconfig._
import pureconfig.generic.ProductHint
import org.apache.spark.sql.SparkSession
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_1_1.Subgraph_2_2_1.config.{
  Config => Subgraph_2_2_1_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_1_1.Subgraph_2_1_1_1.config.{
  Config => Subgraph_2_1_1_1_Config
}

object Config {

  implicit val confHint: ProductHint[Config] =
    ProductHint[Config](ConfigFieldMapping(CamelCase, CamelCase))

}

case class Config(
  var Subgraph_2_2_1:   Subgraph_2_2_1_Config = Subgraph_2_2_1_Config(),
  var Subgraph_2_1_1_1: Subgraph_2_1_1_1_Config = Subgraph_2_1_1_1_Config()
) extends ConfigBase

case class Context(spark: SparkSession, config: Config)
