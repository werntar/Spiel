import javax.swing.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.pack();
        frame.setDefaultCloseOperation(3); //3= das schlieﬂt sich wenn man aufs x klickt//
        frame.setLocation(500, 200);
        frame.setResizable(true);
        frame.setVisible(true);

        frame.getStrat();

        while (true) {
            frame.repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}











