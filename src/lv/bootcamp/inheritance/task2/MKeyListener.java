package lv.bootcamp.inheritance.task2;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MKeyListener extends JPanel implements KeyListener {

    /**
     * Keyboard keys rotate the object, accelerate it and show current coordinates of the object:
     * pressing left arrow - rotate method with -1 value
     * pressing right arrow - rotate method with +1 value
     * pressing down arrow - accelerate method with -1 value
     * pressing up arrow - accelerate method with 1 value
     * pressing SPACE - shows current coordinates of the object
     *
     * @param event - pressed keyboard key
     */
    @Override
    public void keyPressed(KeyEvent event) {

        Spaceship spaceship = new Spaceship();

        if (event.getKeyCode() == KeyEvent.VK_LEFT) {
            spaceship.rotate(-1);
        } else if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
            spaceship.rotate(1);
        } else if (event.getKeyCode() == KeyEvent.VK_DOWN) {
            spaceship.accelerate(-1);
        } else if (event.getKeyCode() == KeyEvent.VK_UP) {
            spaceship.accelerate(1);
        } else if (event.getKeyCode() == KeyEvent.VK_SPACE) {
            spaceship.showCurrentCoordinates(); // will show NullPointerException because the object os empty
        }
    }

    @Override
    public void keyTyped(KeyEvent event) {
    }

    @Override
    public void keyReleased(KeyEvent event) {
    }
}