/*
** EPITECH PROJECT, 2023
** workshop-java
** File description:
** Truck
*/

public class Truck extends Vehicle {
    int Weight;
    int Wheels;

    public Truck(int wheels, int weight, String brand, String model, int year) {
        super(brand, model, year);
        Wheels = wheels;
        Weight = weight;
    }
    public void Describe() {
        System.out.printf("I'm a Truck, I weight %d and I have %d wheels", Weight, Wheels);
    }
}