package lv.bootcamp.inheritance.task2;

import lv.bootcamp.inheritance.task1.SpaceObject;


/**Class Spaceship represents a specific spaceship in space that
 * extends SpaceObject
 */

public class Spaceship extends SpaceObject {

    //Attributes
    private double mass;
    private double velocityX;
    private double velocityY;
    private double direction; //( degrees 0 - 360 )
    private double acceleration;
    private double fuel;
    private double fuelConsumption;

    /**
     * Rotates the ship by a given amount of degrees and sets its direction
     * @param degrees the amount of degrees by witch the ship must be rotated
     */
    //Custom methods
    public void rotate(double degrees) {
        // ( remember direction cannot be less than 0 and larger than 360. Calculate the remaining modulus)
        degrees = degrees % 360;
        if (degrees < 0) {
            degrees += 360;
        }
        this.direction = degrees;
   }

    /**
     * Moves the ship towards the previously calculated and set rotation direction by distance acc.
     * Then updates coordinateX and coordinateY values.
     * @param acc distance by witch the ship must move
     */
    public void accelerate(double acc) {
        double deltaX = acc * Math.cos(Math.toRadians(this.direction));
        this.setCoordinateX(this.getCoordinateX() + deltaX);

        double deltaY = acc * Math.sin(Math.toRadians(this.direction));
        this.setCoordinateY(this.getCoordinateY() + deltaY);
    }


    /**
     * Prints updated, current coordinates of the ship
     * @return the coordinates x and y in a string
     */
    public String showCoordinates() {
        return "COORDINATES - X: " + this.getCoordinateX() + " | Y: " + this.getCoordinateY();
    }


    //Constructors
    public Spaceship() {
    }

    public Spaceship(double mass, double velocityX, double velocityY, int direction, double acceleration, double fuel, double fuelConsumption) {
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.direction = direction;
        this.acceleration = acceleration;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }


    //toString
    @Override
    public String toString() {
        return "Spaceship{" +
                "mass=" + mass +
                ", velocityX=" + velocityX +
                ", velocityY=" + velocityY +
                ", direction=" + direction +
                ", acceleration=" + acceleration +
                ", fuel=" + fuel +
                ", fuelConsumption=" + fuelConsumption +
                '}';
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
