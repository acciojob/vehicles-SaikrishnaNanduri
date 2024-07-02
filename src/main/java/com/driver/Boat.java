package com.driver;public class Boat  implements WaterVehicle{
    private String name;
    private int capacity;


    public Boat() {
        // Default initialization
    }

    // Constructor with parameters
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }

    @Override
    public String getVehicleName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
