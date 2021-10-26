package lv.bootcamp.inheritance.task1;

public class Planet extends SpaceObject {

    private double mass;
    private double velocityX;
    private double velocityY;

    //Constructors
    public Planet() {
    }

    public Planet(double mass, double velocityX, double velocityY) {
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
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
}
