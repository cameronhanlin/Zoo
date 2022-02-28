package com.company;

import java.util.ArrayList;
import java.util.List;

public class AnimalEnclosure extends Building {


    private List<Animal> animals = new ArrayList<>();
    private boolean hasFlowingWater;
    private boolean openTop;

    public AnimalEnclosure(String name, boolean hasAnimals, List<Animal> newAnimals, boolean hasFlowingWater, boolean openTop){
        super(name, hasAnimals);
        animals.addAll(newAnimals);
        this.hasFlowingWater = hasFlowingWater;
        this.openTop = openTop;
    }

    public void outputDetails() {
        String animalsString = "";

        for(int i=0; i<animals.size();i++) {
            animalsString = animalsString.concat(animals.get(i).getClassName());
            if (animals.size()>1 && i < animals.size()-1)
                animalsString = animalsString.concat(", ");
        }


        super.outputDetails();
        System.out.print("The "+getName()+" ");
        if(hasFlowingWater)
            System.out.print("does have flowing water, and ");
        else
            System.out.print("does not have flowing water, and ");

        if(openTop)
            System.out.println("the roof is open");
        else
            System.out.println("the roof is enclosed");

        System.out.println("The following animals are here: "+animalsString);






    }
}
