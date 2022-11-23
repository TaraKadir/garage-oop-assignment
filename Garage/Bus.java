package Garage;

public class Bus extends Vehicle {
    int numberOfSeats = 16;

    Bus(int yearOfManufacturing, String color, String regNo, int numberOfSeats) {
        super(yearOfManufacturing, color, regNo);
        this.numberOfSeats = numberOfSeats;

    }
}
