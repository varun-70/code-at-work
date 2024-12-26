package org.example.dayOne.oopsAssignment.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * The Adopter class represents individuals who are interested in or have adopted animals.
 * This class models the attributes and behaviors of adopters.
 */
public class Adopter {
    private int adopterId;
    private String name;
    private int contactInfo;
    private List<String> adoptedAnimals;

    /**
     * Constructor for declaring the List
     */
    public Adopter() {
        adoptedAnimals = new ArrayList<>();
    }

    /**
     * To Adopt animal from shelter
     *
     * @param animal name in String
     */
    void adoptAnimal(String animal) {
        adoptedAnimals.add(animal);
    }

    /**
     * Display the adopted Animals
     */
    void displayAdoptedAnimals() {
        for(String adoptedAnimal : adoptedAnimals) {
            System.out.println(adoptedAnimal);
        }
    }
}
