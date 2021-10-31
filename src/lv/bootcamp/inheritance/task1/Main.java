package lv.bootcamp.inheritance.task1;

public class Main {
    public static void main(String[] args) {
        Planet planet = new Planet(100, 3, 5);
        Planet otherPlanet = new Planet(200, 10, 8);


        System.out.println("Distance to other planet is " + planet.calcDistance(otherPlanet));
        System.out.println("Force exerted on another planet is " + planet.calcForce(otherPlanet));
    }
}
