package org.example.dayOne.oopsAssignment.v1;

/**
 *  The Dog class represents a dog and implements the Animal interface.
 */
public class Dog extends Animal {
    private String breed;
    private boolean trained;

    /**
     * Overridden implementation to display Dog information
     */
    @Override
    void displayInfo() {
        System.out.println("Dog breed: " + breed + " - Trained: " + trained + " - Health: " + healthStatus + " - Adoptation Status: " + adoptionStatus);
    }

    /**
     * Overridden implementation to update Health status of the Dog
     */
    @Override
    void updateHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * Overridden implementation to update Adoption status of the Dog
     */
    @Override
    void updateAdoptionStatus(AdoptionStatus adoptionStatus) {
        this.adoptionStatus = adoptionStatus;
    }

    /**
     * Overridden implementation to Add Dog
     */
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
        // Implemented in Bird class
    }

    @Override
    void addCat(String name, int age, String color, boolean indoor) {
        // Implemented in Cat class
    }
}
