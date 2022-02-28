package com.company;

public class Animal {

    private String name;
    private int numLegs;


    public Animal(String name, int numLegs){
        this.name = name;
        this.numLegs = numLegs;
    }

    public String getName(){
        return name;
    }

    public int getNumLegs(){
        return numLegs;
    }

    public void outputDetails(){
        System.out.println("");
        System.out.print(name+" has "+numLegs+" legs");
    }

    public String getClassName(){
        return getClass().getSimpleName();
    }

}
