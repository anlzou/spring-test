package com.anlzou.pojo;

public class Dog {
    //初始化方法
    public void init(){
        System.out.println("init...");
    }

    public Dog() {
        System.out.println("调用无参构造方法");
    }

    /**
     * Dog 的 eat() 方法
     */
    public void eat() {
        System.out.println("狗哥在慈祥。");
    }

    //销毁方法
    public void destroy(){
        System.out.println("destroy...");
    }
}
