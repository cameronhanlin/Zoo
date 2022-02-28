package com.company;

public class Kangaroo extends Animal{

    private String color;
    private boolean isMale;

    public Kangaroo(String name, int numLegs, String color, boolean isMale){
        super(name, numLegs);
        this.color = color;
        this.isMale = isMale;
    }

    public void outputDetails(){
        super.outputDetails();
        if(isMale)
            System.out.print(". He's ");
        else
            System.out.print(". She's ");

        System.out.println("a Kangaroo, and is "+color+".");

    }




}