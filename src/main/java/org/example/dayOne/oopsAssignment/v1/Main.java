package org.example.dayOne.oopsAssignment.v1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Adopter adopter = new Adopter();
        Staff staff = new Staff();

        animal.addCat("Kushi", 1, "Orange", false);
        adopter.adoptAnimal(animal.getName());
        animal.displayInfo();
        adopter.displayAdoptedAnimals();

        staff.updateAnimalHealth(animal, HealthStatus.Fair);
        staff.updateAdoptionStatus(animal, AdoptionStatus.Completed);
        animal.displayInfo();
    }
}
