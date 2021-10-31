package lv.bootcamp.inheritance.task1;

public class Planet extends SpaceObject{

    private static final double GRAVITATION = (6.67 * Math.pow(10, -11));

    private int mass;
    private int velocityX;
    private int velocityY;

    public Planet(String name, String type, int width, int height, String color, int coordinateX, int coordinateY, int mass, int velocityX, int velocityY) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    //  r2 = dx2 + dy2, r - distance between 2 objects
    //(Note dx is delta/difference between x-coordinates, similarly for dy).

    /**
     * Method calculates the distance between two Planets. Take in a single Planet and return a double equal
     * to the distance between the supplied planet and the planet that is doing the calculation, e.g.,
     * between otherPlanet the parameter, and pp the object on which the calcDistance method is invoked
     * @param planet
     * @return distance
     */
    public double calcDistance(Planet planet){

        double distance = Math.sqrt(Math.pow((this.getCoordinateX()) - (planet.getCoordinateX()), 2) +
                Math.pow((this.getCoordinateY()) - (planet.getCoordinateY()), 2));
//        System.out.println("The distance between " + this.getName() + " and " + planet.getName() + " = " + distance);
        return distance;
    }

    /**
     * The calcForce method has one planet as a parameter,
     * and returns a double describing the force exerted on this planet by the given planet.
     * @param planet
     * @return force
     */
    public double calcForce(Planet planet){
        //  F = G * m1 * m2 / r2
        double force = (GRAVITATION * this.mass * planet.getMass())/Math.pow(this.calcDistance(planet), 2);
//        System.out.println("The force exerted on " + this.getName() + " by the " + planet.getName() + " is " + force);
        return force;
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