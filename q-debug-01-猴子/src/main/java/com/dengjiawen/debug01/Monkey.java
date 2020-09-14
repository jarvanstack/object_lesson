package com.dengjiawen.debug01;

/**
 * @Author 邓嘉文
 * @create 2020/9/14 9:19
 * Entity of Monkey
 */
public class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "name='" + name + '\'' +
                '}';
    }
}
