package lv.bootcamp.inheritance.task2;

import lv.bootcamp.inheritance.task1.SpaceObject;

public class Spaceship extends SpaceObject {

    private double mass;
    private double velocityX;
    private double velocityY;
    private double direction;
    private double acceleration;
    private double fuel;
    private double fuelConsumption;

    public Spaceship() {
    }

    public Spaceship(String name, String type, double width, double height, String color, double coordinateX, double coordinateY, double mass, double velocityX, double velocityY, double direction, double acceleration, double fuel, double fuelConsumption) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.direction = direction;
        this.acceleration = acceleration;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    public void rotateDirection(double degrees) {
        setDirection(degrees);
    }

    public void accelerateAcc(double acc) {

        double coordinateX1 = this.getCoordinateX();
        double coordinateY1 = this.getCoordinateY();

        double deltaX = Math.cos(this.getDirection()) * acc;
        double deltaY = Math.sin(this.getDirection()) * acc;

        setCoordinateX(coordinateX1 + deltaX);
        setCoordinateY(coordinateY1 + deltaY);
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

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}


