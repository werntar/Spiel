/**
 * Created by David on 20.10.2015.
 */

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class Frame extends JFrame {
    private BufferStrategy strat;

    public Frame() {
        super("Baum im Raum");
    }

    public BufferStrategy getStrat() {
        createBufferStrategy(2);
        strat = getBufferStrategy();
        return strat;
    }

    public void repaint() {
        Graphics g = strat.getDrawGraphics();
        draw(g);
        g.dispose();
        strat.show();
    }

    public void draw(Graphics g) {
        g.setColor(ColorUIResource.blue);
        g.fill3DRect(100, 70, 89, 20, true);
    }
}
