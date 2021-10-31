package lv.bootcamp.inheritance.task1;

public class TestTask1 {

    public static void main(String[] args) {

        Planet planet1 = new Planet();
        planet1.setMass(100);
        planet1.setCoordinateX(3);
        planet1.setCoordinateY(5);
        Planet planet2 = new Planet();
        planet2.setMass(200);
        planet2.setCoordinateX(10);
        planet2.setCoordinateY(8);
        System.out.println(planet1.calcDistance(planet2));
        System.out.println(planet1.calcForce(planet2));

    }

}
