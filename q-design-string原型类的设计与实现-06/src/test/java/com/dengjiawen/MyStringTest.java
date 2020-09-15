package com.dengjiawen;


import org.junit.jupiter.api.Test;

import java.util.Scanner;

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

    @Test
    public void testtrimALL(){
        MyString hhh_hhh_hhh = new MyString("hhh hhh hhh");
        MyString myString = hhh_hhh_hhh.trimAll();
        System.out.println(myString);
        //常量是无法修改的，所以你修改也没用
        System.out.println(hhh_hhh_hhh);

    }

    @Test
    public void testRemoveSameAndNear(){
        MyString hhh_abraded = new MyString("hhh");
        MyString myString = hhh_abraded.removeSameAndNear();
        System.out.println(myString);

    }

    @Test
    public void testtext(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the text(english) and we will output the length of the text(remove whitespace)");
        System.out.println("end with enter.");
        System.out.println("----------------");
        System.out.println();
        String s = scanner.nextLine();
        MyString trimString = new MyString(s).trimAll();
        System.out.println("the length of you input after trim="+trimString.length());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the text(english) and we will output the length of the text(remove whitespace)");
        System.out.println("end with enter.");
        System.out.println("----------------");
        System.out.println();
        String s = scanner.nextLine();
        MyString trimString = new MyString(s).trimAll();
        System.out.println("the length of you input after trim="+trimString.length());
    }

    @Test
    public void removeAtIndex(){
        MyString hello = new MyString("hello");
        MyString myString = hello.removeAtIndex(1, 2);
        System.out.println(myString);

    }
}
