import processing.core.PApplet;

public class Task03 extends PApplet {
    final int DIAMETER = 100;
    final int RADIUS = DIAMETER / 2;
    int x, y;
    int dx = 10;
    int dy = 10;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = width / 2;
        y = height / 2;

    }

    public void draw () {
        background(0);
        ellipse(x, y, DIAMETER, DIAMETER);

        x += dx;
        if (x > width - RADIUS) {
            dx = -dx;
        } else if (x < RADIUS) {
            dx = -dx;
        }

        y += dy;
        if (y > height - RADIUS) {
            dy = -dy;
        } else if (y < RADIUS) {
            dy = -dy;
        }
    }

    public static void main (String [] args){
        PApplet.main("Task03");
    }
}
