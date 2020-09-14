package com.dengjiawen;

/**
 * @Author Jarvan
 * @create 2020/9/14 11:18
 * B extend A ,C extend b,
 */
public class Main {
    public static void main(String[] args) {
        C c = new C();
        //access the method of A\
        c.methodA();
        //access the field of class A
        System.out.println(c.getpA());
        //set the field of A
        c.setpA("class C :I changed your field pA ,class A");
        System.out.println(c.getpA());
        //access the method of B
        c.onB();

    }
}
