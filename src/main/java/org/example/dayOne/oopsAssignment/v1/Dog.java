package org.example.dayOne.oopsAssignment.v1;

public class Dog extends Animal {
    private String breed;
    private boolean trained;

    @Override
    void displayInfo() {
        System.out.println("Dog breed: " + breed + " - Trained: " + trained + " - Health: " + healthStatus + " - Adoptation Status: " + adoptionStatus);
    }

    @Override
    void updateHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }

    @Override
    void updateAdoptionStatus(AdoptionStatus adoptionStatus) {
        this.adoptionStatus = adoptionStatus;
    }

    @Override
    void addDog(String name, int age, String breed, boolean trained) {
        this.name = name;
        species = "Dog";
        this.age = age;
        this.breed = breed;
        this.trained = trained;
    }

    @Override
    void addBird(String name, String species, int age, int wingSpan, boolean canFly) {

    }

    @Override
    void addCat(String name, int age, String color, boolean indoor) {

    }
}
