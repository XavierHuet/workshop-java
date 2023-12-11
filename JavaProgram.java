/*
** EPITECH PROJECT, 2023
** workshop-java
** File description:
** JavaProgeam
*/

public class JavaProgram {
    public static void main(String []args) {
        Vehicle car1 = new Vehicle("Volkswagen", "Scirocco", 2008);
        car1.Describe();
        car1.Accelerate();
        System.out.println("----------------------------------------------");
        Vehicle car2 = new Vehicle("Ferrari", "Testarossa", 1984);
        car2.Describe();
        Car car3 = new Car(1656, 4);
        car3.Describe();
        Truck car4 = new Truck(6, 6000, "Scanaia", "Testarossa", 1984);
        car4.Describe();
        }
}