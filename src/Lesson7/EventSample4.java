package Lesson7;

import java.awt.*;
import java.awt.event.*;

public class EventSample4 {
    class MyListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            ((Window)(e.getComponent())).dispose();
        }
    }

    public EventSample4() {
        Frame frame = new Frame("awt");
        frame.setBounds(300, 200, 500, 300);
        frame.addWindowListener(new MyListener());
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new EventSample4();
    }
}
