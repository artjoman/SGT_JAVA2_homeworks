package lv.bootcamp.inheritance.task3;

import lv.bootcamp.inheritance.task2.Spaceship;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyBinding {

    public static void main(String[] argv) throws Exception {

        JTextField textField = new JTextField();
        textField.addKeyListener(new KeyChecker());
        JFrame jframe = new JFrame();
        jframe.add(textField);
        jframe.setVisible(true);

    }

    static class KeyChecker extends KeyAdapter {

        Spaceship spaceship = new Spaceship();

        @Override
        public void keyPressed(KeyEvent event) {

            int key = event.getKeyCode();

            switch (key) {

                case KeyEvent.VK_RIGHT:
                    spaceship.rotate(1);
                    break;

                case KeyEvent.VK_LEFT:
                    spaceship.rotate(-1);
                    break;

                case KeyEvent.VK_UP:
                    spaceship.accelerate(1);
                    break;

                case KeyEvent.VK_DOWN:
                    spaceship.accelerate(-1);
                    break;

                // Show spaceship's current coordinates when pressing SPACE
                case KeyEvent.VK_SPACE:
                    System.out.println("Coordinate X: " + spaceship.getCoordinateX());
                    System.out.println("Coordinate Y: " + spaceship.getCoordinateY());
                    break;

                // Press ENTER to exit
                case KeyEvent.VK_ENTER:
                    System.exit(0);

            }
        }
    }
}