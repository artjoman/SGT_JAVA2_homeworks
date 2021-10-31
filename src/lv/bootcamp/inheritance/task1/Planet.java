package lv.bootcamp.inheritance.task1;

public class Planet extends SpaceObject {

    private int mass;
    private int velocityX;
    private int velocityY;

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
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

    public Planet() {
    }

    // Gravitational constant
    public static final double G = 6.674 * Math.pow(10, -11);

    /**
     * Returns distance between two planets.
     * @param otherPlanet   Planet object
     * @return              distance
     */
    // r^2 = dx^2 + dy^2 where d is delta (difference between coordinates)
    public double calcDistance(Planet otherPlanet) {

        double r;  // Distance

        double dx = this.getCoordinateX() - otherPlanet.getCoordinateX();
        double dy = this.getCoordinateY() - otherPlanet.getCoordinateY();

        r = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));  // r = sqrt(dx^2 + dy^2)

        return r;

    }

    /**
     * Returns gravitational force between two planets.
     * @param otherPlanet   Planet object
     * @return              force
     */
    // F = G * ((m1 * m2) / r^2)
    public double calcForce(Planet otherPlanet) {

        double f;  // Force

        double r = this.calcDistance(otherPlanet);

        f = G * ((this.mass * otherPlanet.mass) / Math.pow(r, 2));

        return f;

    }

}
