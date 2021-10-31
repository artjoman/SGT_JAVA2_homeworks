package lv.bootcamp.inheritance.task1;

import java.sql.SQLOutput;

/**
 * Main class for testing if the program is working correctly.
 */
public class Main {
    public static void main(String[] args) {

        //Creating objects (planets)
        Planet planet1 = new Planet("Planet1", "Usual", 100, 200, "Red", 3, 5, 100, 0, 0);
        Planet planet2 = new Planet("Planet2", "Unusual", 150, 188, "Blue", 10, 8, 200, 0, 0);
        Planet planet3 = new Planet("Planet3", "Just One more usual Planet", 230, 202, "Black", 1.6, 2.91, 288.5, 0, 0);

        //Method testing
        System.out.println("The distance between planet 1 & planet 2 is: " + planet1.calcDistance(planet2));
        System.out.println("The distance between planet 2 & planet 3 is: " + planet2.calcDistance(planet3));
        System.out.println("The distance between planet 3 & planet 1 is: " + planet3.calcDistance(planet1));
        System.out.println();
        System.out.println("The force exerted on the planet 1 by the planet 2 is: " + planet1.calcForce(planet2));
        System.out.println("The force exerted on the planet 2 by the planet 3 is: " + planet2.calcForce(planet3));
        System.out.println("The force exerted on the planet 3 by the planet 1 is: " + planet3.calcForce(planet1));
    }
}
