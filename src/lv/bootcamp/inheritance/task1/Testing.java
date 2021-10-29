package lv.bootcamp.inheritance.task1;

/**
 * Testing the methods created in the Planet class
 */

public class Testing {
    public static void main(String[] args) {

        //Creating a new planet "pp" and setting the necessary parameters
        Planet pp = new Planet();
        pp.setCoordinateX(3);
        pp.setCoordinateY(5);

        pp.setMass(100);

        //Creating another planet "otherPlanet" and setting the parameters
        Planet otherPlanet = new Planet();
        otherPlanet.setCoordinateX(10);
        otherPlanet.setCoordinateY(8);

        otherPlanet.setMass(200);

        //Calling the custom methods and printing the results
        System.out.println(pp.calcDistance(otherPlanet));
        System.out.println(pp.calcForce(otherPlanet));





    }
}
