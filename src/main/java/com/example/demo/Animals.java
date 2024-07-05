package com.example.demo;

import java.util.Objects;

public class Animals {
    public String name;
    public String NachNama;
    public int age;
    public String[] arr = {"num","k"};



    public Animals(String name, int age,String NachNama) {
        for(int i = 0;i<=arr.length;i++){
            if(Objects.equals(arr[0], "num")){
                this.name = name;
            }
            else {
                this.NachNama = NachNama;
            }


        }

        if (age < 0 || age > 120) {
            this.age = 0; // default age if invalid
        } else {
            this.age = age;
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
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
