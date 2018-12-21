import processing.core.PApplet;

import javax.swing.*;

public class Task03 extends PApplet {
    int N = 0;
    int x = 0;
    int y = 0;
    int size = 0;

    public void settings() {
        fullScreen();
    }

    public void setup() {
    }

    public void draw() {
        frameRate(10);
        background(0);
        N = 15 + (int) (Math.random() * 20);
        for (int i = 0; i < N / 3; i++) {
            x = 0 + (int) (Math.random() * width);
            y = 0 + (int) (Math.random() * height);
            size = 20 + (int) (Math.random() * 80);
            fill(255, 0, 0);
            ellipse(x, y, size, size);
            N = 15 + (int) (Math.random() * 20);
        }
        for (int j = 0; j < N / 3; j++) {
            x = 0 + (int) (Math.random() * width);
            y = 0 + (int) (Math.random() * height);
            size = 20 + (int) (Math.random() * 80);
            fill(0, 255, 0);
            ellipse(x, y, size, size);
            N = 15 + (int) (Math.random() * 20);
        }
        for (int k = 0; k < N / 3; k++) {
            x = 0 + (int) (Math.random() * width);
            y = 0 + (int) (Math.random() * height);
            size = 20 + (int) (Math.random() * 80);
            fill(0, 0, 255);
            ellipse(x, y, size, size);
        }
    }

    public static void main(String... args) {
        PApplet.main("Task03");
    }
}