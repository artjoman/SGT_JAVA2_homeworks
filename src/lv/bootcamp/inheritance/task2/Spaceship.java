package lv.bootcamp.inheritance.task2;

import lv.bootcamp.inheritance.task1.SpaceObject;

public class Spaceship extends SpaceObject {
    public double mass;
    public double velocityX;
    public double velocityY;
    public int direction;
    public double acceleration;
    public String fuel;
    public double fuelConsumption;

    public Spaceship() {
    }

    public Spaceship(double mass, double velocityX, double velocityY, int direction, double acceleration, String fuel, double fuelConsumption) {
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.direction = direction;
        this.acceleration = acceleration;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    public Spaceship(String name, String type, double width, double height, String color, double coordinateX, double coordinateY, double mass, double velocityX, double velocityY, int direction, double acceleration, String fuel, double fuelConsumption) {
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

    /**
     * Added restriction for direction between 0 and 360 degrees
     * @param direction - int value between 0 and 360 degrees
     */
    public void setDirection(int direction) {
        if(direction < 0 || direction > 360){
            System.out.println("Direction cannot be less than 0 and larger than 360 degrees");
            //how to calculate modulus?
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

    /**
     * Shows properties for a spaceship
     * @return - properties for a spaceship
     */
    public String spaceshipProperties() {
        return " properties: " + '\n' +
                "name=" + name + '\t' +
                "type=" + type + '\t' +
                "width=" + width + '\t' +
                "height=" + height + '\t' +
                "color=" + color + '\t' +
                "coordinateX=" + coordinateX + '\t' +
                "coordinateY=" + coordinateY + '\t' +
                "mass=" + mass + '\t' +
                "velocityX=" + velocityX + '\t' +
                "velocityY=" + velocityY + '\t' +
                "direction=" + direction + '\t' +
                "acceleration=" + acceleration + '\t' +
                "fuel=" + fuel + '\t' +
                "fuelConsumption=" + fuelConsumption;
    }
}
