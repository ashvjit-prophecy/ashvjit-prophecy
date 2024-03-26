package io.prophecy.pipelines.livysmallpipeline.config

import pureconfig._
import pureconfig.generic.ProductHint
import io.prophecy.libs._
import io.prophecy.pipelines.livysmallpipeline.graph.sgScriptWith5ScriptEachHaving1000LOC.config.{
  Config => sgScriptWith5ScriptEachHaving1000LOC_Config
}
import io.prophecy.pipelines.livysmallpipeline.graph.T210Gems_10kLOC.config.{
  Config => T210Gems_10kLOC_Config
}
import io.prophecy.pipelines.livysmallpipeline.graph.sgScriptWith5ScriptEachHaving1000LOC_1.config.{
  Config => sgScriptWith5ScriptEachHaving1000LOC_1_Config
}
import io.prophecy.pipelines.livysmallpipeline.graph.sg100gems.config.{
  Config => sg100gems_Config
}
import io.prophecy.pipelines.livysmallpipeline.graph.sgScriptWith5ScriptEachHaving1000LOC_2.config.{
  Config => sgScriptWith5ScriptEachHaving1000LOC_2_Config
}
import io.prophecy.pipelines.livysmallpipeline.graph.T21Gems1000LOC.config.{
  Config => T21Gems1000LOC_Config
}
import io.prophecy.pipelines.livysmallpipeline.graph.sgScriptWith5ScriptEachHaving1000LOC_1_1.config.{
  Config => sgScriptWith5ScriptEachHaving1000LOC_1_1_Config
}

case class Config(
  var T21Gems1000LOC:  T21Gems1000LOC_Config = T21Gems1000LOC_Config(),
  var T210Gems_10kLOC: T210Gems_10kLOC_Config = T210Gems_10kLOC_Config(),
  var sg100gems:       sg100gems_Config = sg100gems_Config(),
  var sgScriptWith5ScriptEachHaving1000LOC: sgScriptWith5ScriptEachHaving1000LOC_Config =
    sgScriptWith5ScriptEachHaving1000LOC_Config(),
  var sgScriptWith5ScriptEachHaving1000LOC_1: sgScriptWith5ScriptEachHaving1000LOC_1_Config =
    sgScriptWith5ScriptEachHaving1000LOC_1_Config(),
  var sgScriptWith5ScriptEachHaving1000LOC_2: sgScriptWith5ScriptEachHaving1000LOC_2_Config =
    sgScriptWith5ScriptEachHaving1000LOC_2_Config(),
  var sgScriptWith5ScriptEachHaving1000LOC_1_1: sgScriptWith5ScriptEachHaving1000LOC_1_1_Config =
    sgScriptWith5ScriptEachHaving1000LOC_1_1_Config()
) extends ConfigBase
