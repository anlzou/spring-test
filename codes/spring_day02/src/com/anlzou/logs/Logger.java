/**
 * @author：anlzou
 * @Date：Created in21:37 2020/6/6
 * @Github：https://github.com/anlzou
 * @Description：
 */
package com.anlzou.logs;

public class Logger {
    public void log() {
        System.out.println("Logger...log()...日志记录成功");
    }

    /**
     * 接收核心方法的返回值
     */
    public void logTest(Float temp) {
        System.out.println("Logger....logTest....后置通知...接收核心方法返回值=" + temp);
    }
}
