package lv.bootcamp.inheritance.task1;

public class PlanetCalculationsApp {
    public static void main(String[] args) {

        Planet planet1 = new Planet(100, 3, 5);
        Planet planet2 = new Planet(200, 10, 8);
        System.out.println(planet1.calcDistance(planet2)); //  7.615773105863909
        System.out.println(planet1.calcForce(planet2)); // 2.2999999999999998E-8

    }
}
