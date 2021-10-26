package lv.bootcamp.inheritance.task1;

public class Main {
    public static void main(String[] args) {
        Planet planet1 = new Planet("Planet1", "Usual", 100, 200, "Red", 3, 5, 100, 0, 0);
        Planet planet2 = new Planet("Planet2", "Unusual", 150, 188, "Blue", 10, 8, 200, 0,0);

        planet1.calcDistance(planet2);
        planet2.calcDistance(planet1);

        planet1.calcForce(planet2);

    }


}
