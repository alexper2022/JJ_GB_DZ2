package org.example;

public class Dog extends Animal {
    private String dogSound;

    public Dog(String name, int age, String dogSound) {
        super(name, age);
        this.dogSound = dogSound;
    }

    private String makeSound() {
        return dogSound;
    }

    public void setDogSound(String dogSound) {
        this.dogSound = dogSound;
    }
}
