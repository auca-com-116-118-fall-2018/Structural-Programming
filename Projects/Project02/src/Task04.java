import processing.core.PApplet;

import javax.swing.*;

public class Task04 extends PApplet {
    static int n;
    final int DIAMETER = 40;
    final int RADIUS = DIAMETER / 2;

    int[] x = new int[n];
    int[] y = new int[n];
    int[] dx = new int[n];
    int[] dy = new int[n];
    int p = 20;
    int[] c = new int[n];
    int dc = 0;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        int a = width / 2;
        int b = height / 2;
        int color = 255;
        dc = 255 / n;

        for (int i = 0; i < n; i++) {
            x[i] = a;
            y[i] = b;
            a -= p;
            b -= p;
            c[i] = color;
            color -= dc;
        }
    }

    public void draw() {
        background(0);

        for (int i = 0; i < n; i++) {
            ellipse(x[i], y[i], DIAMETER, DIAMETER);
            fill(c[i]);

            x[i] += dx[i];
            if (x[i] > width - RADIUS) {
                x[i] = width - RADIUS;
                dx[i] = -dx[i];
            } else if (x[i] < RADIUS) {
                x[i] = RADIUS;
                dx[i] = -dx[i];
            }

            y[i] += dy[i];
            if (y[i] > height - RADIUS) {
                y[i] = height - RADIUS;
                dy[i] = -dy[i];
            } else if (y[i] < RADIUS) {
                y[i] = RADIUS;
                dy[i] = -dy[i];
            }
        }

    }

    public static void main(String[] args) {
        n = Integer.parseInt(JOptionPane.showInputDialog("N? "));
        PApplet.main("Task04");
    }
}
