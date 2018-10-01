package h06;

import java.applet.Applet;
import java.awt.*;


public class opdr3 extends Applet {
    int a, b,  uitkomst;

    public void init() {
        a = 2147483647;
        b = 1000;

        uitkomst = (a + b);
    }

    public void paint(Graphics g) {
        g.drawString("Uitkomst is: " + uitkomst, 20, 20);

    }
}