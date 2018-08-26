package com.gojek.bootcamp;

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
    public void specifyHorizontallyEqualLineShouldReturn1For00And01Point() {
        GeometryLine line = new GeometryLine(0, 0, 0, 1);
        assertThat(line.length(), equalTo(1));
    }
}
