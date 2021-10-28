
package lv.bootcamp.inheritance.task2;

import lv.bootcamp.inheritance.task1.SpaceObject;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Spaceship extends SpaceObject {
    private double mass;
    private int velocityX;
    private int velocityY;
    private int direction; // 0-360 degrees (NOT IN RAD)
    private double acceleration;
    private String fuel; //type of fuel?
    private double fuelConsumption; //int?



    /**
     * rotate the ship by x degrees,
     * direction cannot be less than 0 and larger than 360
     * @param degrees
     */
    public void rotate(int degrees){
        int direction = this.direction;
        direction += degrees;
        this.direction = degreesRangeCheck(direction);
    }


    public void accelerate(double acc){
        double DeltaX;
        double DeltaY;

        //delta x = x component of length = length * (cos alfa) = acc* cos(direction)
        //delta y = y component of length = length * (sin alfa) = acc* sin(direction)
        DeltaX = Math.cos(Math.toRadians(this.direction)) * acc;   // Math.cos, Math.sin- uses RAD not degrees
        DeltaY = Math.sin(Math.toRadians(this.direction)) * acc;

        coordinateX += DeltaX; //adding delta x to existing x coordinate (here DeltaX can be negative )
        coordinateY += DeltaY; // "--"
    }
    /**
     * checks the range of degrees [0,360]
     * @param degrees degrees
     * @return degrees within a range
     */
    public static int degreesRangeCheck (int degrees){
        if(degrees > 360){
            degrees %= 360;
        } else if (degrees < 0){
            degrees %= 360;
            degrees = 360 + degrees; //positive number, rotation only clockwise, ('+' - because degree here is negative)
        }else if(degrees == 360){
            degrees = 0;
        }

        return degrees;
    }

    //CONSTRUCTORS
    public Spaceship() {
        //binding keys arrows and space to methods when creating
        //an object spaceship, should be in every spaceship constructor
        keyListener ();
    }

    public Spaceship(double mass, int velocityX, int velocityY, int direction, double acceleration, String fuel, double fuelConsumption) {
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.direction = direction;
        this.acceleration = acceleration;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
        keyListener ();
    }

    public Spaceship(String name, String type, int width, int height, String color, double coordinateX, double coordinateY) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        keyListener ();
    }

    public Spaceship(String name, String type, int width, int height, String color, double coordinateX, double coordinateY, double mass, int velocityX, int velocityY, int direction, double acceleration, String fuel, double fuelConsumption) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.direction = direction;
        this.acceleration = acceleration;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
        keyListener ();
    }


    //GETTERS AND SETTERS
    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
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

    public int getDirection() {
        return direction;
    }

    /**
     * checks that direction is an integer in a range [0,360]
     * @param direction
     */
    public void setDirection(int direction) {
        this.direction = degreesRangeCheck(direction);
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

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    /**this method is put to every constructor of spaceship
     * it creates an empty frame, and within this frame
     * WHEN pressing left arrow or right arrow - calls rotate method with -1 or +1 values
     * WHEN pressing down arrow or up arrow - calls accelerate method with -1 or + 1 values
     * WHEN pressing SPACE - shows Spaceship current coordinates
     */
    public void keyListener (){
        //Create visual frame, when we click mouse within this frame - we can start work with arrows and space
        JFrame frame = new JFrame();
        frame.setVisible(true); //visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when we close - close the window
        frame.setSize(400,400); //the dimensions of the window
        frame.setFocusable(true);


        //labels for arrows:
        JPanel panel = new JPanel();
        JLabel up = new JLabel();
        JLabel down = new JLabel();
        JLabel left = new JLabel();
        JLabel right = new JLabel();
        JLabel space = new JLabel();


            /*panel.add(up); //created a panel just to check if it works
            panel.add(down);
            panel.add(left);
            panel.add(right);
            panel.add(space);*/

            /*up.setText("Up:0"); //sets label text in frame - for visibility
            down.setText("Down:0");
            left.setText("Left:0");
            right.setText("Right:0");
            space.setText("Space");*/

        frame.addKeyListener(new KeyListener() {

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode){
                    case KeyEvent.VK_UP:
                        accelerate(1);
                        //System.out.println("New X : " + getCoordinateX());
                        //System.out.println("New Y : " + getCoordinateY());
                        break;
                    case KeyEvent.VK_DOWN:
                        accelerate(-1);
                        //System.out.println("New X : " + getCoordinateX());
                        //System.out.println("New Y : " + getCoordinateY());
                        break;
                    case KeyEvent.VK_LEFT:
                        rotate(-1);
                        //System.out.println("New direction is: " + getDirection());
                        break;
                    case KeyEvent.VK_RIGHT:
                        rotate(1);
                        //System.out.println("New direction is: " + getDirection());
                        break;
                    case KeyEvent.VK_SPACE:
                        System.out.println("Current coordinates are: (" + getCoordinateX() + "," + getCoordinateY() + ")");
                        //System.out.println("the direction: " + direction);
                        break;
                }
            }

            /**
             * those 2 methods are overridden to keep compiler happy
             * @param e
             */
            @Override
            public void keyReleased(KeyEvent e) {
            }
            @Override
            public void keyTyped(KeyEvent e) {
            }

        });

        frame.add(panel);
    }

}
