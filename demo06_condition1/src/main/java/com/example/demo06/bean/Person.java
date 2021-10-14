package com.example.demo06.bean;

/**
 * @author mlNothing
 * @date 2021/10/7 12:47
 */
public class Person {
    private int id;
    private  String usename;
    private String password;

    public Person() {
    }

    public Person(int id, String usename, String password) {
        this.id = id;
        this.usename = usename;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", usename='" + usename + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
