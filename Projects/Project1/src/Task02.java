import processing.core.PApplet;

public class Task02 extends PApplet {
    int shade = 0;
    int shadeDelta = 10;

    public void settings() {
    fullScreen();
    }

    public void setup() {

    }

    public void draw () {
        background(shade, 0, 0); // [0.255]

        shade += shadeDelta;
        if (shade > 255) {
            shadeDelta = -shadeDelta;
            shade = 255;
        }  else if (shade <0) {
            shadeDelta = -shadeDelta;
            shade = 0;
        }
    }

    public static void main (String [] args){
        PApplet.main("Task02");
    }
}

