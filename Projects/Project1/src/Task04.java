import processing.core.PApplet;

import javax.swing.*;

public class Task04 extends PApplet {


    public void settings() { fullScreen(); }

    public void setup() {
        background (0);

        String name  = JOptionPane.showInputDialog("Enter your name");
        fill(0, 0, 255);
        textSize (200);
        textAlign (CENTER, CENTER);
        text(name, width / 2, height / 2);
    }

    public void draw () {
		
    }

    public static void main (String [] args){
        PApplet.main("Task04");
    }
}
