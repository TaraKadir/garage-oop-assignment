package Garage;

public abstract class Vehicle {
    int yearOfManufacturing;
    String color, regNo;
    Vehicle[] garage = new Vehicle[5];
    int i = 0;

    Vehicle(int yearOfManufacturing, String color, String regNo) {
        this.yearOfManufacturing = yearOfManufacturing;
        this.color = color;
        this.regNo = regNo;
    }

    public void parkVehicle(Vehicle v) {
        if (i < garage.length) {
            garage[i] = v;
            System.out.println("Vehicle added at index " + i);
            i++;

        }
    }

    public void unParkVehicle(Vehicle v) {

    }

}

