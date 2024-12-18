package com.example.myapplication;

import android.graphics.Path;
import android.graphics.Point;

import java.util.ArrayList;

public class Stroke {
    public int color;
    public int strokeWidth;
    public ArrayList<Point> points;
    // a Path object to
    // represent the path drawn
    public Path path;

    // constructor to initialise the attributes
    public Stroke(int color, int strokeWidth, Path path) {
        this.color = color;
        this.strokeWidth = strokeWidth;
        this.path = path;
        this.points = new ArrayList<>();
    }
}
