import processing.core.PApplet;

public class Task12 extends PApplet {

    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);

        final float MARGIN = 200;
        final float CENTER_STAR_RADIUS = 400;
        final float CENTER_STAR_OUTER_RADIUS = CENTER_STAR_RADIUS * 0.4f;
        final float OUTER_STAR_RADIUS = 200;
        final float OUTER_STAR_OUTER_RADIUS = OUTER_STAR_RADIUS * 0.4f;

        stroke(0xffff0000);
        strokeWeight(10);
        star(width / 2, height / 2, CENTER_STAR_RADIUS, CENTER_STAR_OUTER_RADIUS, 8);
        star(MARGIN, MARGIN, OUTER_STAR_RADIUS, CENTER_STAR_OUTER_RADIUS, 12);
        star(width - MARGIN, height - MARGIN, OUTER_STAR_RADIUS, OUTER_STAR_RADIUS, 12);
        star(MARGIN, height - MARGIN, OUTER_STAR_RADIUS, OUTER_STAR_OUTER_RADIUS, 12);
    }

    public void star(
               float x, float y,
               float radius, float innerRadius,
               int rayCount
           ) {
        float angle = 0;
        float deltaAngle = 360.0f / rayCount;

        float prevX = x + cos(radians(angle - deltaAngle)) * innerRadius;
        float prevY =  y + sin(radians(angle - deltaAngle)) * innerRadius;
        for (int i = 0; i < rayCount; ++i, angle += deltaAngle) {
            float selectedRadius = i % 2 == 0 ? radius : innerRadius;
            float endX = x + cos(radians(angle)) * selectedRadius;
            float endY = y + sin(radians(angle)) * selectedRadius;

            line(x, y, endX, endY);
            line(endX, endY, prevX, prevY);

            prevX = endX;
            prevY = endY;
        }
    }

    public static void main (String[]args){
        PApplet.main("Task12");
    }

}
