package com.gojek.bootcamp;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

public class GeometryLineTest {

    @Test
    public void specifyLineShouldReturn0For00And00Point() {
        GeometryLine line = new GeometryLine(0, 0, 0, 0);
        assertThat(line.length(), equalTo(0));
    }

    @Test
    public void specifyVerticallyEqualLineShouldReturn1For00And01Point() {
        GeometryLine line = new GeometryLine(0, 0, 0, 1);
        assertThat(line.length(), equalTo(1));
    }

    @Test
    public void specifyVerticallyEqualLineShouldReturnFor02And04Point() {
        GeometryLine line = new GeometryLine(0, 2, 0, 4);
        assertThat(line.length(), CoreMatchers.equalTo(2));
    }

    @Test
    public void specifyVerticallyEqualLineShouldReturnFor04And0Minus2Point() {
        GeometryLine line = new GeometryLine(0, 4, 0, -2);
        assertThat(line.length(), CoreMatchers.equalTo(6));
    }

    @Test
    public void specifyHorizontallyEqualLineShouldReturn1For00And10Point() {
        GeometryLine line = new GeometryLine(0, 0, 1, 0);
        assertThat(line.length(), equalTo(1));
    }

}
