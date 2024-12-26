package org.example.dayOne.oopsAssignment.v1;

/**
 *  The Dog class represents a dog and implements the Animal interface.
 */
public class Bird extends Animal {
    private int wing_span;
    private boolean can_fly;

    /**
     * Overridden implementation to display Bird information
     */
    @Override
    void displayInfo() {
        System.out.println("Wing Span (cm): " + wing_span + " - Can Fly: " + can_fly + " - Health: " + healthStatus + " - Adoptation Status: " + adoptionStatus);
    }

    /**
     * Overridden implementation to update Health status of the Bird
     */
    @Override
    void updateHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * Overridden implementation to update Adoption status of the Bird
     */
    @Override
    void updateAdoptionStatus(AdoptionStatus adoptionStatus) {
        this.adoptionStatus = adoptionStatus;
    }

    /**
     * Overridden implementation to Add Bird
     */
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
        // Implemented in Cat class
    }

    @Override
    void addDog(String name, int age, String breed, boolean trained) {
        // Implemented in Dog class
    }
}
