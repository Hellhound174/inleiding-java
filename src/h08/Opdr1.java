package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;



public class Opdr1 extends Applet {
    Button knop;
    String schermtekst;

    public void init() {
        knop = new Button();
        knop.setLabel( "Klik op mij" );
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("Doet deze knop wel iets?", 50, 60 );
    }
    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            schermtekst = "Ja, deze knop doet wel iets";
        }
    }
}