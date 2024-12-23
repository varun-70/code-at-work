package org.example.dayOne.oopsAssignment.v1;

import java.util.ArrayList;
import java.util.List;

public class Adopter {
    private int adopterId;
    private String name;
    private int contactInfo;
    private List<String> adoptedAnimals;

    public Adopter() {
        adoptedAnimals = new ArrayList<>();
    }

    void adoptAnimal(String animal) {
        adoptedAnimals.add(animal);
    }

    void displayAdoptedAnimals() {
        for(String adoptedAnimal : adoptedAnimals) {
            System.out.println(adoptedAnimal);
        }
    }
}
