package lv.bootcamp.inheritance.task1;

/**
 * Child class for calculation methods. Extends SpaceObject.
 */

public class Planet extends SpaceObject {

    double mass;
    double velocityX;
    double velocityY;

    /**
     * method that calculates distance between 2 objects
     *
     * @param planet2 - object - planet
     * @return - returns calculated distance
     */
    public double calcDistance(Planet planet2) {

        return Math.sqrt(Math.pow((this.coordinateX - planet2.coordinateX), 2) + Math.pow(
                (this.coordinateY - planet2.coordinateY), 2));
    }

    /**
     * method that calculates force between 2 objects
     *
     * @param planet2 - object - planet
     * @return - returns calculated force
     */
    public double calcForce(Planet planet2) {
        double G = 6.67e-11;
        return (G * this.mass * planet2.mass) / Math.pow(calcDistance(planet2), 2);
    }

    public Planet() {
    }

    public Planet(double mass, double coordinateX, double coordinateY) {
        this.mass = mass;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public Planet(String name, String type, double width, double height, String color, double coordinateX, double coordinateY, double mass, double velocityX, double velocityY) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
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
}
