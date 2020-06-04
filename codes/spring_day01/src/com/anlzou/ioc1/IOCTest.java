package com.anlzou.ioc1;

import com.anlzou.pojo.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Dog dog = context.getBean("myDog", Dog.class);
        dog.eat();
    }
}
