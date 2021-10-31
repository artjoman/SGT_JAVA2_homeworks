package lv.bootcamp.inheritance.task1;

public class Main {
    public static void main(String[] args) {

        Planet pp = new Planet();
        pp.setCoordinateX(3);
        pp.setCoordinateY(5);
        pp.setMass(100);

        Planet otherPlanet = new Planet();
        otherPlanet.setCoordinateX(10);
        otherPlanet.setCoordinateY(8);
        otherPlanet.setMass(200);


        System.out.println("Distance between planets: " + pp.calcDistance(otherPlanet));
        System.out.println("Force exerted: " + pp.calcForce(otherPlanet));


    }
}
