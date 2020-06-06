/**
 * @author：anlzou
 * @Date：Created in21:40 2020/6/5
 * @Github：https://github.com/anlzou
 * @Description：
 */
package com.anlzou.di2;

import com.anlzou.pojo.DB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DITest {
    public static void main(String[] args) {
        //通过set方法
//        DB db1 = new DB();
//        db1.setAdmin(new Admin());

        //通过有参构造方法
//        DB db2 = new DB("3",3306,3f,new Admin());

        //启动 spring 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        DB db = context.getBean("smallDB", DB.class);

        System.out.println(db);
        System.out.println(db.getPrice());

        ClassPathXmlApplicationContext temp = (ClassPathXmlApplicationContext) context;
        temp.close();
    }
}
