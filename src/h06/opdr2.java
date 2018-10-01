package h06;

import java.applet.Applet;
import java.awt.*;




public class opdr2 extends Applet {
    double a, b, c, uitkomst;

    public void init() {
        a = 60*60;
        b = 24;
        c = 365;
        uitkomst = (a * b) * c;
    }

    public void paint(Graphics g) {
        g.drawString("Secondes in uur: " + a, 20, 40);
        g.drawString("Secondes in dag: " + a * b, 20, 60);
        g.drawString("Jaar uitkomst: " + uitkomst, 20, 80);
    }
}