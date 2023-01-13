package org.example;

public class Dog implements Pet {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  void say(){
        System.out.println("Bow-Wow");
    }
}
