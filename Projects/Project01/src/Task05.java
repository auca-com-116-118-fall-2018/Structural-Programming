import processing.core.PApplet;

import javax.swing.*;

public class Task05 extends PApplet {
    int x = 0;
    int y = 0;
    int size = 20;
    int ds1 = 40;
    int dx = 130;
    int ds = 40;

    public void settings() {
        fullScreen();
    }

    public void setup() {
    }

    public void draw() {
        frameRate(10);
        background(0);
        x = 400;
        y = height / 2;
        size += ds1;
        if (size > 140) {
            ds1 = -ds1;
        } else if (size <= 20) {
            ds1 = -ds1;
        }
        int tempsize = size;
        for (int i = 0; i < 9; i++) {

            fill(255, 0, 0);

            ellipse(x, y, 130, tempsize);
            x += dx;
            tempsize += ds;
            if (tempsize > 140) {
                ds = -ds;
            } else if (tempsize <= 20) {
                ds = -ds;
            }
        }
    }

    public static void main(String... args) {
        PApplet.main("Task05");
    }
}