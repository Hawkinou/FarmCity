package com.example.clement.farmcity;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.util.ArrayList;

public class GridViewAdapter extends BaseAdapter {
    ArrayList<GridItem> menuList = new ArrayList<GridItem>();

    Context context;

    LayoutInflater inflater;

    public GridViewAdapter(Context context){
        this.context = context;
        inflater = LayoutInflater.from(this.context);

        menuList.add(new GridItem(R.drawable.harvest  ,"My Garden", Color.parseColor("#58FA58"),Color.parseColor("#A9F5BC")));
        menuList.add(new GridItem(R.drawable.todo,"TODO List", Color.parseColor("#F4FA58"), Color.parseColor("#F2F5A9")));
        menuList.add(new GridItem(R.drawable.global2,"Garden Around Me",Color.parseColor("#58D3F7"),Color.parseColor("#81F7F3")));
        menuList.add(new GridItem(R.drawable.exchange,"Exchange",Color.parseColor("#FA5858"), Color.parseColor("#F5A9A9")));
        menuList.add(new GridItem(R.drawable.rank,"Reward",Color.parseColor("#FA8258"), Color.parseColor("#F3E2A9")));

    }
    @Override
    public int getCount() {
        return menuList.size();
    }

    @Override
    public GridItem getItem(int position) {
        return (GridItem) menuList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        GridViewItem imageView;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.grid_item, parent, false);
            imageView = new GridViewItem(convertView);
            imageView.bind(menuList.get(position));
            convertView.setTag(imageView);
        } else {
            imageView = (GridViewItem) convertView.getTag();
        }

        imageView.bind(menuList.get(position));
        return convertView;
    }


}
