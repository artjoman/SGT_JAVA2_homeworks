package lv.bootcamp.inheritance.projecttesting;


import lv.bootcamp.inheritance.task1.Planet;
import lv.bootcamp.inheritance.task2.KeyListenerExample;
import lv.bootcamp.inheritance.task2.Spaceship;

public class TestClass {
    public static void main(String[] args) {

        Planet planet = new Planet();
        planet.setCoordinateX(3);
        planet.setCoordinateY(5);
        planet.setMass(100);

        Planet planet1 = new Planet();
        planet1.setCoordinateX(10);
        planet1.setCoordinateY(8);
        planet1.setMass(200);

        System.out.println(planet.calcDistance(planet1));

        System.out.println(planet.calcForce(planet1));

        Spaceship spaceship1 = new Spaceship();
        spaceship1.setCoordinateY(0);
        spaceship1.setCoordinateX(0);
        spaceship1.setDirection(30);
        spaceship1.accelerate(4);
        System.out.println(spaceship1.getCoordinateX());
        System.out.println(spaceship1.getCoordinateY());

        Spaceship spaceship = new Spaceship();
        spaceship.setCoordinateY(250);
        spaceship.setCoordinateX(250);
        spaceship.setDirection(50);

        Spaceship spaceship3 = new Spaceship();
        spaceship3.setDirection(320);
        spaceship3.setCoordinateX(25);
        spaceship3.setCoordinateY(80);
        System.out.println(spaceship3.getDirection());
        System.out.println(spaceship3.rotate(20));
        System.out.println(spaceship3.getDirection());



KeyListenerExample keyListenerExample = new KeyListenerExample(spaceship3);
//new KeyListenerExample(spaceship1);




    }
}
