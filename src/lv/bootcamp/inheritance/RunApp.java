package lv.bootcamp.inheritance;

import lv.bootcamp.inheritance.task1.Planet;
import lv.bootcamp.inheritance.task2.Spaceship;

public class RunApp {

    public static void main(String[] args) {

        // task 1 - SpaceObject class, Planet class, calcDistance method, calcForce method
        Planet planet1 = new Planet(100, 3d, 5d);
        Planet planet2 = new Planet(200, 10d, 8d);

        System.out.println(planet1.calcDistance(planet2));
        System.out.println(planet1.calcForce(planet2));

        // task 2 - Spaceship class, rotate method, accelerate method
        Spaceship spaceship = new Spaceship(0, 0, 0);
        spaceship.rotate(30);
        spaceship.accelerate(4);
        System.out.println("Coordinate X: " + spaceship.getCoordinateX() + ", coordinate Y: " + spaceship.getCoordinateY());
        System.out.println(spaceship.toString());

        // task 3 - bind arrow keys methods rotate() and accelerate(), and space to display current coordinates
        Spaceship spaceship1 = new Spaceship();




    }
}
