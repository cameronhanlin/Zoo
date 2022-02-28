package com.company;

public class WartHog extends Animal {

    private String color;

    public WartHog(String name, int numLegs, String color){
        super(name, numLegs);
        this.color = color;
    }

    public void outputDetails(){
        super.outputDetails();
        System.out.println(". It's a "+this.getClassName()+", it's "+color+".");
    }
}