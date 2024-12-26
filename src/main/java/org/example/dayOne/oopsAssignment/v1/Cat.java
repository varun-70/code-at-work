package org.example.dayOne.oopsAssignment.v1;

/**
 *  The Dog class represents a dog and implements the Animal interface.
 */
public class Cat extends Animal {
    private String color;
    private boolean indoor;

    /**
     * Overridden implementation to display Cat information
     */
    @Override
    void displayInfo() {
        System.out.println("Cat color: " + color + " - Indoor: " + indoor + " - Health: " + healthStatus + " - Adoptation Status: " + adoptionStatus);
    }

    /**
     * Overridden implementation to update Health status of the Cat
     */
    @Override
    void updateHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * Overridden implementation to update Adoption status of the Cat
     */
    @Override
    void updateAdoptionStatus(AdoptionStatus adoptionStatus) {
        this.adoptionStatus = adoptionStatus;
    }

    /**
     * Overridden implementation to Add Cat
     */
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
        // Implemented in Dog class
    }

    @Override
    void addBird(String name, String species, int age, int wingSpan, boolean canFly) {
        // Implemented in Bird class
    }
}
