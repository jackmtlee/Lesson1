package Lesson7;

import java.awt.*;
import java.awt.event.*;

public class EventSample3 {
    class MyListener implements WindowListener {
        public void windowOpened(WindowEvent e) {}

        public void windowClosing(WindowEvent e) {
            ((Window)(e.getComponent())).dispose();
        }

        public void windowClosed(WindowEvent e) {}
        public void windowIconified(WindowEvent e) {}
        public void windowDeiconified(WindowEvent e) {}
        public void windowActivated(WindowEvent e) {}
        public void windowDeactivated(WindowEvent e) {}
    }

    public EventSample3() {
        Frame frame = new Frame("awt");
        frame.setBounds(300, 200, 500, 300);
        frame.addWindowListener(new MyListener());
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new EventSample3();
    }
}
