package com.dengjiawen.mouseMaze;

/**
 * @Author Jarvan
 * @create 2020/9/15 11:33
 */

import java.util.Scanner;
import java.util.Stack;

class Maze {
    int maze[][];
    private int row = 9;
    private int col = 8;
    Stack<Position> stack;
    boolean blockDiagram[][] = null;

    public Maze() {

        stack = new Stack<Position>();
        blockDiagram = new boolean[15][15];
    }

    /*
     * 构造迷宫
     */
    public void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入迷宫的行数");
        row = scanner.nextInt();
        System.out.println("请输入迷宫的列数");
        col = scanner.nextInt();
        System.out.println("请输入" + row + "行" + col + "列的迷宫");
        int temp = 0;
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                temp = scanner.nextInt();
                maze[i][j] = temp;
                blockDiagram[i][j] = false;
            }
        }
    }

    /*
     * 回溯迷宫，查看是否有出路
     */
    public void findPath() {
        // 给原始迷宫的周围家一圈围墙
        int temp[][] = new int[row + 2][col + 2];
        for (int i = 0; i < row + 2; ++i) {
            for (int j = 0; j < col + 2; ++j) {
                temp[0][j] = 1;
                temp[row + 1][j] = 1;
                temp[i][0] = temp[i][col + 1] = 1;
            }
        }
        // 将原始迷宫复制到新的迷宫中
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                temp[i + 1][j + 1] = maze[i][j];
            }
        }
        // 从左上角开始按照顺时针开始查询

        int i = 1;
        int j = 1;
        blockDiagram[i][j] = true;
        stack.push(new Position(i, j));
        while (!stack.empty() && (!(i == (row) && (j == col)))) {

            if ((temp[i][j + 1] == 0) && (blockDiagram[i][j + 1] == false)) {
                blockDiagram[i][j + 1] = true;
                stack.push(new Position(i, j + 1));
                j++;
            } else if ((temp[i + 1][j] == 0) && (blockDiagram[i + 1][j] == false)) {
                blockDiagram[i + 1][j] = true;
                stack.push(new Position(i + 1, j));
                i++;
            } else if ((temp[i][j - 1] == 0) && (blockDiagram[i][j - 1] == false)) {
                blockDiagram[i][j - 1] = true;
                stack.push(new Position(i, j - 1));
                j--;
            } else if ((temp[i - 1][j] == 0) && (blockDiagram[i - 1][j] == false)) {
                blockDiagram[i - 1][j] = true;
                stack.push(new Position(i - 1, j));
                i--;
            } else {
                stack.pop();
                if (stack.empty()) {
                    break;
                }
                i = stack.peek().row;
                j = stack.peek().col;
            }

        }

        Stack<Position> newPos = new Stack<Position>();
        if (stack.empty()) {
            System.out.println("没有路径");
        } else {
            System.out.println("有路径");
            System.out.println("路径如下：");
            while (!stack.empty()) {
                Position pos = new Position();
                pos = stack.pop();
                newPos.push(pos);
            }
        }

        /*
         * 图形化输出路径
         * */

        String resault[][] = new String[row + 1][col + 1];
        for (int k = 0; k < row; ++k) {
            for (int t = 0; t < col; ++t) {
                resault[k][t] = (maze[k][t]) + "";
            }
        }
        while (!newPos.empty()) {
            Position p1 = newPos.pop();
            resault[p1.row - 1][p1.col - 1] = "#";

        }

        for (int k = 0; k < row; ++k) {
            for (int t = 0; t < col; ++t) {
                System.out.print(resault[k][t] + "\t");
            }
            System.out.println();
        }


    }


}

