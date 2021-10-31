package lv.bootcamp.inheritance.task2;

import lv.bootcamp.inheritance.task1.SpaceObject;

public class SpaceShip extends SpaceObject {

    private int mass;
    private int velocityX;
    private int velocityY;
    private int direction;// ( degrees 0 - 360 )
    private int acceleration;
    private String fuel;
    private int fuelConsumption;

    //constructor
    public SpaceShip(String name, String type, int width, int height, String color,
                     int coordinateX, int coordinateY, int mass, int velocityX,
                     int velocityY, int direction, int acceleration, String fuel, int fuelConsumption) {
        super(name, type, width, height, color, coordinateX, coordinateY);

        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.direction = direction;
        this.acceleration = acceleration;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    /**
     * Method rotate the ship by x degrees
     *
     * @param degrees
     * @return direction
     */
    public int rotate(int degrees) {
        direction = this.direction + degrees;
        return direction;
    }

    /**
     * move the ship towards the rotation direction by distance acc.
     * This should update coordinateX and coordinateY values.
     * @param acc
     * @return
     */
    public double[] accelerate(int acc) {
//        DeltaX = cos(α) * acc
//        DeltaY = sin(α) * acc
        double deltaX = acc * Math.cos(Math.toRadians(direction));
        double deltaY = acc * Math.sin(Math.toRadians(direction));
        double a = (this.getCoordinateX() + deltaX);
        double b = (this.getCoordinateY() + deltaY);
        double [] coordinates = {a, b};
        setAcceleration(this.acceleration + acc);
        return (coordinates);
    }
    public static int checkDegrees (int degrees){
        if(degrees > 360){
            degrees %= 360;
        } else if (degrees < 0){
            degrees %= 360;
            degrees += 360;
        }else if(degrees == 360){
            degrees = 0;
        }
        return degrees;
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

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "SpaceShip { " +
                " name=" + getName() +
                " type=" + getType() +
                " width=" + getWidth() +
                " height=" + getHeight() +
                " color=" + getColor() +
                " coordinateX=" + getCoordinateX() +
                " coordinateY=" + getCoordinateY() + "\n" +
                " mass=" + mass +
                ", velocityX=" + velocityX +
                ", velocityY=" + velocityY +
                ", direction=" + direction +
                ", acceleration=" + acceleration +
                ", fuel='" + fuel +
                ", fuelConsumption=" + fuelConsumption +
                "} ";
    }
}