package org.example.dayOne.oopsAssignment.v1;

public class Bird extends Animal {
    private int wing_span;
    private boolean can_fly;

    @Override
    void displayInfo() {
        System.out.println("Wing Span (cm): " + wing_span + " - Can Fly: " + can_fly + " - Health: " + healthStatus + " - Adoptation Status: " + adoptionStatus);
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
    void addBird(String name, String species, int age, int wingSpan, boolean canFly) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.wing_span = wingSpan;
        this.can_fly = canFly;
    }

    @Override
    void addCat(String name, int age, String color, boolean indoor) {

    }

    @Override
    void addDog(String name, int age, String breed, boolean trained) {

    }
}
