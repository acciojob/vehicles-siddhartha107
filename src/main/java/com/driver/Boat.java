package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private int capacity;



    @Override
    public String getVehicleName() {
        this.name = name;
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        this.capacity = capacity;
        return capacity;
    }
}
