package lv.bootcamp.inheritance.task1;

public class Planet extends  SpaceObject{

    private double mass;
    private String velocityX;
    private String velocityY;


    public Planet() {
    }

    public Planet(String name, String type, double width, double height, String color, double coordinateX, double coordinateY) {
        super(name, type, width, height, color, coordinateX, coordinateY);
    }

    public Planet(double mass, String velocityX, String velocityY) {
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    public Planet(String name, String type, double width, double height, String color, double coordinateX, double coordinateY, double mass, String velocityX, String velocityY) {
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

    public String getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(String velocityX) {
        this.velocityX = velocityX;
    }

    public String getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(String velocityY) {
        this.velocityY = velocityY;
    }
}
