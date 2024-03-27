package io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_12.config

import io.prophecy.libs._
import pureconfig._
import pureconfig.generic.ProductHint
import org.apache.spark.sql.SparkSession
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_12.Subgraph_13.config.{
  Config => Subgraph_13_Config
}
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_12.Subgraph_14.config.{
  Config => Subgraph_14_Config
}
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_12.Subgraph_15.config.{
  Config => Subgraph_15_Config
}
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_12.Subgraph_16.config.{
  Config => Subgraph_16_Config
}
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_12.Subgraph_17.config.{
  Config => Subgraph_17_Config
}
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_12.Subgraph_18.config.{
  Config => Subgraph_18_Config
}
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_12.Subgraph_19.config.{
  Config => Subgraph_19_Config
}
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_12.Subgraph_20.config.{
  Config => Subgraph_20_Config
}
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_12.Subgraph_21.config.{
  Config => Subgraph_21_Config
}
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_12.Subgraph_22.config.{
  Config => Subgraph_22_Config
}

object Config {

  implicit val confHint: ProductHint[Config] =
    ProductHint[Config](ConfigFieldMapping(CamelCase, CamelCase))

}

case class Config(
  var Subgraph_13: Subgraph_13_Config = Subgraph_13_Config(),
  var Subgraph_14: Subgraph_14_Config = Subgraph_14_Config(),
  var Subgraph_15: Subgraph_15_Config = Subgraph_15_Config(),
  var Subgraph_16: Subgraph_16_Config = Subgraph_16_Config(),
  var Subgraph_17: Subgraph_17_Config = Subgraph_17_Config(),
  var Subgraph_18: Subgraph_18_Config = Subgraph_18_Config(),
  var Subgraph_19: Subgraph_19_Config = Subgraph_19_Config(),
  var Subgraph_20: Subgraph_20_Config = Subgraph_20_Config(),
  var Subgraph_21: Subgraph_21_Config = Subgraph_21_Config(),
  var Subgraph_22: Subgraph_22_Config = Subgraph_22_Config()
) extends ConfigBase

case class Context(spark: SparkSession, config: Config)
