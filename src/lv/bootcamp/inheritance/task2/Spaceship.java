package lv.bootcamp.inheritance.task2;

import lv.bootcamp.inheritance.task1.SpaceObject;

public class Spaceship extends SpaceObject {

    private double mass;
    private double velocityX;
    private double velocityY;
    private double direction;
    private double acceleration;
    private String fuel;
    private double fuelConsumption;

    //Constructors
    public Spaceship() {
    }

    public Spaceship(String name, String type, double width, double height, String color, double coordinateX, double coordinateY, double mass, double velocityX, double velocityY, double direction, double acceleration, String fuel, double fuelConsumption) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.direction = direction;
        this.acceleration = acceleration;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }
//Methods

    /**
     * Method - rotate(degrees).
     * This method rotates the ship by x degrees.
     *
     * @param degrees
     */
    public void rotate(double degrees) {
        double rotatedX, rotatedY;
        if (degrees > 360) {
            degrees = degrees - 360;
        } else if (degrees < 0) {
            degrees = degrees + 360;
        }
        double degreesToRadians = Math.toRadians(degrees);
        rotatedX = this.getCoordinateX() * Math.cos(degreesToRadians) + this.getCoordinateY() * Math.sin(degreesToRadians);
        rotatedY = this.getCoordinateX() * Math.sin(degreesToRadians) + this.getCoordinateY() * Math.cos(degreesToRadians);
        System.out.println("New coordinates after rotation for " + this.getName() + " are: X --> " + rotatedX + " Y --> " + rotatedY);
    }

    /**
     * Method - accelerate(acc).
     * This method moves the ship towards the rotation direction by distance acc.
     * Used formulas: DeltaX = cos(α) * acc /// DeltaY = sin(α) * acc
     *
     * @param acc - distance.
     * @return
     */
    public void accelerate(double acc) {
        double DeltaX, DeltaY;
        double directionInRadians = Math.toRadians(this.getDirection());
        DeltaX = this.getCoordinateX() + (Math.cos(directionInRadians) * acc);
        DeltaY = this.getCoordinateX() + (Math.sin(directionInRadians) * acc);
        System.out.println("New coordinates after acceleration for " + this.getName() + " are: X --> " + DeltaX + " Y --> " + DeltaY);
    }

    //Getters and Setters
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

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
