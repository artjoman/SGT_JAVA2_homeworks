package lv.bootcamp.inheritance.task2;

import lv.bootcamp.inheritance.task1.SpaceObject;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class Spaceship extends SpaceObject implements ActionListener {
    //Variables declaration.
    private double mass;
    private double velocityX;
    private double velocityY;
    private double direction;
    private double acceleration;
    private String fuel;
    private double fuelConsumption;
    private double newVelocityX;
    private double newVelocityY;

    //constructors and getters and setters
    public Spaceship() {
    }

    public Spaceship(double mass, double velocityX, double velocityY, int direction, double acceleration, String fuel, double fuelConsumption) {
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.direction = direction;
        this.acceleration = acceleration;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    public Spaceship(String name, String type, int width, int height, String color, int coordinateX, int coordinateY, double mass, double velocityX, double velocityY, int direction, double acceleration, String fuel, double fuelConsumption) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.direction = direction;
        this.acceleration = acceleration;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
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

    public double getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
    public double getNewVelocityX() {
        return newVelocityX;
    }

    public void setNewVelocityX(double newVelocityX) {
        this.newVelocityX = newVelocityX;
    }

    public double getNewVelocityY() {
        return newVelocityY;
    }

    public void setNewVelocityY(double newVelocityY) {
        this.newVelocityY = newVelocityY;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    //Method to check rotation degrees and if rotation degrees is between 1 and 360
    //return it as degrees used math.toRadians that will help calculate the new coordinates correctly
    public double rotate(double degrees) { //rotates spaceship
        if (direction < 0 && direction > 360) {
            System.out.println("There is an error. Please enter rotation degrees correctly from 0 to 360.");
        }
        return degrees = Math.toRadians(direction);
    }

    //firstly calculate the delta X and deltaY using math class cos and sin
    //and also gives newVelocityX and newVelocityY coordinates.
    public void accelerate(double acceleration) {
        double deltaX = Math.cos(rotate(direction)) * acceleration;
        double deltaY = Math.sin(rotate(direction)) * acceleration;
        newVelocityX = deltaX + velocityX;
        newVelocityY = deltaY + velocityY;
    }

//key Pressed method is used to press key UP, DOWN, RIGHT, LEFT and get updated accelerate and rotate
    //methods +1 or -1 value. Also if is pressed key SPACE it gives updated coordinates
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode(); //gives us a key numeric code, that is given for all keys on the keyboard
        if (key == KeyEvent.VK_UP) {
            accelerate(acceleration + 1);
        }
        if (key == KeyEvent.VK_DOWN) {
            accelerate(acceleration - 1);
        }
        if (key == KeyEvent.VK_LEFT) {
            rotate(direction - 1);
        }
        if (key == KeyEvent.VK_RIGHT) {
            rotate(direction + 1);
        }
        if (key == KeyEvent.VK_SPACE) {
            System.out.println("New Spaceships coordinates is: " + newVelocityX + "by X ,and by Y " + newVelocityY);
        }
    }
    //method prints out key code in the system.
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}

