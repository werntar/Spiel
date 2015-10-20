import javax.swing.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.Frame;
import java.awt.image.BufferStrategy;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(3); //3= das schlieﬂt sich wenn man aufs x klickt//
        frame.setLocation(500, 200);
        frame.setResizable(false);
        frame.setVisible(true);

        frame.getStrat();

        while (true)
        {
            frame.repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    public static class Frame extends JFrame {
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
            g.fillRect(100, 30, 50, 50);
        }


    }

}











