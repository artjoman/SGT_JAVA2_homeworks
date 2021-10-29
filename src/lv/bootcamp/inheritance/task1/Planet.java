package lv.bootcamp.inheritance.task1;

/** Class Planet represents a specific
 * planet as an object in space.
 */

public class Planet extends SpaceObject {

    //Attributes
    private double mass;
    private double velocityX;
    private double velocityY;


    //Custom methods

    /** Calculates the distance between two Planets
     * @param otherPlanet The Planet distance to which is being calculated
     * @return A double equal to the distance between the supplied planet (otherPlanet) and
     * the planet that calls the method.
     */
    public double calcDistance(Planet otherPlanet) {
        //calculating difference between both planet coordinates

        return Math.sqrt(Math.pow(otherPlanet.getCoordinateX() - this.getCoordinateX(), 2) +
                Math.pow(otherPlanet.getCoordinateY() - this.getCoordinateY(), 2));
    }


    /** Calculates the force exerted on this planet by the given planet using gravitational constant
     * and results from calcDistance method
     * @param otherPlanet
     * @return A double describing the force exerted on this planet by the given planet.
     */
    public double calcForce(Planet otherPlanet) {

        //Calling the calcDistance method to use results in this formula
        double r = calcDistance(otherPlanet);

        //The gravitational constant G (6.67 * 10-11 N-m2 / kg2)
        double gravitationalConstant = (6.67 * Math.pow(10, -11));

        //Calculating the force exerted
        return gravitationalConstant * this.mass * otherPlanet.getMass() / (r * r);

    }


    //Constructors
    public Planet() {
    }

    public Planet(double mass, double velocityX, double velocityY) {
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    public Planet(String name, String type, double width, double height, String color, double coordinateX, double coordinateY, double mass, double velocityX, double velocityY) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }


    //toString method
    @Override
    public String toString() {
        return "Planet{" +
                "mass=" + mass +
                ", velocityX=" + velocityX +
                ", velocityY=" + velocityY +
                '}';
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
