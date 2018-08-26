package com.gojek.bootcamp;

public class GeometryLine {

    private int y1;
    private int y2;

    public GeometryLine(int x1, int y1, int x2, int y2) {
        this.y1 = y1;
        this.y2 = y2;
    }

    public int length() {
        return  Math.abs(y2 - y1);
    }
}
