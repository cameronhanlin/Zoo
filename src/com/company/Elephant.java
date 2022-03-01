package com.company;

public class Elephant extends Animal {

    private String color;
    private boolean hasTusk;

    public Elephant(String name, int numLegs, String color, boolean hasTusk){
        super(name, numLegs);
        this.color = color;
        this.hasTusk = hasTusk;
    }

    public void outputDetails(){
        super.outputDetails();
        System.out.print(" and is an "+this.getClassName()+", is "+color+" and ");
        if(hasTusk)
            System.out.println("does have tusks");
        else
            System.out.println("does not have tusks");

    }


}
