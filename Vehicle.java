/*
** EPITECH PROJECT, 2023
** workshop-java
** File description:
** vehicle
*/

public class Vehicle {
    String Brand;
    String Model;
    int Year;

    public Vehicle(String brand, String model, int year) {
        Brand = brand;
        Model = model;
        Year = year;
    }

    public void Accelerate() {
        System.out.println("I'm putting the pedal to the metal");
    }

    public void Brake() {
        System.out.println("Woah! Slow down boy!");
    }

    public void Describe() {
        System.out.println("I'm " + Brand + " " + Model + " " + "made in " + Year);
    }
}