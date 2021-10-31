package lv.bootcamp.inheritance.task1;

import lv.bootcamp.inheritance.task2.SpaceShip;
import java.util.Scanner;

// 3rd task imports ->>
//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;
//import javax.swing.JFrame;
//import javax.swing.JTextField;

//public class Main extends KeyAdapter{    (3rd task class)
public class Main{

//    --->>>> third task
//
//    SpaceShip spaceShip2 = new SpaceShip("Bezos", "spaceship", 50, 370, "Blue",
//            0, 0, 4000, 1100, 1200, 0,
//            0, "Gasoline", 550);
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//        int keyCode = e.getKeyCode();
//        switch( keyCode ) {
//            case KeyEvent.VK_UP:
//                spaceShip2.accelerate(1);
//                System.out.println("Accelerated. | " + spaceShip2.getAcceleration());
//                break;
//            case KeyEvent.VK_DOWN:
//                spaceShip2.accelerate(-1);
//                System.out.println("Accelerated. | " + spaceShip2.getAcceleration());
//                break;
//            case KeyEvent.VK_LEFT:
//                spaceShip2.rotate(-1);
//                System.out.println("Rotated. | " + spaceShip2.getDirection());
//                break;
//            case KeyEvent.VK_RIGHT:
//                spaceShip2.rotate(1);
//                System.out.println("Rotated. | " + spaceShip2.getDirection());
//                break;
//            case KeyEvent.VK_SPACE:
//                //
//                break;
//        }
//    }

    public static void main(String[] args) {
        Planet planet = new Planet("Mars",
                "planet", 2000000, 2000000, "Red",
                3, 5, 100, 5000, 4000);
        Planet otherPlanet = new Planet("Venus", "planet",
                2300000, 2300000, "Green-blue",
                10, 8, 200, 3000, 3400);

        System.out.println(planet.calcDistance(otherPlanet));
        System.out.println(planet.calcForce(otherPlanet));

        SpaceShip spaceShip = new SpaceShip("Musk", "spaceship", 70, 450, "White",
                1, 1, 3000, 1200, 1300, 0,
                0, "Gasoline", 500);

        //changing direction
        System.out.println(spaceShip);
        System.out.println("You are going to change the direction. Enter degrees: ");
        Scanner scanner  = new Scanner(System.in);
        int degrees = scanner.nextInt();
        degrees = SpaceShip.checkDegrees(degrees);
        spaceShip.rotate(degrees);
        System.out.println("The direction has been changed. Now it's : " + spaceShip.getDirection());

        // accelerate
        System.out.println("Please enter acceleration: ");
        Scanner scanner2  = new Scanner(System.in);
        int acc = scanner2.nextInt();
        spaceShip.accelerate(acc);
        System.out.println("New x coord = " + spaceShip.accelerate(acc)[0] + "\nNew y coord = " + spaceShip.accelerate(acc)[1]);

//        third task frame components --->
//        JTextField component = new JTextField();
//        component.addKeyListener(new Main());
//        JFrame jframe = new JFrame();
//
//        jframe.add(component);
//        jframe.setSize(400, 350);
//        jframe.setVisible(true);
    }
}