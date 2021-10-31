package lv.bootcamp.inheritance.task2;

/**
 * The class is created to check if the code is working correctly
 */
public class shipApplication {
    public static void main(String[] args) {

        Spaceship spaceship = new Spaceship();

        spaceship.rotate(45);
        System.out.println("The new ship direction is: " + spaceship.getDirection());
        spaceship.rotate(60);
        System.out.println("The new ship direction is: " + spaceship.getDirection());
        spaceship.rotate(-70);
        System.out.println("The new ship direction is: " + spaceship.getDirection());

        Spaceship spaceship1 = new Spaceship(0, 0);
        spaceship1.setDirection(30);
        spaceship1.accelerate(4);
        System.out.println("For the SpaceShip1 the Y coordinate equals: " + spaceship1.getCoordinateY() + ", and X coordinate equals: " +
                spaceship1.getCoordinateX());
    }
}
