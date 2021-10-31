package lv.bootcamp.inheritance.task1;

public class Planet extends SpaceObject {

    private int mass;
    private int velocityX;
    private int velocityY;

    public Planet(int mass, int velocityX, int velocityY) {
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    public Planet(int mass, double coordinateX, double coordinateY) {
        this.mass = mass;
        super.setCoordinateX(coordinateX);
        super.setCoordinateY(coordinateY);
    }


    public Planet(String name, String type, int width, int height, String color, double coordinateX, double coordinateY, int mass, int velocityX, int velocityY) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    /**
     * Method to calculate distance between two planets. To be used on a planet, the other planet is
     * passed in as a parameter
     * @param otherPlanet - planet to calculate distance to
     * @return - returns distance between to planets
     */
    public double calcDistance(Planet otherPlanet) {
        // coordinates for the planet that uses the method
        double coordXone = super.getCoordinateX();
        double coordYone = super.getCoordinateY();
        // coordinates for the planet distance will be calculated to
        double coordXtwo = otherPlanet.getCoordinateX();
        double coordYtwo = otherPlanet.getCoordinateY();

        // calculating difference between both planets' coordinates X and Y
        double dx = Math.max(coordXone, coordXtwo) - Math.min(coordXone, coordXtwo);
        double dy = Math.max(coordYone, coordYtwo) - Math.min(coordYone, coordYtwo);

        // using Pythagorean theorem to calculate the distance
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Method to calculate the force exerted on this planet by the given planet (otherPlanet)
     * @param otherPlanet
     * @return - returns force
     */
    public double calcForce(Planet otherPlanet) {
        // calculating distance between the two planets
        double distance = this.calcDistance(otherPlanet);
        int mass1 = this.mass;  // mass of the planet the force is being exerted on
        int mass2 = otherPlanet.getMass();  // mass of the planet exerting the force
        final double CONSTANT_G = 6.67e-11;     // gravitational constant

        // formula that calculates the force
        return (CONSTANT_G * mass1 * mass2) / Math.pow(distance, 2);

    }



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
}

