package com.example.clement.farmcity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;



public class GridViewItem {

    ImageView image;

    TextView text;

    public GridViewItem( View item) {
        image = (ImageView) item.findViewById(R.id.imageview);
        text = (TextView) item.findViewById(R.id.textview);

    }

    public void bind(GridItem item) {

        image.setImageResource(item.getImage());
        this.text.setText(item.getText());
        image.setBackgroundColor(item.getColorImage());
        this.text.setBackgroundColor(item.getColorText());
    }
}