import processing.core.PApplet;

import javax.swing.*;

public class Task07 extends PApplet {
	float x1 = 0;
	float y1 = 100;
	float x2 = width - 50;
	float y2 = 100;
	int dx = 10;
    int dy = 10;

    public void settings() { fullScreen(); }

    public void setup() {
        background (0);

		String name  = JOptionPane.showInputDialog("Enter your name");
		String lastname  = JOptionPane.showInputDialog("Enter your name");


        fill(100, 0, 255);
        textSize (100);
        textAlign (CENTER, CENTER);

        text(name, x1, x2);
        text(lastname, x2, y2);

        float w = textWidth(name);
        float w2 = textWidth(lastname);

		x1 += dx;

		if (x1 + w / 2 > width) {
			x1 = width - w / 2 - 1;
			dx =- dx;
		}

		if (x1 <= w / 2) {
			x1 = w / 2;
			dx = -dx;
		}

		x2 -= dx;
		if (x2 <= w2 / 2) {
		    x2 = w2 / 2;
			dx = -dx;
		}

		if (x2 + w2 / 2 > width){
			x2 = width - w2 / 2 - 1;
			dx = -dx;
		}



	}

    public void draw () {
		
    }

    public static void main (String [] args){
        PApplet.main("Task07");


	}
}
