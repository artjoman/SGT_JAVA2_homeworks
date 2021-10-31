package lv.bootcamp.inheritance.task2;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Class created for binding arrow and space keys to the methods
 * Class contains JFrame, which allows to call a methods by pressing arrow and space keys, when application is ran
 */

public class KeyListenerExample extends Spaceship {
    /**
     * Customized constructor for KeyListenerExample class, which creates JFrame object and and allows to bind pressing keys to methods
     * when object is created and ran
     * @param spaceship - object of class Spaceship is passed as parameter, when object of KeyListenerExample is created
     */
    public KeyListenerExample(Spaceship spaceship) {
        JFrame frame = new JFrame("KeyListener Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
//   When according Key is pressed, according method with according parameter is ran,
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_LEFT) {
                    spaceship.accelerate(-1);
                }
                if (keyCode == KeyEvent.VK_RIGHT) {
                    spaceship.accelerate(1);
                }
                if (keyCode == KeyEvent.VK_UP) {
                    spaceship.rotate(1);
                }
                if (keyCode == KeyEvent.VK_DOWN) {
                    spaceship.rotate(-1);
                }
                if (keyCode == KeyEvent.VK_SPACE) {
                    System.out.println("Coordinate x: "+spaceship.getCoordinateX());
                    System.out.println("Coordinate y: "+spaceship.getCoordinateY());
                    System.out.println("Direction: "+spaceship.getDirection());
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }
}
