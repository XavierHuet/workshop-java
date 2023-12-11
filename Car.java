/*
** EPITECH PROJECT, 2023
** workshop-java
** File description:
** car
*/

public class Car extends Vehicle {
    int Weight;
    int Wheels;

    public car(int wheels, int weight) {
        Wheels = wheels;
        Weight = weight;
    }
    public void Describe() {
        System.out.printf("I'm a Car, I weight %d and I have %d wheels", Weight, Wheels);
    }
}