package lv.bootcamp.inheritance.task2;

public class Main {

    public static void main(String[] args) {

    Spaceship ship = new Spaceship();

        System.out.println(ship.getCoordinateX());
        System.out.println(ship.getCoordinateY());

    ship.rotate(361);
    ship.accelerate(10);

        System.out.println(ship.getCoordinateX());
        System.out.println(ship.getCoordinateY());
    }
}
