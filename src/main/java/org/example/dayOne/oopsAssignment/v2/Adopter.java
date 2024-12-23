package org.example.dayOne.oopsAssignment.v2;

import java.util.ArrayList;
import java.util.List;

public class Adopter {
    private int adopterId;
    private String name;
    private int contactInfo;
    private List<AnimalDetails> adoptedAnimals;

    public Adopter() {
        adoptedAnimals = new ArrayList<>();
    }

    void adoptAnimal(AnimalDetails animal) {
        adoptedAnimals.add(animal);
    }

    void displayAdoptedAnimals() {
        for(AnimalDetails adoptedAnimal : adoptedAnimals) {
            System.out.println(adoptedAnimal.getName());
        }
    }
}
