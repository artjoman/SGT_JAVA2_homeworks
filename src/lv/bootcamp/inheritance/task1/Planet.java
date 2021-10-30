package lv.bootcamp.inheritance.task1;

public class Planet extends SpaceObject{

    private double mass;
    private double velocityX;
    private double velocityY;

    /**
     * Method which calculates distance between two planets.
     * @param otherPlanet
     * @return calculation for the distance
     */

    public double calcDistance(Planet otherPlanet) {

       return Math.sqrt(((this.getCoordinateY() - otherPlanet.getCoordinateY()) * (this.getCoordinateY() - otherPlanet.getCoordinateY())) +
                        ((this.getCoordinateX() - otherPlanet.getCoordinateX()) * (this.getCoordinateX() - otherPlanet.getCoordinateX())));

    }

    /**
     * CalcForce method which calculates force between two planets.
     * @param otherPlanet
     * @return calculateion for the force
     */

    public double calcForce (Planet otherPlanet){
        return 6.67e-11 * this.getMass() * otherPlanet.getMass() / (calcDistance(otherPlanet)*calcDistance(otherPlanet));
    }

    public Planet() {
    }

    public Planet(String name, String type, double width, double height, String color, double coordinateX, double coordinateY) {
        super(name, type, width, height, color, coordinateX, coordinateY);
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
