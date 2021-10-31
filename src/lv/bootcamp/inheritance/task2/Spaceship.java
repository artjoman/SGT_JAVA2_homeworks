package lv.bootcamp.inheritance.task2;

import lv.bootcamp.inheritance.task1.SpaceObject;
import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Spaceship class that inherits SpaceObject class.
 * Additional Spaceship attributes defined in this class.
 * Contains methods to rotate and accelerate a Spaceship object.
 * ??Contains methods that bind keyboard keys to actions/methods - I am not sure this works.??
 * Contains constructors, getters and setters, and toString methods.
 * setDirection method includes input data validation.
 */
public class Spaceship extends SpaceObject {

    private int mass;
    private double velocityX;
    private double velocityY;
    private int direction;
    private double acceleration;
    private String fuel;
    private double fuelConsumption;

    public Spaceship() {
    }

    public Spaceship(int mass, double velocityX, double velocityY, int direction, double acceleration, String fuel,
                     double fuelConsumption) {
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.direction = direction;
        this.acceleration = acceleration;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    public Spaceship(String name, String type, int width, int height, String colour, double coordinateX,
                     double coordinateY, int mass, double velocityX, double velocityY, int direction,
                     double acceleration, String fuel, double fuelConsumption) {
        super(name, type, width, height, colour, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.direction = direction;
        this.acceleration = acceleration;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    /**
     * Rotates the ship by x degrees.
     * @param degrees - int value of degrees
     */
    public void rotate(int degrees) {
        setDirection(degrees);
    }

    /**
     * Moves the ship towards the rotation direction by distance acc.
     * This method then updates coordinateX and coordinateY values.
     * @param acc - int value of distance
     */
    public void accelerate(int acc) {
        double coordinateX1 = this.getCoordinateX();
        double coordinateY1 = this.getCoordinateY();
        int angle = this.getDirection();

        double deltaX = Math.cos(angle) * acc;
        double deltaY = Math.sin(angle) * acc;

        setCoordinateX(coordinateX1 + deltaX);
        setCoordinateY(coordinateY1 + deltaY);
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

    public double getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(double velocityY) {
        this.velocityY = velocityY;
    }

    public int getDirection() {
        return direction;
    }

    /**
     * Direction value validation added.
     * Direction cannot be less than 0 and larger than 360.
     * @param direction - int value between 0 and 360 (degrees)
     */
    public void setDirection(int direction) {
        if (direction < 0) {
            this.direction = Math.abs(direction %360);
        } else if (direction > 360) {
            this.direction = direction %360;
        } else {
            this.direction = direction;
        }
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

    /**
     * Binds keyboard left arrow key to the method rotate in following way:
     * WHEN pressing left arrow - call rotate method with -1 value.
     */
    public class LeftKey extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            rotate(-1);
        }
    }

    /**
     * Binds keyboard right arrow key to the method rotate in following way:
     * WHEN pressing right arrow - call rotate method with +1 value.
     */
    public class RightKey extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            rotate(+1);
        }
    }

    /**
     * Binds keyboard up arrow key to the method rotate in following way:
     * WHEN pressing up arrow - call accelerate method with +1 value.
     */
    public class UpKey extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            accelerate(+1);
        }
    }

    /**
     * Binds keyboard down arrow key to the method rotate in following way:
     * WHEN pressing down arrow - call accelerate method with -1 value.
     */
    public class DownKey extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            accelerate(-1);
        }
    }

    /**
     * Binds keyboard space key in following way:
     * WHEN pressing SPACE - show Spaceship's current coordinates.
     */
    public class SpaceKey extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(getCoordinateX() + getCoordinateY());
        }
    }

    @Override
    public String toString() {
        return "Spaceship{" +
                "mass=" + mass +
                ", velocityX=" + velocityX +
                ", velocityY=" + velocityY +
                ", direction=" + direction +
                ", acceleration=" + acceleration +
                ", fuel='" + fuel + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
