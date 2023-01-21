package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    boolean vehicleisMoving;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public Vehicle(String name) {
           this.name = name;

    }

    public Vehicle() {
        this.currentSpeed = 0;
        this.currentDirection = 0;
        this.vehicleisMoving = false;
    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        if(!vehicleisMoving) {
            this.currentDirection = this.currentDirection + direction;
            this.vehicleisMoving = true;
        }
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
        if(!vehicleisMoving) {
            this.currentSpeed = this.currentSpeed + speed;
            this.currentDirection = this.currentDirection + direction;
            this.vehicleisMoving = true;
        }
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }


    public void stop(){
        if(vehicleisMoving) {
            getCurrentSpeed();

        }

        System.out.println("stop method called - The vehicle is stopped");
    }

}
