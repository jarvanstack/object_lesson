package com.dengjiawen.debug01;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author Jarvan
 * @create 2020/9/14 9:20
 * the logical code of the debug01 question.
 */
public class Main {
    /**
     * entrance of debug01 question,The procedure starts here
     */
    public static void main(String[] args) {

        // counter of the times
        int counter = 0;
        //monkeys
        ArrayList<Monkey> monkeys = new ArrayList<>();
        //scanner of the input
        Scanner scanner = new Scanner(System.in);
        //number of  the total monkey
        System.out.println("please input the [totalMonkeysNumber],end with [enter]");
        int totalMonkeysNumber = scanner.nextInt();
        System.out.println("please input the [outMonkeyNumber],end with [enter]");
        int outMonkeyNumber = scanner.nextInt();
        //init monkeys
        for (int i = 0; i < totalMonkeysNumber; i++) {
            monkeys.add(new Monkey("monkey_" + (i + 1)));
        }
        // only one monkey at last
        while (monkeys.size() > 1) {
            //loop the monkeys
            for (int i = 0; i < monkeys.size(); i++) {
                counter++;
                //if the out condition happen
                if (counter % outMonkeyNumber == 0) {
                    //remove the monkey
                    monkeys.remove(monkeys.get(i));
                }

            }
            }

        System.out.println("=====congratulations!=========");
        System.out.println("the monkey king is=" + monkeys.get(0));

    }
}
