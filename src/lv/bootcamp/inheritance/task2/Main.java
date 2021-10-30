package lv.bootcamp.inheritance.task2;

public class Main {
    public static void main(String[] args) {
        Spaceship spaceship1 = new Spaceship("Spaceship1", "Old Spaceship", 10, 55, "Yellow", 10, 12, 89, 0, 0, 0, 0, "Fuel Type unknown", 14);

        spaceship1.rotate(20);
        spaceship1.accelerate(2);
    }
}
