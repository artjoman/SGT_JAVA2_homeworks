package lv.bootcamp.inheritance.task1;

public class Planet extends SpaceObject {

    private double mass;
    private double velocityX;
    private double velocityY;

    //Constructors
    public Planet() {
    }

    public Planet(String name, String type, double width, double height, String color, double coordinateX, double coordinateY, double mass, double velocityX, double velocityY) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    //Methods

    /**
     * Method - calcDistance(otherPlanet).
     * This method calculates the distance between two Planets.
     * Realized formula --> r2 = dx2 + dy2
     *
     * @param planet
     * @return
     */
    public double calcDistance(Planet planet) {
        double x1 = getCoordinateX();
        double y1 = getCoordinateY();
        double x2 = planet.getCoordinateX();
        double y2 = planet.getCoordinateY();
        double distanceBetweenPlanets;
        distanceBetweenPlanets = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        return distanceBetweenPlanets;
    }

    /**
     * Method - calcForce(otherPlanet).
     * F = G * m1 * m2 / (r*r)
     * In this method is used Constant G = (6.67 * 10-11 N-m2 / kg2).
     * Method returns a double describing the force exerted on the planet by the another planet.
     *
     * @return
     */
    public double calcForce(Planet planet) {
        double CONSTANT_G = 6.67 * Math.pow(10, -11);

        double m1 = getMass();
        double m2 = planet.getMass();

        double r = calcDistance(planet);
        double forceResult = (CONSTANT_G * m1 * m2) / (r * r);
        return forceResult;
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
