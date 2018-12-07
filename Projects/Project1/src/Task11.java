import processing.core.PApplet;

public class Task11 extends PApplet {
    float earthOrbitAngle = 0;
    float moonOrbitAngle = 0;

    public void settings() {
        fullScreen();

    }

    public void setup() {
        background (0);
        noStroke();
    }

    public void draw () {
        background (0);

        // SUN
        final int SUN_DIAMETER = 400;

        translate(width / 2, height / 2);
        fill (255, 255, 0);
        ellipse(0, 0, SUN_DIAMETER, SUN_DIAMETER);

        // EARTH
        final int EARTH_DIAMETER = 100;

        rotate (radians(earthOrbitAngle));
        translate (600, 0);
        fill (0xff40abff);
        ellipse (0, 0, EARTH_DIAMETER, EARTH_DIAMETER);

        earthOrbitAngle += 1;

        // MOON
        final int MOON_DIAMETER = 30;

        rotate( radians(moonOrbitAngle));
        translate (150, 0);
        fill (202, 204, 206);
        ellipse (0, 0, MOON_DIAMETER, MOON_DIAMETER);

        moonOrbitAngle -= 3;
    }

    public static void main (String [] args){
        PApplet.main("Task11");
    }

}