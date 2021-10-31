package lv.bootcamp.inheritance.task1;

public class Planet extends SpaceObject{

    public double mass;
    public double velocityX;
    public double velocityY;

    public Planet() {
    }

    public Planet(double mass, double coordinateX, double coordinateY) {
        super(coordinateX, coordinateY);
        this.mass = mass;
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

    /**
     * Shows properties for a planet
     * @return - properties for a planet
     */
    public String planetProperties() {
        return " properties: " + '\n' +
                "name=" + name + '\t' +
                "type=" + type + '\t' +
                "width=" + width + '\t' +
                "height=" + height + '\t' +
                "color=" + color + '\t' +
                "coordinateX=" + coordinateX + '\t' +
                "coordinateY=" + coordinateY + '\t' +
                "mass=" + mass + '\t' +
                "velocityX=" + velocityX + '\t' +
                "velocityY=" + velocityY;
    }

    /**
     * Calculates the distance between two planets
     * @param otherPlanet - planet object that distance is calculated to
     * @return - distance between two planets
     */
    public double calcDistance(Planet otherPlanet){
        double deltaX = otherPlanet.getCoordinateX() - getCoordinateX();
        double deltaY = otherPlanet.getCoordinateY() - getCoordinateY();
        double distance = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        return distance;
    }

    /**
     * Calculates the force exerted on the second planet by the first planet
     * @param otherPlanet - planet object that force exerted by the first planet is calculated on
     * @return - force exerted on the second planet by the first planet
     */
    public double calcForce(Planet otherPlanet){
        double gravitationalConstant = 6.67 * Math.pow(10, -11);
        double mass1 = getMass();
        double mass2 = otherPlanet.getMass();
        double force = (gravitationalConstant * mass1 * mass2) / Math.pow(calcDistance(otherPlanet), 2);
        return force;
    }

}
