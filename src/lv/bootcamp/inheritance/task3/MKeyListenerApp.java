package lv.bootcamp.inheritance.task3;

import javax.swing.*;

public class MKeyListenerApp {

    public static void main(String[] args) {

        JTextField textField = new JTextField();
        textField.addKeyListener(new MKeyListener());
        JFrame jframe = new JFrame();
        jframe.add(textField);
        jframe.setSize(400, 350);
        jframe.setVisible(true);
    }
}
