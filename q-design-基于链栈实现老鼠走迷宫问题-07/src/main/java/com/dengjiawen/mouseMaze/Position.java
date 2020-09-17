package com.dengjiawen.mouseMaze;

/**
 * @Author Jarvan
 * @create 2020/9/15 11:33
 */

class Position {

    int row;

    int col;
    public Position(){

    }

    public Position(int row, int col){
        this.col = col;
        this.row = row;
    }

    @Override
    public String toString(){
        return "(" + row + " ," + col + ")";
    }


}

