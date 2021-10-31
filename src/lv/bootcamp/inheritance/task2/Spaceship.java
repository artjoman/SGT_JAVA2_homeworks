package lv.bootcamp.inheritance.task2;

import lv.bootcamp.inheritance.task1.SpaceObject;
import lv.bootcamp.inheritance.task3.MyFrame;


public class Spaceship extends SpaceObject {

    private int mass;
    private int velocityX;
    private int velocityY;
    private int direction;
    private int acceleration;
    private String fuel;
    private String fuelConsumption;


    //Constructor that uses MyFrame class to bind keys for spaceship manipulation
    public Spaceship() {
        System.out.println();
        System.out.println("Spaceship created. Use arrow keys to rotate and accelerate, use spacebar " +
                "to display current coordinates");
        MyFrame myFrame = new MyFrame(this);
    }


    public Spaceship(int mass, int velocityX, int velocityY, int direction, int acceleration, String fuel, String fuelConsumption) {
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.direction = checkDirectionRange(direction);
        this.direction = direction;
        this.acceleration = acceleration;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    public Spaceship(String name, String type, int width, int height, String color, double coordinateX, double coordinateY, int mass, int velocityX, int velocityY, int direction, int acceleration, String fuel, String fuelConsumption) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.acceleration = acceleration;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    // simple constructor with some of the parameters
    public Spaceship(double coordinateX, double coordinateY, int direction) {
        super.setCoordinateX(coordinateX);
        super.setCoordinateY(coordinateY);
        this.direction = checkDirectionRange(direction);
    }

    /**
     * Method to rotate spaceship. Adds degrees to already existing direction.
     * Includes checkDirectionRange() method to make sure that the direction range is 0-360 degrees.
     * @param degrees - amount of degrees by which spaceship will be rotated
     */
    public void rotate(int degrees) {
        this.direction = checkDirectionRange(this.direction + degrees);
    }


    /**
     * Method to accelerate the spaceship. Method sets the new coordinates for spaceship after being accelerated.
     * @param acc - amount of acceleration
     */
    public void accelerate(int acc) {
        this.setCoordinateX(this.getCoordinateX() + Math.cos(Math.toRadians(this.direction)) * acc);
        this.setCoordinateY(this.getCoordinateY() + Math.sin(Math.toRadians(this.direction)) * acc);
    }

    /**
     * Method to keep direction in range of 0-360 degrees
     * @param direction - spacechip's direction
     * @return - returns the direction or corrected direction if the given direction is outside of range 0-360 degrees
     */
    public static int checkDirectionRange(int direction) {
        if (direction >= 0) {
            direction = direction % 360;    // if direction >360, modulus is used instead
        } else if (direction < 0) {
            direction = 360 + direction % 360;  // if direction is <0, the negative modulus is added to 360 degrees
        }
        return direction;
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

    public void setDirection(int direction) {
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

    public String getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(String fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "Spaceship { " +
                "mass: " + mass +
                " | coordinateX: " + getCoordinateX() +
                ", coordinateY: " + getCoordinateY() +
                " | velocityX: " + velocityX +
                ", velocityY: " + velocityY +
                " | direction: " + direction +
                " | acceleration: " + acceleration +
                " | fuel: '" + fuel + '\'' +
                ", fuelConsumption: '" + fuelConsumption + "}";
    }
}
