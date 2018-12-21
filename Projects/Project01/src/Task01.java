import processing.core.PApplet;

public class Task01 extends PApplet {
    float radius = 100;
    float innerRadius = radius * 0.4f;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);

        stroke(0xffff0000);
        strokeWeight(2);
    }

    public void star(float x, float y, float radius, float innerRadius, int rayCount) {
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

    public void draw() {
        star(width / 2, height / 2, radius, innerRadius, 8);

    }
    public static void main (String[]args){
        PApplet.main("Task01");
    }

}
