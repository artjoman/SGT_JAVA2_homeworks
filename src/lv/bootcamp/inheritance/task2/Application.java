package lv.bootcamp.inheritance.task2;

public class Application {
    public static void main(String[] args) {

        Spaceship spaceship = new Spaceship();
        spaceship.setCoordinateX(10);
        spaceship.setCoordinateY(10);
        spaceship.setDirection(30);
        spaceship.rotate(30);
        spaceship.accelerate(10);

        System.out.println("rotated direction:" + spaceship.getDirection());
        System.out.println("coordinateX = " + spaceship.getCoordinateX() + '\n' + "coordinateY = " + spaceship.getCoordinateY());

    }
}






