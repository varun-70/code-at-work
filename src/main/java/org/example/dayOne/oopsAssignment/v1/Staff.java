package org.example.dayOne.oopsAssignment.v1;

/**
 * The Staff class represents individuals who are responsible for managing and caring for animals in a shelter.
 * This class models the attributes and behaviors of staff members.
 */
public class Staff {
    int staff_id;
    String name;
    String role;
    String[] tasks;

    /**
     * The staff assign the task to staff members
     *
     * @param task to be assigned to staff member
     */
    void assignTask(String task) {
        // Assign Task
    }

    /**
     * To display all the tasks
     */
    void displayTasks() {
        for(String task : tasks) {
            System.out.println(task);
        }
    }

    /**
     * Staff will update the Animal Health
     */
    void updateAnimalHealth(Animal animal, HealthStatus healthStatus) {
        animal.updateHealthStatus(healthStatus);
    }

    /**
     * Staff will update the Animal Adoption status
     */
    void updateAdoptionStatus(Animal animal, AdoptionStatus adoptionStatus) {
        animal.updateAdoptionStatus(adoptionStatus);
    }
}
