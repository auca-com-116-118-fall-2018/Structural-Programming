import processing.core.PApplet;

public class Task02 extends PApplet {

    final int DIAMETER = 20;
    final int RADIUS = DIAMETER / 2;

    int x1 = width / 2, y1 = height / 2;
    int x2 = x1 + 30, y2 = x1 + 30;
    int x3 = x1 - 30, y3 = x1 - 30;
    int dx1 = 10, dy1 = 10;
    int dx2 = 10, dy2 = 10;
    int dx3 = 10, dy3 = 10;


    public void settings() {
        fullScreen();
    }

    public void setup() {

    }

    public void draw() {
        background(0);

        //first ellipse:
        ellipse(x1, y1, DIAMETER, DIAMETER);
        fill(255, 0, 0);

        x1 += dx1;
        if (x1 > width - RADIUS) {
            x1 = width - RADIUS;
            dx1 = -dx1;
        } else if (x1 < RADIUS) {
            x1 = RADIUS;
            dx1 = -dx1;
        }

        y1 += dy1;
        if (y1 > height - RADIUS) {
            y1 = height - RADIUS;
            dy1 = -dy1;
        } else if (y1 < RADIUS) {
            y1 = RADIUS;
            dy1 = -dy1;
        }

        // second ellipse:
        ellipse(x2, y2, DIAMETER, DIAMETER);
        fill(0, 255, 0);

        x2 += dx2;
        if (x2 > width - RADIUS) {
            x2 = width - RADIUS;
            dx2 = -dx2;
        } else if (x2 < RADIUS) {
            x2 = RADIUS;
            dx2 = -dx2;
        }

        y2 += dy2;
        if (y2 > height - RADIUS) {
            y2 = height - RADIUS;
            dy2 = -dy2;
        } else if (y2 < RADIUS) {
            y2 = RADIUS;
            dy2 = -dy2;
        }

        //third ellipse:
        ellipse(x3, y3, DIAMETER, DIAMETER);
        fill(0, 0, 255);

        x3 += dx3;
        if (x3 > width - RADIUS) {
            x3 = width - RADIUS;
            dx3 = -dx3;
        } else if (x3 < RADIUS) {
            x3 = RADIUS;
            dx3 = -dx3;
        }

        y3 += dy3;
        if (y3 > height - RADIUS) {
            y3 = height - RADIUS;
            dy3 = -dy3;
        } else if (y3 < RADIUS) {
            y3 = RADIUS;
            dy3 = -dy3;
        }
    }
    public static void main (String[]args){
        PApplet.main("Task02");
    }

}
