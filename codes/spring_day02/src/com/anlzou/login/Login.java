/**
 * @author：anlzou
 * @Date：Created in21:37 2020/6/6
 * @Github：https://github.com/anlzou
 * @Description：
 */
package com.anlzou.login;

import org.aspectj.lang.ProceedingJoinPoint;

public class Login {
    //从form表单传递过来的参数
    private String uName = "admin";//用户名
    private String pwd = "123456";//密码

    public void login(ProceedingJoinPoint pp) {
        //表：users:   admin 、123456
        if ("admin".equals(uName) && "123456".equals(pwd)) {//登录成功
            //放行
            try {
                pp.proceed();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        } else {//登录失败
            System.out.println("Login....登录失败");
        }
    }
}
