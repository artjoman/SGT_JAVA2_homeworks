package lv.bootcamp.inheritance.task1;

/**
 * Planet class for creating planets
 */
public class Planet extends SpaceObject {
    private int mass;
    private double velocityX;
    private double velocityY;
    private final double CONSTANT_G = 6.67 * Math.pow(10, -11);  //Gravitational constant

    public Planet() {
    }

    /**
     * Argument constructor
     *
     * @param coordinateX
     * @param coordinateY
     * @param mass
     */
    public Planet(double coordinateX, double coordinateY, int mass) {
        super(coordinateX, coordinateY);
        this.mass = mass;
    }

    /**
     * Argument constructor
     *
     * @param name
     * @param type
     * @param width
     * @param height
     * @param color
     * @param coordinateX
     * @param coordinateY
     * @param mass
     * @param velocityX
     * @param velocityY
     */
    public Planet(String name, String type, int width, int height, String color, int coordinateX, int coordinateY,
                  int mass, double velocityX, double velocityY) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    /**
     * The toString method for class Object returns a string consisting of the name of the class of which the object is
     * an instance.
     *
     * @return a string representation of the object
     */
    @Override
    public String toString() {
        return "Planet{" +
                "mass=" + mass +
                ", velocityX=" + velocityX +
                ", velocityY=" + velocityY +
                '}';
    }

    /**
     * This method calculates the distance between two Planets.
     * This method will take in a single Planet and return a double equal to the distance between the supplied
     * planet and the planet that is doing the calculation.
     *
     * @param otherPlanet
     * @return the distance between two planets.
     */
    public double calcDistance(Planet otherPlanet) {
        //We are calculating distance between two planets using the Pythagorean theorem: the square of the length of the
        // triangle's hypotenuse: AB^2 = AC^2 + CB^2. DeltaX-AC and deltaY - CB.

        //Math.abs() gives the absolute(positive) value of the argument
        double deltaX = Math.abs(otherPlanet.getCoordinateX() - this.getCoordinateX());
        double deltaY = Math.abs(otherPlanet.getCoordinateY() - this.getCoordinateY());

        //Math.hypot() returns sqrt(x2 +y2) without intermediate overflow or underflow
        //Math.sqrt() is used to return the square root of a number.
        return Math.hypot(deltaX, deltaY);
    }

    /**
     * The calcForce method returns a double describing the force exerted on the planet by the given planet.
     *
     * @param otherPlanet
     * @return the calculated force.
     */
    public double calcForce(Planet otherPlanet) {
        //Formula for calculating force is: F = G * m1 * m2 / r2
        //r2 = dx2 + dy2
        //(Note dx is delta/difference between x-coordinates, similarly for dy).

        //where:
        //F - force
        //G - gravitational constant
        //m1 - mass of the first object
        //m2 - mass of the second object
        //r - distance between 2 objects
        double force = this.CONSTANT_G * otherPlanet.getMass() * this.mass / Math.pow(calcDistance(otherPlanet), 2);

        return force;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public double getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(int velocityX) {
        this.velocityX = velocityX;
    }

    public double getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(int velocityY) {
        this.velocityY = velocityY;
    }
}
