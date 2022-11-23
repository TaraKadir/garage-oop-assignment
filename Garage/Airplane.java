package Garage;

public class Airplane extends Vehicle {
    String fly;

    Airplane(int yearOfManufacturing, String color, String regNo, String fly) {
        super(yearOfManufacturing, color, regNo);
        this.fly = fly;
    }
}
