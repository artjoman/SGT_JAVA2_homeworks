package lv.bootcamp.inheritance.task1;

public class Main {
    public static void main(String[] args) {
        SpaceObject object1 = new SpaceObject();
        System.out.println("Object1" + object1.objectProperties());
        SpaceObject object2 = new SpaceObject("Object","object",26.3,25.5,"red",25,15);
        System.out.println("Object2" + object2.objectProperties());

        Planet planet1 = new Planet("planet1", "planet", 25, 25, "red", 5.5, 10.10, 150, 2, 3);
        System.out.println("Planet1" + planet1.planetProperties());
        Planet planet2 = new Planet(100, 3, 5);
        System.out.println("Planet2" + planet2.planetProperties());
        Planet planet3 = new Planet(200, 10, 8);
        System.out.println("Planet3" + planet3.planetProperties());

        System.out.println("Distance between Planet2 and Planet3: " + planet2.calcDistance(planet3));

        System.out.println("Distance between Planet2 and Planet3: " + planet2.calcForce(planet3));

    }
}
