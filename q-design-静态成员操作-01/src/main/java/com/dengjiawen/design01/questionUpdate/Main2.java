package com.dengjiawen.design01.questionUpdate;

import com.dengjiawen.design01.Counter;

/**
 * @Author Jarvan
 * @create 2020/9/14 10:56
 */
public class Main2 {
    public static void main(String[] args) {
        //3 object
        Counter2 counter1 = new Counter2();
        Counter2 counter2 = new Counter2();
        Counter2 counter3 = new Counter2();
        System.out.println("counter1="+counter1.getCounter());
        System.out.println("counter2="+counter2.getCounter());
        System.out.println("counter3="+counter3.getCounter());
        // warn to call static use object
        System.out.println("staticCounter1="+ Counter2.getStaticCounter());
        System.out.println("staticCounter2="+Counter2.getStaticCounter());
        System.out.println("staticCounter3="+Counter2.getStaticCounter());
        //destructor
        counter1.destructor();
        counter2.destructor();
        counter3.destructor();
        System.out.println("======after destructor==========");
        //output it again
        System.out.println("counter1="+counter1.getCounter());
        System.out.println("counter2="+counter2.getCounter());
        System.out.println("counter3="+counter3.getCounter());

        System.out.println("staticCounter1="+ Counter2.getStaticCounter());
        System.out.println("staticCounter2="+Counter2.getStaticCounter());
        System.out.println("staticCounter3="+Counter2.getStaticCounter());
    }
}
