package lv.bootcamp.inheritance.task1;

public class Application {
    public static void main(String[] args) {
        Planet planet1 = new Planet();
        planet1.setCoordinateX(3);
        planet1.setCoordinateY(5);
        planet1.setMass(100);

        Planet planet2 = new Planet();
        planet2.setCoordinateX(10);
        planet2.setCoordinateY(8);
        planet2.setMass(200);




        System.out.println("distance " + planet1.calcDistance(planet2));
        System.out.println("F " + planet1.calcForce(planet2));


    }
}
