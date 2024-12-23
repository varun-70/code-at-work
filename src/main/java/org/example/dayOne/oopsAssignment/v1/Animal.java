package org.example.dayOne.oopsAssignment.v1;

public abstract class Animal {
    String name;
    String species;
    int age;
    HealthStatus healthStatus;
    AdoptionStatus adoptionStatus;

    abstract void displayInfo();

    abstract void updateHealthStatus(HealthStatus healthStatus);

    abstract void updateAdoptionStatus(AdoptionStatus adoptionStatus);

    abstract void addDog(String name, int age, String breed, boolean trained);

    abstract void addCat(String name, int age, String color, boolean indoor);

    abstract void addBird(String name, String species, int age, int wingSpan, boolean canFly);

    public void setAdoptionStatus(AdoptionStatus adoptionStatus) {
        this.adoptionStatus = adoptionStatus;
    }

    public String getName() {
        return name;
    }
}

enum HealthStatus {
    Excellent,
    VeryGood,
    Good,
    Fair,
    Poor
}

enum AdoptionStatus {
    Available,
    Pending,
    Completed,
    OnHold,
    NotAvailable
}