package org.example;

//Задача 1:
//1 Создайте абстрактный класс "Animal" с полями "name" и "age".
//2 Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
//3 Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
//3.1 Выведите на экран информацию о каждом объекте.
//3.2 Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vas'ka", 3, "myau-myau");
        Cat cat2 = new Cat("Murka", 2, "miu-miu");
        Cat cat3 = new Cat("Gav", 5, "myav-myav");
        Dog dog1 = new Dog("Muhtar", 5, "gaf-gaf");
        Dog dog2 = new Dog("Apollo", 8, "voof-voof");
        Dog dog3 = new Dog("Sharik", 2, "tyav-tyav");
        Animal[] animals = new Animal[]{cat1, cat2, cat3, dog1, dog2, dog3};

        Arrays.stream(animals).forEach(classes -> {
            System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            System.out.println(classes);
            System.out.println("Class name: " + classes.getClass().getSimpleName());
            System.out.println("\nDeclaredMethods:");
            Arrays.stream(classes.getClass().getDeclaredMethods()).forEach(System.out::println);
            System.out.println("\nDeclaredFields:");
            Arrays.stream(classes.getClass().getDeclaredFields()).forEach(System.out::println);
            System.out.print("\nmakeSound(): ");
            try {
                Method method = classes.getClass().getDeclaredMethod("makeSound");
                method.setAccessible(true);
                System.out.println(method.invoke(classes));
            } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                e.printStackTrace();
            }
        });
    }
}
