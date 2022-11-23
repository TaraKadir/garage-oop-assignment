package Garage;

public class Motorcycle extends Vehicle {
    int numberOfWheels = 2;

    Motorcycle(int yearOfManufacturing, String color, String regNo, int numberOfWheels) {
        super(yearOfManufacturing, color, regNo);
        this.numberOfWheels = numberOfWheels;

    }
}
