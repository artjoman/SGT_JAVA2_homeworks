package lv.bootcamp.inheritance.task2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * The class for binding  keyboard arrow keys and space to the methods rotate and accelerate
 */
public class KeyboardInput extends Spaceship implements  KeyListener {

    /**
     * The method is used for calling methods rotate(LEFT,RIGHT) and accelerate(DOWN,UP) by pressing on keyboard LEFT,
     * RIGHT, DOWN, UP arrows, and SPACE shows current coordinates of the ship, by pressing ESCAPE button is exit.
     * @param e
     */
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();         //every key on keyboard has it's own key code
        if(key == KeyEvent.VK_LEFT){      //VK_LEFT is key code for left arrow, the same idea with other buttons
            rotate(-1);           //in this method.
        }
        if(key == KeyEvent.VK_RIGHT){
            rotate(1);
        }
        if(key == KeyEvent.VK_DOWN){
            accelerate(-1);
        }
        if(key == KeyEvent.VK_UP){
            accelerate(1);
        }
        if(key == KeyEvent.VK_SPACE){
            System.out.println("The spaceship current coordinates - the X coordinate is: " + getCoordinateX() + " and " +
                    "the Y coordinate is: " + getCoordinateY());
        }
        if(key == KeyEvent.VK_ESCAPE){
            System.exit(0);
        }
    }

    //Is only generated if a valid Unicode character could be generated.
    @Override
    public void keyTyped(KeyEvent e) {
    }

    //The listener interface for receiving keyboard events (keystrokes).
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
