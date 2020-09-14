package com.dengjiawen.area;

import static java.lang.Math.max;
import static java.lang.Math.sqrt;

/**
 * @Author Jarvan
 * @create 2020/9/14 14:10
 * this is a line for 2D
 */
public class Line extends Point {
    private int x2;
    private int  y2;

    /**
     * Line contain 2 point,
     */
    public Line(int x1, int y1,int x2,int y2) {
        super(x1, y1);
        this.x2 = x2;
        this.y2 = y2;
    }
    @Override
    public void display() {
        System.out.println("x1="+getX1());
        System.out.println("y1="+getY1());
        System.out.println("x2="+getX2());
        System.out.println("y2="+getY2());
    }

    /**
     * get the line length
     * @return
     */
    public double getLineLength(){
        //sqrt() 返回正的平方根
        return sqrt(Math.pow(x2 - getX1(),2)+ Math.pow(y2 - getY1(),2));
    }

    public int getX2() {
        return x2;
    }


    public int getY2() {
        return y2;
    }


}
