package lv.bootcamp.inheritance.task1;

public class Planet extends SpaceObject{

    private double mass;
    private double velocityX;
    private double velocityY;
    private final double CONSTANT_G = 6.67 * Math.pow(10, -11);

    public Planet() {
    }

    public Planet(double mass, double coordinateX, double coordinateY) {
        super(coordinateX, coordinateY);
        this.mass = mass;
    }

    public Planet(String name, String type, int width, int height, String color, double coordinateX, double coordinateY,
                  int mass, double velocityX, double velocityY) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }


    /**
     * Calculates the distance between two Planets.
     * This method will return a double equal to the distance between the supplied planet
     * and the planet that is doing the calculation - the object on which the calcDistance method is invoked.
     * @param otherPlanet - Planet object of supplied planet
     * @return - distance between two planets
     */
    public double calcDistance(Planet otherPlanet) {
        double dX = getCoordinateX() - otherPlanet.getCoordinateX();
        double dY = getCoordinateY() - otherPlanet.getCoordinateY();
        double distancePlanets;
        distancePlanets = Math.sqrt(Math.pow(dX, 2) + Math.pow(dY, 2));
        return distancePlanets;
    }

    /**
     * Returns a double describing the force exerted on another planet by the given (first) planet.
     * F = G * m1 * m2 / r^2
     * F - force
     * G - gravitational constant
     * m1 - mass of the first planet
     * m2 - mass of the second planet
     * r - distance between 2 objects, by calling method calcDistance()
     * @param otherPlanet - Planet object that force exerted by the first planet is calculated on
     * @return - force
     */
    public double calcForce(Planet otherPlanet) {
        return (CONSTANT_G * this.getMass() * otherPlanet.getMass())/(calcDistance(otherPlanet));
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
                '}';
    }
}
