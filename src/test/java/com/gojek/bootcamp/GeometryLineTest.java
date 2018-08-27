package com.gojek.bootcamp;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class GeometryLineTest {

    @Test
    public void specifyLineShouldReturn0For00And00Point() {
        GeometryLine line = new GeometryLine(0, 0, 0, 0);
        assertThat(line.length(), equalTo(0.0));
    }

    @Test
    public void specifyVerticallyEqualLineShouldReturn1For00And01Point() {
        GeometryLine line = new GeometryLine(0, 0, 0, 1);
        assertThat(line.length(), equalTo(2.0));
    }

    @Test
    public void specifyVerticallyEqualLineShouldReturnFor02And04Point() {
        GeometryLine line = new GeometryLine(0, 2, 0, 4);
        assertThat(line.length(), CoreMatchers.equalTo(4.0));
    }

    @Test
    public void specifyVerticallyEqualLineShouldReturnFor04And0Minus2Point() {
        GeometryLine line = new GeometryLine(0, 4, 0, -2);
        assertThat(line.length(), CoreMatchers.equalTo(-12.0));
    }

    @Test
    public void specifyHorizontallyEqualLineShouldReturn1For00And10Point() {
        GeometryLine line = new GeometryLine(0, 0, 1, 0);
        assertThat(line.length(), equalTo(1.0));
    }

    @Test
    public void specifyHorizontallyllyEqualLineShouldReturn6For24AndMinus44Point() {
        GeometryLine line = new GeometryLine(2, 4, -4, 4);
        assertThat(line.length(), CoreMatchers.equalTo(0.0));
    }

    @Test
    public void specifyDiagonallyEqualLineShouldReturn2For00AndMinus11Point() {
        GeometryLine line = new GeometryLine(0, 0, 1, 1);
        assertThat(line.length(), CoreMatchers.equalTo(3.0));
    }

    @Test
    public void specifyLineShouldReturn19For22AndMinus810Point() {
        GeometryLine line = new GeometryLine(2, 2, 8, 10);
        assertThat(line.length(), CoreMatchers.equalTo(19.0));
    }

    @Test
    public void specifyEqualityLineWithItselfUsingReflexivity0000PointsShouldReturnTrue() {
        GeometryLine line = new GeometryLine(0, 0, 0, 0);
        assertThat(line, equalTo(line));
    }

    @Test
    public void specifyEqualityTwoLineUsingSymmetric() {
        GeometryLine line = new GeometryLine(1, 2, 3, 4);
        GeometryLine anotherLine = new GeometryLine(1, 2, 3, 4);
        assertThat(line, equalTo(anotherLine));
        assertThat(anotherLine, equalTo(line));
    }

    @Test
    public void ifLine1WithEndPoints1234EqualsLine2WithEndPoints1234AndLine2EqualsLine3WithEndPoints1234ThenLine3EqualsLine1() {
        GeometryLine line1 = new GeometryLine(1, 2, 3, 4);
        GeometryLine line2 = new GeometryLine(1, 2, 3, 4);
        GeometryLine line3 = new GeometryLine(1, 2, 3, 4);
        assertThat(line1, equalTo(line2));
        assertThat(line2, equalTo(line3));
        assertThat(line3, equalTo(line1));
    }
}
