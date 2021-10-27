package lv.bootcamp.inheritance.task1;

public class Planet extends SpaceObject{

    private double mass;
    private double velocityX;
    private double velocityY;

    public Planet() {
    }

    public Planet(String name, String type, double width, double height, String color, double coordinateX, double coordinateY, double mass, double velocityX, double velocityY) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    /**
     * This method will take in a single Planet and should return a double equal to the distance
     * between the supplied planet and the planet that is doing the calculation
     * (between otherPlanet the parameter, and pp the object on which the calcDistance method is invoked).
     * @param planetCoordinateX - X coordinate for the supplied planet
     * @param otherPlanetCoordinateX - X coordinate for a other planet
     * @param planetCoordinateY - Y coordinate for the supplied planet
     * @param otherPlanetCoordinateY - Y coordinate for a other planet
     * @return a double equal to the distance between planets
     */

    public static double calcDistance(double planetCoordinateX, double otherPlanetCoordinateX, double planetCoordinateY, double otherPlanetCoordinateY) {
        return Math.sqrt(Math.pow((planetCoordinateX -otherPlanetCoordinateX), 2) + Math.pow((planetCoordinateY-otherPlanetCoordinateY), 2));
    }//using formula r2 = dx2 + dy2, where dx is delta/difference between x-coordinates, similarly for dy

    /**
     * This method returns a double describing the force exerted on one of the planet by the given planet.
     * @param planetMass - mass for the supplied planet
     * @param planetCoordinateX - X coordinate for the supplied planet
     * @param planetCoordinateY - Y coordinate for the supplied planet
     * @param otherPlanetMass - mass for the other planet
     * @param otherPlanetCoordinateX - X coordinate for a other planet
     * @param otherPlanetCoordinateY - Y coordinate for a other planet
     * @return a double describing the force
     */
    public static double calcForce(double planetMass, double planetCoordinateX, double planetCoordinateY, double otherPlanetMass, double otherPlanetCoordinateX, double otherPlanetCoordinateY ) {
        double G = 6.67 * Math.pow(10, -11);
        return (G*planetMass*otherPlanetMass) / Math.pow(calcDistance(planetCoordinateX, planetCoordinateY, otherPlanetCoordinateX, otherPlanetCoordinateY), 2);
    }//using formula F = G * m1 * m2 / r2

    @Override
    public String toString() {
        return "Planet{" +
                "mass=" + mass +
                ", velocityX=" + velocityX +
                ", velocityY=" + velocityY +
                '}';
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

