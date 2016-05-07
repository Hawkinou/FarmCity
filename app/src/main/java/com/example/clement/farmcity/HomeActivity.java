package com.example.clement.farmcity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;


public class HomeActivity extends Activity {

    GridViewAdapter adapter;

    GridView gridView;

    TextView nameUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        gridView = (GridView) findViewById(R.id.grid_view);
        nameUser = (TextView) findViewById(R.id.username);
        final String email = getIntent().getStringExtra("username");
        final String username = getName(email);
        nameUser.setText(username);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> p, View v, int pos, long id) {
                Intent newIntent = null;
                switch (pos) {
                    case 0:
                        //new Intent(HomeActivity.this, MyGardenActivity.class);
                        break;
                    case 1:
                        newIntent = new Intent(HomeActivity.this, TodoListActivity.class);
                        break;
                    case 2:
                        //new Intent(HomeActivity.this, OtherGardenActivity.class);
                        break;
                    case 3:
                        //new Intent(HomeActivity.this, ExchangeActivity.class);
                        break;
                    case 4:
                        //new Intent(HomeActivity.this, RewardActivity.class);
                        break;
                }
                newIntent.putExtra("username", username);
                startActivity(newIntent);
            }
        });

        adapter = new GridViewAdapter(getBaseContext());
        gridView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    public String getName(String email){
        return email.substring(0,email.indexOf('@'));
    }
}