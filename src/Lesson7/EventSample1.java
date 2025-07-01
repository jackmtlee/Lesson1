package Lesson7;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventSample1 {
    public static void main(String[] args) {
        final Frame frame = new Frame("awt");
        frame.setBounds(300, 200, 500, 300);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                ((Window) e.getComponent()).dispose();
            }
        });

        frame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1)
                    JOptionPane.showMessageDialog(frame, "left clicked");
                else if (e.getButton() == MouseEvent.BUTTON3)
                    JOptionPane.showMessageDialog(frame, "right clicked");
                else
                    JOptionPane.showMessageDialog(frame, "mid clicked");
            }
        });

        frame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                JOptionPane.showMessageDialog(frame, "key pressed: " + e.getKeyChar());
            }
        });
    }
}
