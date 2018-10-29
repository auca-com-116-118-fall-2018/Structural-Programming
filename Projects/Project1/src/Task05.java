import processing.core.PApplet;

import javax.swing.*;

public class Task05 extends PApplet {



    public void settings() { fullScreen(); }

    public void setup() {
        background (255);

        String number1  = JOptionPane.showInputDialog("Enter a number");
        String number2 = JOptionPane.showInputDialog("Enter a second number");
        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int sum = a + b;

        fill(0, 0, 255);
        textSize (100);
        textAlign (CENTER, CENTER);
        text(a + "+" + b + "=" + sum, width / 2, height / 2);
    }

    public void draw () {

    }

    public static void main (String [] args){
        PApplet.main("Task05");
    }
}
