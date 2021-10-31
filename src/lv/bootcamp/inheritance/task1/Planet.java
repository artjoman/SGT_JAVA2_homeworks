package lv.bootcamp.inheritance.task1;

/**Class Planet, inherit the SpaceObject class
 * contains attributes: mass, velocityX, velocityY
 * contains methods: calcDistance(otherPlanet), calcForce(otherPlanet)
 */
public class Planet extends SpaceObject {

    private int mass;
    private int velocityX;
    private int velocityY;

    public Planet() {

    }

    /**
     * Argument constructor Planet, creates object with following parameters:
     * @param name String
     * @param type String
     * @param width int
     * @param height int
     * @param color String
     * @param coordinateX int
     * @param coordinateY int
     * @param mass int
     * @param velocityX int
     * @param velocityY int
     */
    public Planet(String name, String type, int width, int height, String color, int coordinateX, int coordinateY, int mass, int velocityX, int velocityY) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    /**
     *Method calculates the distance between two Planets:it is taking in a single Planet
     and is returning a double equal to the distance between the supplied planet and the other planet.
     * @param otherPlanet
     * @return double- distance between two Planets
     */
    public double calcDistance (Planet otherPlanet) {
        double distance = getCoordinateX()-otherPlanet.getCoordinateX();
        double distance2= getCoordinateY()- otherPlanet.getCoordinateY();
        double distance3= (Math.pow(distance,2)) + (Math.pow(distance2,2));
        return Math.sqrt(distance3);
//     return Math.sqrt((Math.pow(getCoordinateX() - otherPlanet.getCoordinateX(), 2)) + (Math.pow(getCoordinateY() - otherPlanet.getCoordinateY(), 2)));
    }


    /**
     * Method calcForce has one planet as a parameter, is calculating force exerted on this planet
     * by the given planet. Method calcDistance is called in this method.
     * @param otherPlanet
     * @return double describing the force exerted on this planet
     */
    public double calcForce (Planet otherPlanet){
    final double G = 6.67*Math.pow(10,11); ////Gravitational constant, do not changes
    return (G*getMass()*otherPlanet.getMass())/Math.pow(calcDistance(otherPlanet),2);
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
