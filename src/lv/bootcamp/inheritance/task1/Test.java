package lv.bootcamp.inheritance.task1;

public class Test {
    public static void main(String[] args) {

        //TASK 1 part 1:
        System.out.println();
        System.out.println("Task 1-1: Calculates the distance between two planets");

        Planet otherPlanet = new Planet("Earth", "planet", 3959, 3959, "blue", 3, 5);
        Planet pp = new Planet("Marss", "planet", 2106, 2106, "red", 10, 8);

        double distance = pp.calcDistance(otherPlanet);
        System.out.println("Distance from one planet to another one is: " + distance);
        System.out.println();

        // TASK 1 part 2:
        System.out.println("Task 1-2: calculate force between two planets");

        otherPlanet.setMass(100);
        pp.setMass(200);

        double force = pp.calcForce(otherPlanet);
        System.out.println("Force between two planets is: " + force);
        System.out.println();

    }
}
