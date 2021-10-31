package lv.bootcamp.inheritance.task2;

public class Main {
    /**
     * Main method for creating an objects and testing created methods.
     * @param args
     */
    public static void main(String[] args) {

        Spaceship spaceship1 = new Spaceship("Spaceship1", "Old Spaceship", 10, 55, "Yellow", 0, 0, 89, 0, 0, 30, 0, "Fuel Type unknown", 14);
        spaceship1.rotate(30);
        spaceship1.accelerate(4);
        System.out.println();

        Spaceship spaceship2 = new Spaceship("Spaceship2", "New Spaceship", 18, 64, "Black", 2, -3, 101, 0, 0, 420, 0, "Fuel Type unknown", 18.3);
        spaceship2.rotate(810);
        spaceship2.accelerate(10);
        System.out.println();

        Spaceship spaceship3 = new Spaceship("Spaceship3", "Modern Spaceship 2021", 20, 59, "Red and Blue", -10, 7, 128, 0, 0, -90, 0, "Fuel Type unknown", 10.5);
        spaceship3.rotate(-45);
        spaceship3.accelerate(25.8);
    }
}
