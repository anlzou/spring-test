/**
 * @author：anlzou
 * @Date：Created in21:38 2020/6/6
 * @Github：https://github.com/anlzou
 * @Description：
 */
package com.anlzou.test;

import com.anlzou.dao.CbcDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        CbcDao cd = (CbcDao) context.getBean("cbcDaoImpl");
        cd.selectMoney();
        //cd.selectQian();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
