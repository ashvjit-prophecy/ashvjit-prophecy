package io.prophecy.pipelines.livysmallpipeline.config

import pureconfig._
import pureconfig.generic.ProductHint
import io.prophecy.libs._
import io.prophecy.pipelines.livysmallpipeline.graph.Subgraph_0.config.{
  Config => Subgraph_0_Config
}
import io.prophecy.pipelines.livysmallpipeline.graph.Subgraph_1.config.{
  Config => Subgraph_1_Config
}
import io.prophecy.pipelines.livysmallpipeline.graph.sg100gems.config.{
  Config => sg100gems_Config
}

case class Config(
  var Subgraph_0: Subgraph_0_Config = Subgraph_0_Config(),
  var Subgraph_1: Subgraph_1_Config = Subgraph_1_Config(),
  var sg100gems:  sg100gems_Config = sg100gems_Config()
) extends ConfigBase
