package lv.bootcamp.inheritance.task2;

import lv.bootcamp.inheritance.task1.SpaceObject;

/**
 * Class Spaceship that extends SpaceObject class
 * contains attributes: mass, velocityX, velocityY,direction(validation is in place - integers from 0 till 360 are allowed,
 * acceleration,fuel, fuelConsumption.
 * contains methods: rotate(degrees)(direction cannot be less than 0 and larger than 360) and accelerate(acc)
 */
public class Spaceship extends SpaceObject {
    private int mass;
    private int velocityX;
    private int velocityY;
    private int direction;
    private int acceleration;
    private String fuel;
    private int fuelConsumption;

    public Spaceship() {
    }

    /**
     * Constructor with arguments for spaceship with parameters, parameter "direction" is is supplemented with validation:
     * @param name            - String
     * @param type            -String
     * @param width           int
     * @param height          -int
     * @param color           - String
     * @param coordinateX     - int
     * @param coordinateY     - int
     * @param mass            -int
     * @param velocityX       -int
     * @param velocityY       - int
     * @param direction       - int, validation from setter for variable "direction" is in place, values from 0 till 360 are allowed
     * @param acceleration    -int
     * @param fuel            - String
     * @param fuelConsumption -int
     */
    public Spaceship(String name, String type, int width, int height, String color, int coordinateX, int coordinateY, int mass, int velocityX, int velocityY, int direction, int acceleration, String fuel, int fuelConsumption) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.setDirection(direction);
        this.acceleration = acceleration;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    /**
     * method "rotate" to rotate the ship by x degrees (direction cannot be less than 0 and larger than 360),
     * if direction is less than 0 and larger than 360, it is calculated by modulus of dividing with 360
     * @param degrees -(degrees for which spaceship is rotated) int
     * @return int: new direction in degrees for object is set and returned
     */
    public int rotate(int degrees) {
        int rotateDirection = getDirection() + degrees;
        if (rotateDirection < 0 && rotateDirection >= -360) {
            return this.direction = rotateDirection + 360;
        } else if (rotateDirection < -360) {
            return this.direction = rotateDirection % 360 + 360;
        } else if (rotateDirection > 360) {
            return this.direction = rotateDirection % 360;
        } else {
            return this.direction = rotateDirection;
        }
    }
    /**
     * Method "accelerate" to move the ship towards the rotation direction by distance acc.
     * coordinateX and coordinateY values are updated accordingly
     * @param acc - int ( the distance the spaceship is moved)
     * @return void
     */
    public void accelerate(int acc) {

        double deltaY = Math.sin(Math.toRadians(getDirection())) * acc;
        double deltaX = Math.cos(Math.toRadians(getDirection())) * acc;
        setCoordinateX(getCoordinateX() + deltaX);
        setCoordinateY(getCoordinateY() + deltaY);
//        System.out.println("Coordinate x: " + getCoordinateX());
//        System.out.println("Coordinate y: " + getCoordinateY());
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(int velocityX) {
        this.velocityX = velocityX;
    }

    public int getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(int velocityY) {
        this.velocityY = velocityY;
    }

    public int getDirection() {
        return direction;
    }

    /**
     * Validation is in place
     * integers from 0 till 360 are allowed
     *
     * @param direction -int
     */
    public void setDirection(int direction) {

        if ((direction < 0) || (direction > 360)) {
            //Trow an error;
//                return;
//            Should throw an exception, but for now program is printing out sentence:
            System.out.println("Direction should be from 0-360");
        }
        this.direction = direction;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}


