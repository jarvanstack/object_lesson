package com.dengjiawen;


import org.junit.jupiter.api.Test;

/**
 * @Author Jarvan
 * @create 2020/9/14 19:38
 */
public class MyStringTest {


    @Test
    public void test(){
        MyString hello = new MyString("hello");
        MyString replace = hello.replace('o', 'T');
        System.out.println(hello);
        System.out.println(replace);
    }


    @Test
    public void testContains(){
        MyString hello_world = new MyString("hello world");
        boolean wo = hello_world.contains("gfsdg");
        System.out.println(wo);
    }

    @Test
    public void testFindIndex(){
        MyString hello_hello_hello_ = new MyString("hello hello hello ");
        Integer[] lls = hello_hello_hello_.findIndex("ll");
        for (Integer ll : lls) {
            System.out.println(ll);
        }
    }

}
