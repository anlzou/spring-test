/**
 * @author：anlzou
 * @Date：Created in19:17 2020/6/4
 * @Github：https://github.com/anlzou
 * @Description：
 */
package com.anlzou.pojo;

public class Admin {
    private String uName = "王二麻子";
    private String gender = "男";

    public Admin(){
        System.out.println("Admin...无参构造方法");
    }

    public Admin(String uName, String gender) {
        this.uName = uName;
        this.gender = gender;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "uName='" + uName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
