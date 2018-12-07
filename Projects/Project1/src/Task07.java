import processing.core.PApplet;

import javax.swing.*;

public class Task07 extends PApplet {
    int x1, y1, x2, y2;
    int dx = 5;
    int dy = 50;
    String name, surname;

    public void settings() {
        fullScreen();
    }


    public void setup() {
        x1 = 50;
        y1 = 50;
        x2 = width - 50;
        y2 = 50;

        name  = JOptionPane.showInputDialog("Enter your name");
        surname = JOptionPane.showInputDialog("Enter your surname");

    }

    public void draw () {
        background (0);
        fill(255, 145, 164);
        textSize (50);

        text(name, x1, y1);
        x1 += dx;
        if (x1 > width / 2) {
            x1 = 0;
            y1 += dy;
        }

        text(surname, x2, y2);
        x2 -= dx;
        if (x2 < width / 2) {
            x2 = width;
            y2 += dy;
        }


    }

    public static void main(String [] args) {
        PApplet.main("Task07");
    }
}

