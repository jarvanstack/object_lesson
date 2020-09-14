package com.dengjiawen.family;

/**
 *
 * @Author Jarvan
 * @create 2020/9/14 11:35
 * default access authority for class that in a package ,
 * so Father Son Mother can access each other if the access authority is default
 */
public class Father {
    public void driver(){
        System.out.println("father can drive the car");
    }
    /**
     * default access authority only can be access by family.
     * if you want other class access the method you should change the
     * access authority to [public]
     */
    void fixTV(){
        System.out.println("father: fix the TV");
    }

}
