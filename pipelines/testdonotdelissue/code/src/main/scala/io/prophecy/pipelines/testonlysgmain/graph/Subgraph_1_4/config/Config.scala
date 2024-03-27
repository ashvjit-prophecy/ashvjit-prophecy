package io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_4.config

import io.prophecy.libs._
import pureconfig._
import pureconfig.generic.ProductHint
import org.apache.spark.sql.SparkSession
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_4.Subgraph_2_5.config.{
  Config => Subgraph_2_5_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_4.Subgraph_2_1_4.config.{
  Config => Subgraph_2_1_4_Config
}

object Config {

  implicit val confHint: ProductHint[Config] =
    ProductHint[Config](ConfigFieldMapping(CamelCase, CamelCase))

}

case class Config(
  var Subgraph_2_5:   Subgraph_2_5_Config = Subgraph_2_5_Config(),
  var Subgraph_2_1_4: Subgraph_2_1_4_Config = Subgraph_2_1_4_Config()
) extends ConfigBase

case class Context(spark: SparkSession, config: Config)
