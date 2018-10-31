import processing.core.PApplet;

import javax.swing.*;

public class Task06 extends PApplet {
    int x, y;
    int dx = 10;
    int dy = 100;
    String name;

    public void settings() {
        fullScreen();

    }


    public void setup() {
        x = 50;
        y = 50;
        name  = JOptionPane.showInputDialog("Enter your name");

    }

    public void draw () {
        background (0);
        fill(255, 145, 164);
        textSize (50);
        text(name, x, y);
        x += dx;
        if (x > width) {
            x = 0;
            y += dy;
        }

    }

    public static void main(String [] args) {
        PApplet.main("Task06");
    }
}
