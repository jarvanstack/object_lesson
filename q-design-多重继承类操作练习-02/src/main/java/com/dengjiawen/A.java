package com.dengjiawen;

/**
 * @Author Jarvan
 * @create 2020/9/14 11:18
 * B extend A ,C extend b,
 */
public class A {
    public String pA = "pA";

    public void methodA(){
        System.out.println("class A:methodA() method executed!");
    }

    public String getpA() {
        return pA;
    }

    public void setpA(String pA) {
        this.pA = pA;
    }
}
