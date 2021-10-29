package lv.bootcamp.inheritance.task2;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Class ArrowKeys uses the Swing library to create a JFrame display and also bind key-strokes to
 * methods in the Spaceship class.
 */

public class ArrowKeys extends Spaceship {

    //Constructor
    public ArrowKeys() {
        //JFrame opens a new window when run
        JFrame frame = new JFrame();
        //makes it visible
        frame.setVisible(true);
        //makes it close when close button is clicked
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //sets frame size pixels
        frame.setSize(800,100);
        //makes it clickable
        frame.setFocusable(true);

        //JPanel puts an invisible 'panel' on top of the frame
        //in which you can operate
        JPanel panel = new JPanel();

        //Add labels you want to see and/or use
        JLabel up = new JLabel();
        JLabel down = new JLabel();
        JLabel left = new JLabel();
        JLabel right = new JLabel();
        JLabel space = new JLabel();

        //Add created labels to your panel
        panel.add(left);
        panel.add(right);
        panel.add(up);
        panel.add(down);
        panel.add(space);

        //Add text that will be visible to your labels
        left.setText("Rotate LEFT (-1): |0|");
        right.setText("Rotate RIGHT (+1): |0|");
        up.setText("Accelerate UP (+1): |0|");
        down.setText("Accelerate DOWN (-1): |0|");
        space.setText("COORDINATES: X = 0.0 Y = 0.0");


        //Make the frame see the keys (key-listener detects what keys are being pressed)
        frame.addKeyListener(new KeyListener() {

            //counters to display how many times the action has been completed
            int leftCount = 0;
            int rightCount = 0;
            int upCount = 0;
            int downCount = 0;

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                //takes the key-event (pressed key) and stores it in this variable - keycode
                //then it sees which key it was and reacts accordingly thought the switch case
                int keyCode = e.getKeyCode();

                switch(keyCode) {
                    case KeyEvent.VK_LEFT:
                        System.out.println("Rotating -1 degrees...");
                        left.setText("Rotate LEFT (-1):  " + ++leftCount);
                        rotate(-1);
                        break;
                    case KeyEvent.VK_RIGHT:
                        System.out.println("Rotating +1 degrees...");
                        right.setText("Rotate RIGHT (+1):  " + ++rightCount);
                        rotate(1);
                        break;
                    case KeyEvent.VK_UP:
                        System.out.println("Acceleration: +1...");
                        up.setText("Accelerate UP (+1):  " + ++upCount);
                        accelerate(1);
                        break;
                    case KeyEvent.VK_DOWN:
                        System.out.println("Acceleration: -1...");
                        up.setText("Accelerate DOWN (-1):  " + ++downCount);
                        accelerate(-1);
                        break;
                    case KeyEvent.VK_SPACE:
                        space.setText(showCoordinates());
                        System.out.println(showCoordinates());
                        System.out.println();
                        break;

                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        //Put your panel on your frame
        frame.add(panel);





    }
}
