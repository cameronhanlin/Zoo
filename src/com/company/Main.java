package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*

        X Create a new project named Zoo
        Create a class named Animal and Building and give each some basic properties
                Create several classes for specific types of animals in the Zoo
        These classes should extend the Animal class
        Each specific animal class should have several properties unique to that animal
                Create a new class that extends Building named AnimalEnclosure
                AnimalEnclosure should have some properties including a list of Animals in the enclosure
                Create new class that extends Building named GuestServices to represent the various restaurants, bathrooms, visitor centers, etc. available to zoo guests
        GuestService should have several properties that a zoo guest service building might have, including a list of services offered
        In the console, allow a user to get information about each GuestService and Enclosure building and print that information to the console.
        Bonus: Create a menu item that lets the user search for a specific animal type and find what enclosure they are in.
                Super Bonus: Create a menu option for zoo employees to add animals to enclosures and add services to guest service building

         */

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Elephant("Roger", 4, "brown", false));
        animalList.add(new WartHog("David", 4, "dark brown"));

        List<String> services = new ArrayList<>();
        services.add("gift purchase");
        services.add("validate parking");
        services.add("map sales");

        Animal animal1 = new Animal("Stephane", 4);
        //Elephant elephant1 = new Elephant("George", 4, "grey", true);
        Kangaroo kangaroo1 = new Kangaroo("Bob", 2, "brown", false);
        //WartHog warthog1 = new WartHog("David", 4, "dark brown");

        Building building1 = new Building("bathroom", false);
        AnimalEnclosure enclosure1 = new AnimalEnclosure("African Savannah", true, animalList, false, true);
        GuestServices souvenierShop = new GuestServices("souvenir shop", false, true, services);

        animal1.outputDetails();
        kangaroo1.outputDetails();
        for(int i=0; i<animalList.size(); i++){
            animalList.get(i).outputDetails();
        }


        building1.outputDetails();
        enclosure1.outputDetails();
        souvenierShop.outputDetails();






    }
}
