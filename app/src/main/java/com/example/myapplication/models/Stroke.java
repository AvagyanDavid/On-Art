package com.example.myapplication.models;

import android.graphics.Path;
import android.graphics.Point;

import java.util.ArrayList;

public class Stroke {
    public int color;
    public int strokeWidth;
    public ArrayList<MPoint> points;


    public Stroke(int color, int strokeWidth) {
        this.color = color;
        this.strokeWidth = strokeWidth;
        this.points = new ArrayList<>();
    }
}
