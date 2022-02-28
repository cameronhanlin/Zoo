package com.company;

import java.util.ArrayList;
import java.util.List;

public class GuestServices extends Building{

    //Create new class that extends Building named GuestServices to represent the various restaurants, bathrooms, visitor centers, etc. available to zoo guests

    private boolean hasBathrooms;
    private List<String> servicesOffered = new ArrayList<>();

    public GuestServices(String name, boolean hasAnimals, boolean hasBathrooms, List<String> newServies){
        super(name, hasAnimals);
        this.hasBathrooms = hasBathrooms;
        servicesOffered.addAll(newServies);
    }

    public void outputDetails() {
        super.outputDetails();
        System.out.print("The "+getName()+" ");
        if(hasBathrooms)
            System.out.print("does have bathrooms. ");
        else
            System.out.print("does not have bathrooms. ");
        System.out.println("The following services are offered here: "+oneString(servicesOffered));



    }



}
