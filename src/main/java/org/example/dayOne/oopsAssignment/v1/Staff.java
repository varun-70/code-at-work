package org.example.dayOne.oopsAssignment.v1;

public class Staff {
    int staff_id;
    String name;
    String role;
    String[] tasks;

    void assignTask(String task) {

    }

    void displayTasks() {

    }

    void updateAnimalHealth(Animal animal, HealthStatus healthStatus) {
        animal.updateHealthStatus(healthStatus);
    }

    void updateAdoptionStatus(Animal animal, AdoptionStatus adoptionStatus) {
        animal.updateAdoptionStatus(adoptionStatus);
    }
}
