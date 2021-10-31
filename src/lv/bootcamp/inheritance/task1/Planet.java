package lv.bootcamp.inheritance.task1;

public class Planet extends SpaceObject {

    private double mass;
    private double velocityX;
    private double velocityY;
    private final double GRAV = (6.67 * Math.pow(10, -11));

    /**
     * Calculates the distance between two Planets.
     * @param otherPlanet
     * @return double of the distance between both planet coordinates
     */
    public double calcDistance(Planet otherPlanet) {

//      Math.sqrt((x2 - x1)^2 + (y2 - y1)^2);
        return Math.sqrt(Math.pow(otherPlanet.getCoordinateX() - this.getCoordinateX(), 2) +
                Math.pow(otherPlanet.getCoordinateY() - this.getCoordinateY(), 2));
    }

    /*
    Formulas: F = G * m1 * m2 / r^2 ; r^2 = dx^2 + dy^2
    Where:
        F - force
        G - gravitational constant (6.67 * 10^-11 N-m^2 / kg^2)
        m1 - mass of the first object
        m2 - mass of the second object
        r - distance between 2 objects
        dx - x2-x1
        dy - y2-y1
        (100 * 200 * 6.67 * 10^-11) / sqrt((10-3)^2 + (8-5)^2)
    */

    /**
     * Calculates the force exerted on a planet by the given planet.
     * @param otherPlanet
     * @return double of formula
     */
    public double calcForce(Planet otherPlanet) {
        double r = Math.pow(calcDistance(otherPlanet), 2);
        return (GRAV * this.mass * otherPlanet.mass) / r;
    }


    public Planet() {
    }


    public Planet(String name, String type, double width, double height, String color, double coordinateX, double coordinateY, double mass, double velocityX, double velocityY) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    public Planet(double mass, double velocityX, double velocityY) {
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
