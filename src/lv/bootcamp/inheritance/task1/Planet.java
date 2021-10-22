package lv.bootcamp.inheritance.task1;

public class Planet extends SpaceObject{

    private int mass;
    private double velocityX;
    private double velocityY;
    private final double CONSTANT_G = 6.67 * Math.pow(10, -11);

    public Planet() {
    }

    public Planet(int mass, double velocityX, double velocityY) {
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    public Planet(String name, String type, int width, int height, String colour, double coordinateX, double coordinateY,
                  int mass, double velocityX, double velocityY) {
        super(name, type, width, height, colour, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    /**
     * Calculates the distance between two Planets.
     * This method takes in a single Planet and returns a double equal to the distance between the supplied planet and
     * the planet that is doing the calculation (the object on which the calcDistance method is invoked).
     * @param otherPlanet - Planet object that distance is calculated to
     * @return - distance between two planets
     */
    public double calcDistance(Planet otherPlanet) {
        double deltaX = Math.abs(this.getCoordinateX() - otherPlanet.getCoordinateX());
        double deltaY = Math.abs(this.getCoordinateY() - otherPlanet.getCoordinateY());

        return Math.sqrt((deltaX * deltaX) + (deltaY * deltaY));
    }

    /**
     * Returns a double describing the force exerted on another planet by the given (first) planet.
     * @param otherPlanet - Planet object that force exerted by the first planet is calculated on
     * @return - force
     */
    public double calcForce(Planet otherPlanet) {
        return (CONSTANT_G * this.getMass() * otherPlanet.getMass())/calcDistance(otherPlanet);
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
