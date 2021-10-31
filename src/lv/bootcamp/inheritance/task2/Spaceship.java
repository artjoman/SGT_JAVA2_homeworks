package lv.bootcamp.inheritance.task2;

import lv.bootcamp.inheritance.task1.SpaceObject;

/**
 * Spaceship class for building spaceships
 */
public class Spaceship extends SpaceObject {
    private int mass;
    private double velocityX;
    private double getVelocityY;
    private double direction;
    private double acceleration;
    private String fuel;
    private double fuelConsumption;

    public Spaceship() {
    }

    /**
     * Argument constructor
     *
     * @param coordinateX
     * @param coordinateY
     */
    public Spaceship(double coordinateX, double coordinateY) {
        super(coordinateX, coordinateY);
    }

    /**
     * Argument constructor
     *
     * @param mass
     * @param velocityX
     * @param getVelocityY
     * @param direction
     * @param acceleration
     * @param fuel
     * @param fuelConsumption
     */
    public Spaceship(int mass, double velocityX, double getVelocityY, double direction, double acceleration, String fuel,
                     double fuelConsumption) {
        this.mass = mass;
        this.velocityX = velocityX;
        this.getVelocityY = getVelocityY;
        this.direction = direction;
        this.acceleration = acceleration;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    /**
     * Argument constructor
     *
     * @param name
     * @param type
     * @param width
     * @param height
     * @param color
     * @param coordinateX
     * @param coordinateY
     * @param mass
     * @param velocityX
     * @param getVelocityY
     * @param direction
     * @param acceleration
     * @param fuel
     * @param fuelConsumption
     */
    public Spaceship(String name, String type, int width, int height, String color, double coordinateX, double coordinateY, int mass, double velocityX, double getVelocityY, int direction, double acceleration, String fuel, double fuelConsumption) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.getVelocityY = getVelocityY;
        this.direction = direction;
        this.acceleration = acceleration;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    /**
     * The method rotates the ship by x degrees.
     *
     * @param degrees
     */
    public void rotate(double degrees) {
        setDirection(direction + degrees);
    }

    /**
     * This method moves the ship towards the rotation direction by distance acc.
     * This method updates coordinateX and coordinateY values.
     * @param acc
     */
    public void accelerate(double acc) {

        //used formulas for calculating this:
        //DeltaX = cos(α) * acc
        //DeltaY = sin(α) * acc
        double deltaX = Math.cos(Math.toRadians(getDirection())) * acc;
        double deltaY = Math.sin(Math.toRadians(getDirection())) * acc;

        setCoordinateX(getCoordinateX() + deltaX);
        setCoordinateY(getCoordinateY() + deltaY);
    }

    /**
     * The toString method for class Object returns a string consisting of the name of the class of which the object is
     * an instance.
     *
     * @return a string representation of the object
     */
    @Override
    public String toString() {
        return "Spaceship{" +
                "mass=" + mass +
                ", velocityX=" + velocityX +
                ", getVelocityY=" + getVelocityY +
                ", direction=" + direction +
                ", acceleration=" + acceleration +
                ", fuel='" + fuel + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }



    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public double getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(double velocityX) {
        this.velocityX = velocityX;
    }

    public double getGetVelocityY() {
        return getVelocityY;
    }

    public void setGetVelocityY(double getVelocityY) {
        this.getVelocityY = getVelocityY;
    }

    public double getDirection() {
        return direction;
    }

    /**
     * Direction should represent a value between 0 and 360
     * Validation is in place
     * integer values between 0 and 360 are allowed
     *
     * @param direction - int
     */
    public void setDirection(double direction) {

        if (direction < 0) {
            //Throw an error "Number is too small"
            return;
        } else if (direction > 360) {
            //Throw an error "Number is too large"
            return;
        }
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
