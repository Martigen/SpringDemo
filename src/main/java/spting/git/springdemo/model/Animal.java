package spting.git.springdemo.model;

public class Animal {
    private String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                '}';
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
}
