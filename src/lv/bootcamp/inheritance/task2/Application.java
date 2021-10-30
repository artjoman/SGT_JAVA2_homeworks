package lv.bootcamp.inheritance.task2;

public class Application {

    public static void main(String[] args) {
        //creates new spaceship
        Spaceship spaceship = new Spaceship();

        //set the coordinates
        spaceship.setVelocityY(0);
        spaceship.setVelocityX(0);

        //set degree
        spaceship.setDirection(30);

        //select acceleration directly to the accelerate method, not needed use setAcceleration
        spaceship.accelerate(4);

        //Prints new coordinates for spaceship, that is calculated in accelerate method
        System.out.println("New coordinates  " + spaceship.getNewVelocityX() + " " + spaceship.getNewVelocityY());





    }
}
