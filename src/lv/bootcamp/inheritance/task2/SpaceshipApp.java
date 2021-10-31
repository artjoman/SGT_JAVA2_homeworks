package lv.bootcamp.inheritance.task2;

public class SpaceshipApp {

    public static void main(String[] args) {

        Spaceship spaceship = new Spaceship();

        spaceship.rotate(-370);
        spaceship.rotate(-360);
        spaceship.rotate(0);
        spaceship.rotate(360);
        spaceship.rotate(-90);
        spaceship.rotate(350);
        spaceship.rotate(370);

        spaceship.accelerate(4);

        spaceship.showCurrentCoordinates();
    }
}
