package com.dengjiawen.area;

/**
 * @Author Jarvan
 * @create 2020/9/14 14:10
 * this is a point for 2D
 */
public class Point {
    private int x1;
    private int y1;

    public Point(int x1, int y1) {
        this.x1 = x1;
        this.y1 = y1;
    }


    public void display() {
        System.out.println("x1="+x1);
        System.out.println("y1="+y1);
    }

    public int getX1() {
        return x1;
    }


    public int getY1() {
        return y1;
    }

}
