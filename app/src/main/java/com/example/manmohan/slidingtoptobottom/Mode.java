package com.example.manmohan.slidingtoptobottom;

/**
 * Created by Manmohan on 4/4/2016.
 */
public class Mode {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    String title;
    boolean selected = false;

    public Mode(boolean selected, String title) {
        this.selected = selected;
        this.title = title;
    }
}
