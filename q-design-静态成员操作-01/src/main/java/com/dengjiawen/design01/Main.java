package com.dengjiawen.design01;

/**
 * @Author Jarvan
 * @create 2020/9/14 10:56
 */
public class Main {
    public static void main(String[] args) {
        //3 object
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        System.out.println("counter1="+counter1.getCounter());
        System.out.println("counter2="+counter2.getCounter());
        System.out.println("counter3="+counter3.getCounter());
        // warn to call static use object
        System.out.println("staticCounter1="+counter1.staticCounter);
        System.out.println("staticCounter2="+counter2.staticCounter);
        System.out.println("staticCounter3="+counter3.staticCounter);
        //destructor
        counter1.destructor();
        counter2.destructor();
        counter3.destructor();
        System.out.println("======after destructor==========");
        //output it again
        System.out.println("counter1="+counter1.getCounter());
        System.out.println("counter2="+counter2.getCounter());
        System.out.println("counter3="+counter3.getCounter());
        // warn to call static use object
        System.out.println("staticCounter1="+counter1.staticCounter);
        System.out.println("staticCounter2="+counter2.staticCounter);
        System.out.println("staticCounter3="+counter3.staticCounter);
    }
}
