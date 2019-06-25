package com.njupt.config;

public class Animal {
    //@Value("${name}")
    String name;


    public void work(){
        System.out.println("I am working...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }
    public Animal(){}

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
