package lv.bootcamp.inheritance.task1;

public class Planet extends SpaceObject {

    private double mass;
    private double velocityX;
    private double velocityY;

    public Planet() {
    }

    public Planet(double mass, double coordinateX, double coordinateY) {
        super(coordinateX, coordinateY);
        this.mass = mass;
    }

    public Planet(String name, String type, double width, double height, String color, double coordinateX,
                  double coordinateY, double mass, double velocityX, double velocityY) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    /**
     * Calculates the distance between two Planets.
     * r^2 = dx^2 + dy^2
     * r - distance between 2 objects
     * dx - delta/difference between x-coordinates
     * dy - delta/difference between y-coordinates
     * @param otherPlanet - the supplied planet
     * @return - the distance between two objects
     */
    public double calcDistance(Planet otherPlanet) {
        double dx = (getCoordinateX() - otherPlanet.getCoordinateX());
        double dy = (getCoordinateY() - otherPlanet.getCoordinateY());
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    /**
     * Describes the force exerted on one planet by the given planet.
     * F = G * m1 * m2 / r^2
     * F - force
     * G - gravitational constant
     * m1 - mass of the first planet
     * m2 - mass of the second planet
     * r - distance between 2 objects, by calling method calcDistance()
     * @param otherPlanet - the supplied planet
     * @return - the force exerted on one planet by the given planet.
     */
    public double calcForce(Planet otherPlanet) {
        final double G = 6.67 * Math.pow(10, -11);
        double m1 = getMass();
        double m2 = otherPlanet.getMass();
        return (G * m1 * m2) / Math.pow(calcDistance(otherPlanet), 2);
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

    @Override
    public String toString() {
        return "Planet{" +
                "mass=" + mass +
                ", velocityX=" + velocityX +
                ", velocityY=" + velocityY +
                "} " + super.toString();
    }
}
