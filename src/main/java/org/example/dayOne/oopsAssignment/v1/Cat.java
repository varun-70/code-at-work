package org.example.dayOne.oopsAssignment.v1;

public class Cat extends Animal {
    private String color;
    private boolean indoor;

    @Override
    void displayInfo() {
        System.out.println("Cat color: " + color + " - Indoor: " + indoor + " - Health: " + healthStatus + " - Adoptation Status: " + adoptionStatus);
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
    void addCat(String name, int age, String color, boolean indoor) {
        this.name = name;
        this.species = "Cat";
        this.age = age;
        this.color = color;
        this.indoor = indoor;
    }

    @Override
    void addDog(String name, int age, String breed, boolean trained) {

    }

    @Override
    void addBird(String name, String species, int age, int wingSpan, boolean canFly) {

    }
}
