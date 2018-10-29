import processing.core.PApplet;

import javax.swing.*;

public class Task06 extends PApplet {
    int x, y;
    int dx = 1;
    int dy = 1;


    public void settings() {
        fullScreen();

        x = 40;
        y = 100;
    }


    public void setup() {
        background (0);
        String name  = JOptionPane.showInputDialog("Enter your name");
        fill(100, 0, 255);
        textSize (50);
       // textAlign (CENTER, CENTER);
        text(name, x, y);

        x += dx;
        if (x > width) {
            x = 0;
            y += dy;
        }


    }

    public void draw () {

    }

    public static void main(String [] args) {
        PApplet.main("Task06");
    }
}
