package lv.bootcamp.inheritance.task2;

import lv.bootcamp.inheritance.task1.SpaceObject;

public class Spaceship extends SpaceObject {
    private double mass;
    private double velocityX;
    private double velocityY;
    private int direction;
    private int acceleration;
    private int fuel;
    private int fuelConsumption;

    /**
     *
     * @param degrees
     */
    public void rotate(int degrees){
//        return Math.abs(degrees);

    }

    /**
     *
     * @param acc
     */
    public void accelerate(double acc){

    }


    public Spaceship() {
    }

    public Spaceship(String name, String type, double width, double height, String color, double coordinateX, double coordinateY, double mass, double velocityX, double velocityY, int direction, int acceleration, int fuel, int fuelConsumption) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.direction = direction;
        this.acceleration = acceleration;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(double velocityX) {
        this.velocityX = velocityX;
    }

    public double getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(double velocityY) {
        this.velocityY = velocityY;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        if (direction >= 0 && direction <= 360){
            return;
        }
        this.direction = direction;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
