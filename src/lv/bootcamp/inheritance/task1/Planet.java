package lv.bootcamp.inheritance.task1;

public class Planet extends SpaceObject{
    //declare variables, getters, setters and constructors.
    private double mass; //in kg
    private double velocityX; //in meters
    private double velocityY; //in meters
    private static final double G = 6.67 * Math.pow(10, -11); //gravitational constant
    private double r; //distance result

    public Planet() {
    }

    public Planet(String name, String type, int width, int height, String color, int coordinateX, int coordinateY, double mass, double velocityX, double velocityY) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public double getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(int velocityX) {
        this.velocityX = velocityX;
    }

    public double getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(int velocityY) {
        this.velocityY = velocityY;
    }

    //method to calculate Distance between planets
    // planet has x and y coordinates, and otherPlanet has x and y coordinate.
    //r^2 = (pp.x-otherPlanet.x)^2 + (pp.y-otherPlanet.y)^2
    public double calcDistance ( Planet otherPlanet){

        //result of distance between planets
        r = Math.sqrt(((velocityX- otherPlanet.velocityX)* (velocityX- otherPlanet.velocityX)) +
                ((velocityY- otherPlanet.velocityY)*(velocityY- otherPlanet.velocityY)));
        return  r;
    }

    //method to calculate Force using constance variable G
    public double calcForce(Planet otherPlanet){

        double F = G * mass * otherPlanet.mass/Math.pow(r, 2);
        return F;

    }

}

