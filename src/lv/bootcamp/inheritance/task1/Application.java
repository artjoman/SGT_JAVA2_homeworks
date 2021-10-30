package lv.bootcamp.inheritance.task1;

public class Application {
    public static void main(String[] args) {
    //created new planets and is set needed mass, x and y coordinates for planets.
        Planet planet1 = new Planet();
        planet1.setMass(100);
        planet1.setVelocityX(3);
        planet1.setVelocityY(5);
        Planet planet2 = new Planet();
        planet2.setMass(200);
        planet2.setVelocityX(10);
        planet2.setVelocityY(8);

    //prints out the results for calcDistance method and calcForce method.
        System.out.println(planet1.calcDistance(planet2));
        System.out.println(planet1.calcForce(planet2));
    }
}
