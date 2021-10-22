package lv.bootcamp.inheritance.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyInputs {

    JFrame frame;
    JLabel label;
    ImageIcon icon;

    Action leftAction;
    Action rightAction;
    Action upAction;
    Action downAction;
    Action spaceAction;

    public KeyInputs() {

        frame = new JFrame("Spaceship control");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);

        icon = new ImageIcon("C:\\Users\\laild\\IdeaProjects\\SGT_JAVA2_homeworks\\src\\lv\\bootcamp\\inheritance\\Spaceship.png");

        label = new JLabel();
        label.setBounds(250, 250, 50, 50);
        //label.setBackground(Color.getHSBColor(21f,555f, 703f));
        label.setIcon(icon);
        //label.setOpaque(true);

        leftAction = new LeftKey();
        rightAction = new RightKey();
        upAction = new UpKey();
        downAction = new DownKey();
        spaceAction = new SpaceKey();

        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        label.getActionMap().put("leftAction", leftAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        label.getActionMap().put("rightAction", rightAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
        label.getActionMap().put("upAction", upAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        label.getActionMap().put("downAction", downAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "spaceAction");
        label.getActionMap().put("spaceAction", spaceAction);

        frame.getContentPane().setBackground(Color.BLACK);
        frame.add(label);
        frame.setVisible(true);
    }

    public class LeftKey extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation((int)(Spaceship.getCoordinateX()-1), (int)(Spaceship.getCoordinateY()));
        }
    }

    public class RightKey extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation((int)(Spaceship.getCoordinateX()+1), (int)(Spaceship.getCoordinateY()));
        }
    }

    public class UpKey extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation((int)(Spaceship.getCoordinateX()), (int)(Spaceship.getCoordinateY()-1));
        }
    }

    public class DownKey extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation((int)(Spaceship.getCoordinateX()), (int)(Spaceship.getCoordinateY()+1));
        }
    }

    public class SpaceKey extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(Spaceship.getCoordinateX() + Spaceship.getCoordinateY());
        }
    }
}
