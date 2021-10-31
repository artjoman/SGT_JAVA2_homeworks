package lv.bootcamp.inheritance.task2;

import lv.bootcamp.inheritance.task1.SpaceObject;

public class Spaceship extends SpaceObject {

    private double mass;
    private double velocityX;
    private double velocityY;
    private int direction; //degrees 0 - 360
    private double acceleration;
    private String fuel;
    private double fuelConsumption;
    private Spaceship spaceship;

    public Spaceship() {
    }

    public Spaceship(double coordinateX, double coordinateY, int direction) {
        super(coordinateX, coordinateY);
        this.direction = direction;
    }

    /**
     * Rotates the object by x degrees.
     * @param degrees - how many degrees the object is rotated
     */
    public void rotate(int degrees) {
        spaceship = new Spaceship();

        if (degrees < -360) {
            spaceship.setDirection(360 - Math.abs(degrees % 360));
        } else if (degrees == -360 || degrees == 0 || degrees == 360) {
            spaceship.setDirection(direction);
        } else if (degrees > -360 && degrees < 0) {
            spaceship.setDirection(360 - Math.abs(degrees));
        } else if (degrees > 0 && degrees < 360) {
            spaceship.setDirection(degrees);
        } else if (degrees > 360) {
            spaceship.setDirection(degrees % 360);
        }
        System.out.println(spaceship.getDirection());
    }

    /**
     * Moves the object towards the rotation direction by distance
     * and updates coordinateX and coordinateY values.
     * @param acc - distance
     */
    public void accelerate(double acc) {
        spaceship = new Spaceship();
        spaceship.setDirection(30); // just to check the result

        double deltaX;
        double deltaY;

        deltaX = Math.cos(Math.toRadians(spaceship.getDirection())) * acc;
        deltaY = Math.sin(Math.toRadians(spaceship.getDirection())) * acc;
        spaceship.setCoordinateX(getCoordinateX() + deltaX);
        spaceship.setCoordinateY(getCoordinateY() + deltaY);

        System.out.println(spaceship.getCoordinateX());
        System.out.println(spaceship.getCoordinateY());
    }

    /**
     * Shows current coordinates of the object.
     */
    public void showCurrentCoordinates() {
        System.out.println("Coordinate X: " + spaceship.getCoordinateX() +
                ", coordinate Y: " + spaceship.getCoordinateY());
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

    public Spaceship getSpaceship() {
        return spaceship;
    }

    public void setSpaceship(Spaceship spaceship) {
        this.spaceship = spaceship;
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
                ", spaceship=" + spaceship +
                "} " + super.toString();
    }
}
