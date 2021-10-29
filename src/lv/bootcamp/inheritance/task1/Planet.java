package lv.bootcamp.inheritance.task1;

public class Planet extends SpaceObject{
    private double mass;
    private double velocityX;
    private double velocityY;

    public Planet() {
    }

    /**
     * Calculating distance between 2 planets
     * @param otherPlanet dX = difference between X coordinates, dY = difference between Y coordinates
     * @return r2 = dx2 + dy2 (d-delta, r-distance between 2 objects)
     */
    public double calcDistance(Planet otherPlanet){

        double dX = otherPlanet.getCoordinateX() - this.getCoordinateX();
        double dY = otherPlanet.getCoordinateY() - this.getCoordinateY();

        double distance = Math.sqrt(Math.pow(dX, 2) + Math.pow(dY, 2));
        return distance;

    }

    /**
     * Calculating force
     * @param otherPlanet G(Gravitational Constant) = 6.67 * 10-11 N-m2 / kg2
     * @return Force = (Gravitational Constant * mass of first Planet * mass of second Planet)/ calcDistance^2
     */
    public double calcForce(Planet otherPlanet) {

        double G = (6.67 * Math.pow(10, -11));
        double r = calcDistance(otherPlanet);

        double force = G * this.mass * otherPlanet.getMass() / (r * r);
        return force;
    }

        //Constructors and getters/setters
    public Planet(double mass) {
        this.mass = mass;

    }

    public Planet(String name, String type, double width, double height, String color, double coordinateX, double coordinateY, double mass, double velocityX, double velocityY) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;

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
