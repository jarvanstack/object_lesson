package com.dengjiawen.area;

import static java.lang.Math.sqrt;

/**
 * @Author Jarvan
 * @create 2020/9/14 14:10
 * this is a line for 2D
 */
public class Triangle extends Line {
    private int x3;
    private int y3;


    /**
     * Line contain 2 point,
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, y1, x2, y2);
        this.x3 = x3;
        this.y3 = y3;
    }


    /**
     * calculate the area of the triangle.
     */
    public double getAreaOfTraingle() {
        double edgeA = new Line(getX1(), getY1(), getX2(), getY2()).getLineLength();
        double edgeB = new Line(getX1(), getY1(), getX3(), getY3()).getLineLength();
        double edgeC = new Line(getX2(), getY2(), getX3(), getY3()).getLineLength();
        double p = (edgeA + edgeB + edgeC) / 2;
        return sqrt((p * (p - edgeA) * (p - edgeB) * (p - edgeC)));
    }

    public int getX3() {
        return x3;
    }

    public int getY3() {
        return y3;
    }
}
