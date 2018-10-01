package h06;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdr extends Applet {
    double a, b, c, d, uitkomst;

    public void init() {
        a = 6.9;
        b = 6.3;
        c = 5.9;
        d = 3;
        uitkomst = (a + b + c) / d;
        uitkomst = (int) (uitkomst * 10);
        uitkomst = (uitkomst / 10);
    }

    public void paint(Graphics g) {
        g.drawString("Gemiddelde:  " + uitkomst, 20, 20);

    }
}