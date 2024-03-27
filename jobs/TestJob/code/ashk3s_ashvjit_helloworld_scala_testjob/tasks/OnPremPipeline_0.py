from ashk3s_ashvjit_helloworld_scala_testjob.utils import *

def OnPremPipeline_0():
    from airflow.providers.apache.spark.operators.spark_submit import (SparkSubmitOperator, ) # noqa
    from datetime import timedelta

    return SparkSubmitOperator(
        task_id = "OnPremPipeline_0",
        application = "/mnt/airflow/artifacts/prophecy/artifacts/dev/cp/__PROJECT_ID_PLACEHOLDER__/__PROJECT_RELEASE_VERSION_PLACEHOLDER__/pipeline/TestBasicPipelineJob.jar",
        conf = {
          "spark.prophecy.metadata.job.uri": "__PROJECT_ID_PLACEHOLDER__/jobs/TestJob", 
          "spark.prophecy.metadata.is.interactive.run": "false", 
          "spark.prophecy.metadata.fabric.id": "33", 
          "spark.prophecy.tasks": "{}", 
          "spark.prophecy.metadata.url": "__PROPHECY_URL_PLACEHOLDER__", 
          "spark.prophecy.metadata.user.id": "3", 
          "spark.submit.deployMode": "cluster", 
          "spark.prophecy.project.id": "__PROJECT_ID_PLACEHOLDER__", 
          "spark.prophecy.execution.metrics.disabled": "true", 
          "spark.prophecy.metadata.job.branch": "__PROJECT_RELEASE_VERSION_PLACEHOLDER__", 
          "spark.prophecy.execution.service.url": "wss://ashk3s.dev.cloud.prophecy.io/execution/eventws"
        },
        files = "",
        py_files = "",
        jars = "https://prophecydevpublic.blob.core.windows.net/libs/prophecy-libs-assembly-3.3.0-7.1.83-SNAPSHOT.jar,/mnt/airflow/artifacts/prophecy/artifacts/dev/cp/__PROJECT_ID_PLACEHOLDER__/__PROJECT_RELEASE_VERSION_PLACEHOLDER__/pipeline/TestBasicPipelineJob.jar",
        java_class = "io.prophecy.pipelines.testbasicpipelinejob.Main",
        packages = None,
        executor_cores = 2,
        executor_memory = "2g",
        num_executors = 2,
        driver_memory = "2g",
        name = "ProphecyTestrun",
        proxy_user = None,
        keytab = None,
        principal = None,
    )
