package Lesson7;

import java.awt.*;
import java.awt.event.*;

public class EventSample2 {
    public static void main(String[] args) {
        Frame frame = new Frame("awt");
        frame.setBounds(300, 200, 500, 300);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                ((Window) e.getComponent()).dispose();
            }
        });
    }
}
