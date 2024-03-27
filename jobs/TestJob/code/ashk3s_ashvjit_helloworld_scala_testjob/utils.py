from airflow.decorators import task

db_pipeline_id_to_path_dict = {
    "pipelines/TestBasicPipelineJob": "dbfs:/FileStore/prophecy/artifacts/dev/cp/__PROJECT_ID_PLACEHOLDER__/__PROJECT_RELEASE_VERSION_PLACEHOLDER__/pipeline/TestBasicPipelineJob.jar", 
    "pipelines/TestPerfMoreSGraphs": "dbfs:/FileStore/prophecy/artifacts/dev/cp/__PROJECT_ID_PLACEHOLDER__/__PROJECT_RELEASE_VERSION_PLACEHOLDER__/pipeline/TestPerfMoreSGraphs.jar", 
    "pipelines/TestPerfLargeTotalNodes": "dbfs:/FileStore/prophecy/artifacts/dev/cp/__PROJECT_ID_PLACEHOLDER__/__PROJECT_RELEASE_VERSION_PLACEHOLDER__/pipeline/TestPerfLargeTotalNodes.jar", 
    "pipelines/testdonotdelissue": "dbfs:/FileStore/prophecy/artifacts/dev/cp/__PROJECT_ID_PLACEHOLDER__/__PROJECT_RELEASE_VERSION_PLACEHOLDER__/pipeline/testdonotdelissue.jar", 
    "pipelines/TestOnlySGMain": "dbfs:/FileStore/prophecy/artifacts/dev/cp/__PROJECT_ID_PLACEHOLDER__/__PROJECT_RELEASE_VERSION_PLACEHOLDER__/pipeline/TestOnlySGMain.jar", 
    "pipelines/TestSubgraphPerf": "dbfs:/FileStore/prophecy/artifacts/dev/cp/__PROJECT_ID_PLACEHOLDER__/__PROJECT_RELEASE_VERSION_PLACEHOLDER__/pipeline/TestSubgraphPerf.jar", 
    "pipelines/TestPipMoreSubgraphs": "dbfs:/FileStore/prophecy/artifacts/dev/cp/__PROJECT_ID_PLACEHOLDER__/__PROJECT_RELEASE_VERSION_PLACEHOLDER__/pipeline/TestPipMoreSubgraphs.jar", 
    "pipelines/TestPerf4": "dbfs:/FileStore/prophecy/artifacts/dev/cp/__PROJECT_ID_PLACEHOLDER__/__PROJECT_RELEASE_VERSION_PLACEHOLDER__/pipeline/TestPerf4.jar", 
    "pipelines/TestPerfPip2Simpler": "dbfs:/FileStore/prophecy/artifacts/dev/cp/__PROJECT_ID_PLACEHOLDER__/__PROJECT_RELEASE_VERSION_PLACEHOLDER__/pipeline/TestPerfPip2Simpler.jar", 
    "pipelines/TestPerfPip1": "dbfs:/FileStore/prophecy/artifacts/dev/cp/__PROJECT_ID_PLACEHOLDER__/__PROJECT_RELEASE_VERSION_PLACEHOLDER__/pipeline/TestPerfPip1.jar", 
    "pipelines/LivySmallAnother": "dbfs:/FileStore/prophecy/artifacts/dev/cp/__PROJECT_ID_PLACEHOLDER__/__PROJECT_RELEASE_VERSION_PLACEHOLDER__/pipeline/LivySmallAnother.jar", 
    "pipelines/LivySmallPipeline": "dbfs:/FileStore/prophecy/artifacts/dev/cp/__PROJECT_ID_PLACEHOLDER__/__PROJECT_RELEASE_VERSION_PLACEHOLDER__/pipeline/LivySmallPipeline.jar", 
    "pipelines/LivyPerfPipelineMain": "dbfs:/FileStore/prophecy/artifacts/dev/cp/__PROJECT_ID_PLACEHOLDER__/__PROJECT_RELEASE_VERSION_PLACEHOLDER__/pipeline/LivyPerfPipelineMain.jar", 
    "pipelines/Livy-Benchmark-Pipeline": "dbfs:/FileStore/prophecy/artifacts/dev/cp/__PROJECT_ID_PLACEHOLDER__/__PROJECT_RELEASE_VERSION_PLACEHOLDER__/pipeline/Livy-Benchmark-Pipeline.jar", 
    "pipelines/Livy-Scala-Pipeline": "dbfs:/FileStore/prophecy/artifacts/dev/cp/__PROJECT_ID_PLACEHOLDER__/__PROJECT_RELEASE_VERSION_PLACEHOLDER__/pipeline/Livy-Scala-Pipeline.jar", 
    "pipelines/Livy-Scala-Pipeline-For-Airflow": "dbfs:/FileStore/prophecy/artifacts/dev/cp/__PROJECT_ID_PLACEHOLDER__/__PROJECT_RELEASE_VERSION_PLACEHOLDER__/pipeline/Livy-Scala-Pipeline-For-Airflow.jar", 
    "pipelines/no-use-pipeline": "dbfs:/FileStore/prophecy/artifacts/dev/cp/__PROJECT_ID_PLACEHOLDER__/__PROJECT_RELEASE_VERSION_PLACEHOLDER__/pipeline/no-use-pipeline.jar"
}


def task_wrapper(task_id):

    def decorator(func):

        @task(task_id = task_id)
        def wrapper(*args, **context):
            ## running the actual method.
            return func(*args, **context).execute(context)

        return wrapper

    return decorator



def find_package_name_db(path: str):
    return db_pipeline_id_to_path_dict[path].split("/")[- 1].replace("-1.0-py3-none-any.whl", "")
