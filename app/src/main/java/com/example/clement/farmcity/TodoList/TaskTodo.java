package com.example.clement.farmcity.TodoList;


import android.view.View;
import android.widget.TextView;

import com.example.clement.farmcity.R;

public class TaskTodo {
    String action;
    TextView actionToDo;

    public TaskTodo( View item) {
        actionToDo = (TextView) item.findViewById(R.id.action);

    }

    public void bind(String taskTodo) {
        actionToDo.setText(taskTodo);

    }
}
