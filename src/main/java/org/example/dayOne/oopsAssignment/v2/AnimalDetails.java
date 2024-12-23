package org.example.dayOne.oopsAssignment.v2;

public class AnimalDetails {
    private String name;
    private Species species;
    private int age;
    private HealthStatus healthStatus;
    private AdoptionStatus adoptionStatus;
    private String breed;
    private boolean trained;
    private String color;
    private boolean indoor;
    private int wing_span;
    private boolean can_fly;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public HealthStatus getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }

    public AdoptionStatus getAdoptionStatus() {
        return adoptionStatus;
    }

    public void setAdoptionStatus(AdoptionStatus adoptionStatus) {
        this.adoptionStatus = adoptionStatus;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isIndoor() {
        return indoor;
    }

    public void setIndoor(boolean indoor) {
        this.indoor = indoor;
    }

    public int getWing_span() {
        return wing_span;
    }

    public void setWing_span(int wing_span) {
        this.wing_span = wing_span;
    }

    public boolean isCan_fly() {
        return can_fly;
    }

    public void setCan_fly(boolean can_fly) {
        this.can_fly = can_fly;
    }
}
