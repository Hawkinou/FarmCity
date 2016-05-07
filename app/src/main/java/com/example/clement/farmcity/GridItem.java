package com.example.clement.farmcity;

public class GridItem {
    int image;
    String text;
    int colorText;
    int colorImage;

    public GridItem() {

    }

    public GridItem(int image, String text, int colorText, int colorImage) {
        this.image = image;
        this.text = text;
        this.colorText = colorText;
        this.colorImage = colorImage;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getColorText() {
        return colorText;
    }

    public void setColorText(int colorText) {
        this.colorText = colorText;
    }

    public int getColorImage() {
        return colorImage;
    }

    public void setColorImage(int colorImage) {
        this.colorImage = colorImage;
    }
}
