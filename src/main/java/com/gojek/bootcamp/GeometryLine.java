package com.gojek.bootcamp;

public class GeometryLine {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public GeometryLine(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int length() {
        if (x1 == x2) {
            return Math.abs(y2 - y1);
        } else if (y1 == y2) {
            return Math.abs(x2 - x1);
        } else {
            return 1;
        }
    }
}
