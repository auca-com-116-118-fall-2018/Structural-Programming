import processing.core.PApplet;

import javax.swing.*;

public class Task03 extends PApplet {
    static int n;
    int[] x = new int[n];
    int[] y = new int[n];
    int[] dx = new int[n];
    int[] dy = new int[n];


    public void settings() {
        fullScreen();
    }

    public void setup() {
        for (int i = 0; i < n; ++i) {
            x[i] = width / 2;
            y[i] = height / 2;
            dx[i] = (int) random(-10, 10);
            dy[i] = (int) random(-10, 10);
        }
    }

    public void draw() {
        background(0);
        frameRate(15);

        for (int i = 0; i < n / 3; i++) {
            fill(0, 255, 0);
            noStroke();
            ellipse(x[i], y[i], 5, 5);

            if (x[i] > width || x[i] < 0) {
                x[i] = width / 2;
                y[i] = height / 2;
            }
            if (y[i] > height || y[i] < 0) {
                y[i] = height / 2;
                x[i] = width / 2;
            }
        }
        for (int i = n / 3; i < 2 * n / 3; i++) {
            fill(0, 0, 255);
            noStroke();
            ellipse(x[i], y[i], 5, 5);

            if (x[i] > width || x[i] < 0) {
                x[i] = width / 2;
                y[i] = height / 2;
            }
            if (y[i] > height || y[i] < 0) {
                y[i] = height / 2;
                x[i] = width / 2;
            }
        }
        for (int i = 2 * n / 3; i < n; i++) {
            fill(255, 0, 0);
            noStroke();
            ellipse(x[i], y[i], 5, 5);

            if (x[i] > width || x[i] < 0) {
                x[i] = width / 2;
                y[i] = height / 2;
            }
            if (y[i] > height || y[i] < 0) {
                y[i] = height / 2;
                x[i] = width / 2;
            }
        }

        for (int i = 0; i < n; ++i) {
            x[i] += dx[i];
            y[i] += dy[i];

        }
    }

    public static void main(String[] args) {
        n = Integer.parseInt(JOptionPane.showInputDialog("N? "));
        PApplet.main("Task03");
    }
}
