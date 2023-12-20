import os
import sys
import pendulum
from datetime import timedelta
import airflow
from airflow import DAG
from airflow.decorators import task
from airflow.models.param import Param
sys.path.insert(0, os.path.abspath(os.path.dirname(__file__)))
from ashk3s_ashvjit_dependentproject_dependentjob.tasks import Python_0
PROPHECY_RELEASE_TAG = "__PROJECT_ID_PLACEHOLDER__/__PROJECT_RELEASE_VERSION_PLACEHOLDER__"

with DAG(
    dag_id = "ashk3s_ashvjit_DependentProject_DependentJob", 
    schedule_interval = None, 
    default_args = {"owner" : "Prophecy", "ignore_first_depends_on_past" : True, "do_xcom_push" : True}, 
    start_date = pendulum.today('UTC'), 
    catchup = True
) as dag:
    Python_0_op = Python_0()
