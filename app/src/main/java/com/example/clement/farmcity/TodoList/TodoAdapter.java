package com.example.clement.farmcity.TodoList;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;


import com.example.clement.farmcity.R;

import java.util.ArrayList;

public class TodoAdapter extends BaseAdapter {
    ArrayList<String> menuList = new ArrayList<String>();
    ArrayList<TaskTodo> todoTaskList = new ArrayList<TaskTodo>();

    Context context;

    LayoutInflater inflater;

    public TodoAdapter(Context context, ArrayList<String> todoList){
        this.context = context;
        menuList = todoList;
        inflater = LayoutInflater.from(this.context);
    }

    @Override
    public int getCount() {
        return menuList.size();
    }

    @Override
    public TaskTodo getItem(int position) {
        return todoTaskList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TaskTodo imageView;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.todo_task, parent, false);
            imageView = new TaskTodo(convertView);
            imageView.bind(menuList.get(position));
            convertView.setTag(imageView);
            todoTaskList.add(imageView);
        } else {
            imageView = (TaskTodo) convertView.getTag();
        }

        return convertView;
    }
}
