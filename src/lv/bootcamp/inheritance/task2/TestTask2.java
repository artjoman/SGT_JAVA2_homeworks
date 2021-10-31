package lv.bootcamp.inheritance.task2;

public class TestTask2 {

    public static void main(String[] args) {

        Spaceship spaceship1 = new Spaceship();
        spaceship1.rotate(30);
        System.out.println(spaceship1.getDirection());
        System.out.println(spaceship1.getCoordinateX());
        System.out.println(spaceship1.getCoordinateY());
        spaceship1.accelerate(4);
        System.out.println(spaceship1.getCoordinateX());
        System.out.println(spaceship1.getCoordinateY());
        spaceship1.rotate(400);
        System.out.println(spaceship1.getDirection());
        spaceship1.accelerate(5);
        System.out.println(spaceship1.getCoordinateX());
        System.out.println(spaceship1.getCoordinateY());

    }

}
