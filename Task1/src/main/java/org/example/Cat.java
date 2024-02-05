package org.example;

public class Cat extends Animal {
    private String catSound;

    public Cat(String name, int age, String catSound) {
        super(name, age);
        this.catSound = catSound;
    }

    private String makeSound() {
        return catSound;
    }

    public void setCatSound(String catSound) {
        this.catSound = catSound;
    }
}
