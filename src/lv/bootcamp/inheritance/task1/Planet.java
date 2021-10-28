package lv.bootcamp.inheritance.task1;

public class Planet extends SpaceObject {

    private double mass;
    private int velocityX;
    private int velocityY;

    /**
     * calculates the distance between the planet the method was called from and another planet,
     * transferred as parameter
     * @param otherPlanet - planet to which the distance should be calculated
     * @return (double) distance between two planets
     */
    public double calcDistance(Planet otherPlanet) {
        double dx = Math.abs(otherPlanet.coordinateX - coordinateX); //dx = |x1 - x0|
        // where (x0, y0) - coordinates of our planet and (x1, y1) - coordinates of another planet)
        double dy = Math.abs(otherPlanet.coordinateY - coordinateY); //dy = |y1 - y0|
        // where (x0, y0) - coordinates of our planet and (x1, y1) - coordinates of another planet)
        return Math.sqrt((dx * dx + dy * dy)); // returns hypotenuse using Pythagorean theorem с = (a^2 + b^2)^(1/2)
    }

    /**
     * calculates the Gravity Force between two planets using F = G * m1 * m2 / r^2
     * G - gravitation constant, m1, m2 = masses of the planets , r - distance between them
     * @param otherPlanet - Gravity force is calculated between our planet and otherPlanet
     * @return (double) - the Force
     */
    public double calcForce(Planet otherPlanet) {
        final double G = 6.67E-11;
        // F = G * m1 * m2 / r^2
        return ((G * (double)(mass * otherPlanet.mass) )/(double)(calcDistance(otherPlanet)*calcDistance(otherPlanet)));

    }


    //CONSTRUCTORS
    public Planet() {
    }

    public Planet(double mass) {
        this.mass = mass;
    }

    public Planet(String name, String type, int width, int height, String color, double coordinateX, double coordinateY, double mass) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
    }

    public Planet(double mass, int velocityX, int velocityY) {
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    public Planet(String name, String type, int width, int height, String color, double coordinateX, double coordinateY, double mass, int velocityX, int velocityY) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    //GETTERS AND SETTERS
    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
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


}
