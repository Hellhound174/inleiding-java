package h06;

import java.applet.Applet;
import java.awt.*;




public class opdr1 extends Applet {
    double a, b, c, uitkomst;

    public void init() {
        a = 113;
        b = 0;
        c = 4;
        uitkomst = (a + b) / c;
    }

    public void paint(Graphics g) {
        g.drawString("Geld wat iedereen krijgt: " + uitkomst, 20, 20);
        g.drawString("Jan:" + uitkomst, 20, 40);
        g.drawString("Ali:" + uitkomst, 20, 60);
        g.drawString("Jeanette:" + uitkomst, 20, 80);
        g.drawString("Jonas:" + uitkomst, 20, 100);
    }
}