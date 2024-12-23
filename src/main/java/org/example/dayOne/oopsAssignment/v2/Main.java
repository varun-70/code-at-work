package org.example.dayOne.oopsAssignment.v2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Adopter adopter = new Adopter();

        AnimalDetails animal1 = new AnimalDetails();
        animal1.setName("Kushi");
        animal1.setAge(1);
        animal1.setSpecies(Species.Cat);
        animal1.setColor("Orange");
        animal1.setIndoor(false);

        adopter.adoptAnimal(animal1);

        animal.displayInfo();
        adopter.displayAdoptedAnimals();
    }
}
