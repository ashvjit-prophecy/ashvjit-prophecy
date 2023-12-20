from ..utils import *

def Python_0():
    import json
    from datetime import timedelta
    from airflow.operators.python import PythonOperator

    return PythonOperator(
        task_id = "Python_0",
        python_callable = print("Bass itna hi tha"),
        show_return_value_in_logs = True
    )
