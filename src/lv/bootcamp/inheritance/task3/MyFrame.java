package lv.bootcamp.inheritance.task3;

import lv.bootcamp.inheritance.task2.Spaceship;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame {

    // spaceship to use with frame. Spaceship will be created using default constructor in Spaceship class in task2 package
    Spaceship spaceship;

    /**
     * JFrame to utilize key binding, uses KeyListener created by createKeylistener method.
     * Constructor for the spaceship is located in lv.bootcamp.inheritance.task2.Spaceship.
     * @param spaceship - spaceship to be manipulated with binded keys
     */
    public MyFrame(Spaceship spaceship) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(100, 180);
        this.setLayout(null);
        this.setVisible(true);
        this.addKeyListener(createKeyListener());
        this.spaceship = spaceship;
    }

    /**
     * Creating a KeyListener to bind keys to methods
     * @return - returns a KeyListener to be used in JFrame
     */
    public KeyListener createKeyListener() {
        KeyListener keyListener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            // this is the place where keys are being binded
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        spaceship.rotate(-1);
                        System.out.println("Rotated by -1 degree");
                        break;
                    case KeyEvent.VK_RIGHT:
                        spaceship.rotate(+1);
                        System.out.println("Rotated by +1 degree");
                        break;
                    case KeyEvent.VK_UP:
                        spaceship.accelerate(+1);
                        System.out.println("Accelerated by +1");
                        break;
                    case KeyEvent.VK_DOWN:
                        spaceship.accelerate(-1);
                        System.out.println("Accelerated by -1");
                        break;
                    case KeyEvent.VK_SPACE:
                        System.out.println("Current coordinate X: " + spaceship.getCoordinateX() +
                                        ", current coordinate Y: " + spaceship.getCoordinateY());
                        break;
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
        };
        return keyListener;
    }

}
