package lv.bootcamp.inheritance.task3;

import lv.bootcamp.inheritance.task2.Spaceship;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class MKeyListener extends KeyAdapter {

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
            spaceship.showCurrentCoordinates();
        }
    }
}