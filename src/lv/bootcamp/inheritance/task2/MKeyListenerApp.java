package lv.bootcamp.inheritance.task2;

import javax.swing.*;

public class MKeyListenerApp {

    public static void main(String[] args) {
        JTextField textField = new JTextField();
        textField.addKeyListener(new MKeyListener());
        JFrame jframe = new JFrame();
        jframe.add(textField);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(400, 350);
        jframe.setFocusTraversalKeysEnabled(false);
    }
}