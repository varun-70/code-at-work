package org.example.dayOne.oopsAssignment.v2;

public class Animal {
    AnimalDetails animalDetails;

    void displayInfo() {
        System.out.println(animalDetails.getSpecies()  + " color: " + animalDetails.getColor());
    }

    void updateHealthStatus(AnimalDetails animalDetails, HealthStatus healthStatus) {
        animalDetails.setHealthStatus(healthStatus);
    }

    void addAnimal(AnimalDetails animalDetails) {
        this.animalDetails = animalDetails;
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

enum Species {
    Dog,
    Cat,
    Bird
}