package Garage;

public class Boat extends Vehicle {
    String deadWeight;

    Boat(int yearOfManufacturing, String color, String regNo, String deadWeight) {
        super(yearOfManufacturing, color, regNo);
        this.deadWeight = deadWeight;

    }
}
