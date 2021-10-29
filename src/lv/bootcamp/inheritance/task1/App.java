package lv.bootcamp.inheritance.task1;

public class App {
    public static void main(String[] args) {
        // Parameters of first Planet
        Planet planet1 = new Planet();
        planet1.setCoordinateX(3);
        planet1.setCoordinateY(6);
        planet1.setMass(150);

        //Parameters of second Planet
        Planet planet2 = new Planet();
        planet2.setCoordinateX(8);
        planet2.setCoordinateY(12);
        planet2.setMass(190);

        // The distance and force of Planets
        System.out.println("The distance between 2 planets is: " + planet1.calcDistance(planet2));
        System.out.println("The force is: " + planet1.calcForce(planet2));
    }
}
