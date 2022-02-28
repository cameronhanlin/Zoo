package com.company;

import java.util.List;

public class Building {

    private String name;
    private boolean hasAnimals;

    public Building(String name, boolean hasAnimals){
        this.name = name;
        this.hasAnimals = hasAnimals;
    }

    public String getName(){
        return name;
    }

    public boolean isHasAnimals(){
        return hasAnimals;
    }

    public String oneString(List<String> services){
        String x;
        x = services.toString();
        x = x.substring(1,x.length()-1);
        return x;
    }

    public void outputDetails(){

        System.out.println("");
        System.out.print("The "+name+" ");
        if(hasAnimals)
            System.out.println("does have animals.");
        else
            System.out.println("does not have animals.");
    }
}
