package com.anlzou.ioc1;

import com.anlzou.pojo.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {
    public static void main(String[] args) {
        //启动spring框架：ApplicationContext、ClassPathXmlApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        //从spring容器中创建dog对象
        Dog dog = context.getBean("myDog", Dog.class);
        dog.eat();

        //ClassPathXmlApplicationContext类中有close()方法，但是ApplicationContext接口中没有定义close()方法
//        ((ClassPathXmlApplicationContext)context).close();
        ClassPathXmlApplicationContext temp = (ClassPathXmlApplicationContext)context;
        temp.close();
    }
}
