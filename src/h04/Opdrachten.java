package h04;

import java.applet.Applet;
import java.awt.*;

import static java.awt.Color.yellow;
import static java.awt.Color.black;



public class Opdrachten extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(black);
    }

    public void paint(Graphics g) {
        setBackground(black);
        g.setColor(yellow);
        g.setColor(yellow);
        g.setColor(yellow);
        g.setColor(yellow);
        g.setColor(yellow);
        g.drawLine(220, 220, 220, 120);
        g.drawLine(50, 120, 270, 120);
        g.drawLine(50, 120, 160, 90);
        g.drawLine(270, 120, 160, 90);
        g.drawLine(220, 220, 220, 120);
        g.drawLine(100, 220, 220, 220);
        g.drawLine(100, 220, 100, 120);
        g.drawLine(150, 180, 130, 180);
        g.drawLine(130, 150, 150, 150);
        g.drawLine(130, 150, 130, 180);
        g.drawLine(150, 150, 150, 180);
        g.drawLine(150, 165, 130, 165);
        g.drawLine(140, 150, 140, 180);
        g.drawRect(160, 150, 45, 70);
        g.drawOval(160, 180, 10, 10);

    }
}