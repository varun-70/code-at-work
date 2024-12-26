package org.example.dayOne.oopsAssignment.v1;

/**
 * Animal interface defines the common behaviors and properties that any animal class should implement
 *
 * @author Varun M S
 */
public abstract class Animal {
    String name;
    String species;
    int age;
    HealthStatus healthStatus;
    AdoptionStatus adoptionStatus;

    /**
     * Displays the information about the implemented animal
     */
    abstract void displayInfo();

    /**
     * Updates the Health status of the implemented animal
     * @param healthStatus
     */
    abstract void updateHealthStatus(HealthStatus healthStatus);

    /**
     * Updates the Adoption status of the implemented animal
     * @param adoptionStatus
     */
    abstract void updateAdoptionStatus(AdoptionStatus adoptionStatus);

    /**
     * Add Dog using Dog implementation class
     */
    abstract void addDog(String name, int age, String breed, boolean trained);

    /**
     * Add Cat using Cat implementation class
     */
    abstract void addCat(String name, int age, String color, boolean indoor);

    /**
     * Add Bird using Bird implementation class
     */
    abstract void addBird(String name, String species, int age, int wingSpan, boolean canFly);

    /**
     * Get the name of the Animal using implemented class object
     *
     * @return the name of animal in String
     */
    public String getName() {
        return name;
    }
}

/**
 * HealthStatus enum represents the various states of health of an Animal
 */
enum HealthStatus {
    Excellent,
    VeryGood,
    Good,
    Fair,
    Poor
}

/**
 * AdoptionStatus enum represents the various states of Adoption of an Animal
 */
enum AdoptionStatus {
    Available,
    Pending,
    Completed,
    OnHold,
    NotAvailable
}