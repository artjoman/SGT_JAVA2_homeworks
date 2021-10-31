package lv.bootcamp.inheritance.task1;

import lv.bootcamp.inheritance.task2.Spaceship;

/**
 * The class is created to check if the code is working correctly
 */
public class Application {
    public static void main(String[] args) {
        Planet otherPlanet = new Planet(3, 5, 100);
        Planet pp = new Planet(10, 8, 200);

        System.out.println("The distance between two planets is: " + pp.calcDistance(otherPlanet));
        System.out.println("The force exerted on this planet by the given planet is: " + pp.calcForce(otherPlanet));

    }
}
