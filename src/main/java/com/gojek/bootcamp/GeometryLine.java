package com.gojek.bootcamp;

import java.util.Objects;

public class GeometryLine {

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public GeometryLine(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double length() {
        return Math.round(Math.sqrt((x2 - x1) * 2) + ((y2 - y1) * 2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, y1, x2, y2);
    }
}
