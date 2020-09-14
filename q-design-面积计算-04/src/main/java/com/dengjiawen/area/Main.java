package com.dengjiawen.area;

/**
 * @Author Jarvan
 * @create 2020/9/14 14:37
 * this is the main test
 */
public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(0, 0, 1, 0, 0, 1);
        Triangle triangle2 = new Triangle(2, 4, 6, 7, 5, 8);
        Triangle triangle3 = new Triangle(1, 2, 3, 6, 9, 9);
        System.out.println("the area of triangle1="+triangle1.getAreaOfTraingle());
        System.out.println("the area of triangle2="+triangle2.getAreaOfTraingle());
        System.out.println("the area of triangle3="+triangle3.getAreaOfTraingle());
    }
}
