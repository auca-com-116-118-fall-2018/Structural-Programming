import processing.core.PApplet;

public class Task08 extends PApplet {
    float earthOrbitAngle = 0;
    float moonOrbitAngle = 0;
    float planetOrbitAngle = 0;

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
        final int SUN_DIAMETER = 200;

        translate(width / 2, height / 2);
        fill (255, 255, 0);
        ellipse(0, 0, SUN_DIAMETER, SUN_DIAMETER);

        // PLANET
        final int PLANET_DIAMETER = 100;

        rotate(radians(planetOrbitAngle));
        translate(250, 0);
        fill (230, 150, 222);
        ellipse(0, 0, PLANET_DIAMETER, PLANET_DIAMETER);

        planetOrbitAngle += 2;

        // EARTH
        final int EARTH_DIAMETER = 50;

        translate (200, 200);
        rotate (radians(earthOrbitAngle));
        fill (0xff40abff);
        ellipse (0, 0, EARTH_DIAMETER, EARTH_DIAMETER);

        earthOrbitAngle += 1;

        // MOON
        final int MOON_DIAMETER = 20;

        rotate( radians(moonOrbitAngle));
        translate (100, 0);
        fill (202, 204, 206);
        ellipse (0, 0, MOON_DIAMETER, MOON_DIAMETER);

        moonOrbitAngle -= 3;


    }

    public static void main (String [] args){
        PApplet.main("Task11");
    }

}