package com.uk;

import java.util.ArrayList;

class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String toString() {
        return year + " " + make + " " + model;
    }


//public class CustomListExample {
    public static void main(String[] args) {
        // Create some Car objects
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Civic", 2021);
        Car car3 = new Car("Ford", "Mustang", 2020);

        // Add the Car objects to an ArrayList
        ArrayList<Car> carsList = new ArrayList<>();
        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);

        // Iterate over the ArrayList and display each Car object
        for (Car car : carsList) {
            System.out.println(car);
        }
    }
}
