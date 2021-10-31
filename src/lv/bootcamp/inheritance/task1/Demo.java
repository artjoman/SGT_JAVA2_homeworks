package lv.bootcamp.inheritance.task1;

public class Demo {
    public static void main(String[] args) {
        Planet planet1 = new Planet(100, 3, 5);
        Planet planet2 = new Planet(200, 10, 8);
        System.out.println(planet1.calcDistance(planet2));
        System.out.println(planet1.calcForce(planet2));
    }
}
