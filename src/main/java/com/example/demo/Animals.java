package com.example.demo;

public class Animals {
    public String name;
    public int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge(int age){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void Print(){
        System.out.println("animals class");
    }
}
