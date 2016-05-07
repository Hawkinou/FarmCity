package com.example.clement.farmcity;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.clement.farmcity.TodoList.TodoAdapter;

import java.util.ArrayList;

public class TodoListActivity extends Activity{

    TextView nameUser;
    ListView listView;
    TodoAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todo_list_activity);
        nameUser = (TextView) findViewById(R.id.username);
        listView = (ListView) findViewById(R.id.listTodo);

        final String username = getIntent().getStringExtra("username");
        nameUser.setText(username);
        ArrayList<String> todo = new ArrayList<String>();
        todo.add("To water tomatoes");
        todo.add("Remove weed");
        adapter = new TodoAdapter(getBaseContext(),todo);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
