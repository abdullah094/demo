package com.example.demo;

import java.util.Objects;

public class NotAnimals {

    private String name = "abdullah";

    public NotAnimals(String name,String theRealname) {
        if(Objects.equals(name, "")){
            this.name = theRealname;
        }


    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }


}
