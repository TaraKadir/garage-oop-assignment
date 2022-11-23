package Garage;

public class Car extends Vehicle {
    int numberOfWheels = 4;

    Car(int yearOfManufacturing, String color, String regNo, int numberOfWheels) {
        super(yearOfManufacturing, color, regNo);
        this.numberOfWheels = numberOfWheels;

    }
}
