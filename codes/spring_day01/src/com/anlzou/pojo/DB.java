/**
 * @author：anlzou
 * @Date：Created in19:14 2020/6/4
 * @Github：https://github.com/anlzou
 * @Description：
 */
package com.anlzou.pojo;

import java.util.*;

/**
 * @Author：anlzou
 * @Date：2020/6/5 21:37
 * @Descritpion：
 * @param： * @param null
 */
public class DB {
    private String driver;//驱动
    private String url;//连接地址
    private String username;//用户名
    private String password;//密码

    private Integer port;//端口号
    private Float price;//价格
    private Admin admin;//当前数据库管理员
    private List list;//什么都可以装
    private Set set;
    private Map<String, Object> map;
    private Properties properties;//表示.properties的配置文件

    //spring中必须写无参构造方法
    public DB() {
        System.out.println("DB...无参构造方法");
    }

    public DB(String driver, Integer port, Float price, Admin admin) {
        System.out.println("DB...有参构造方法");
        this.driver = driver;
        this.port = port;
        this.price = price;
        this.admin = admin;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        System.out.println("DB...setDriver");
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }


    @Override
    public String toString() {
        return "DB{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", port=" + port +
                ", price=" + price +
                ", admin=" + admin +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
