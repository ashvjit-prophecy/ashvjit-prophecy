package io.prophecy.pipelines.livysmallpipeline.config

import pureconfig._
import pureconfig.generic.ProductHint
import io.prophecy.libs._
import io.prophecy.pipelines.livysmallpipeline.graph.Subgraph_0.config.{
  Config => Subgraph_0_Config
}

case class Config(
  var Subgraph_0:   Subgraph_0_Config = Subgraph_0_Config(),
  var Subgraph_1_1: SUBGRAPH_1_1 = SUBGRAPH_1_1()
) extends ConfigBase
