import processing.core.PApplet;

public class Task12 extends PApplet {


    public void settings() {
        fullScreen();

    }

    public void setup() {
        background(0);

        final int OUTER_RADIUS = 500;
        final float INNER_RADIUS = OUTER_RADIUS * 0.4F;
        final int RAY_COUNT = 8;
        float angle = 0;
        float deltaAngle = 360 / RAY_COUNT;

        stroke(0xffff0000);

        float x = width / 2;
        float y = height / 2;

        float prevX = x + cos(radians(angle)) * OUTER_RADIUS;
        float prevY =  x + cos(radians(angle)) * OUTER_RADIUS;
        for (int i = 0; i < RAY_COUNT; ++i, angle += deltaAngle) {
            float selectedRadius = i % 2 == 0 ? OUTER_RADIUS : INNER_RADIUS;
            float endX = x + cos(radians(angle)) * OUTER_RADIUS;
            float endY = y + sin(radians(angle)) * OUTER_RADIUS;

            line(x, y, endX, endY);
            line (endX, endY, prevX, prevY);
        }
    }

    public void draw () {
        background(0);

    }

    public static void main (String[]args){
        PApplet.main("Task12");
    }

}