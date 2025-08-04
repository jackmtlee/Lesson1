package Lesson7;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

// Java does not support multiple inheritance
//public class WindowTest1 extends JFrame, WindowAdapter

public class WindowTest1 extends JFrame implements WindowListener {


    public WindowTest1() {
        setTitle("Window Test");
        setBounds(100, 100, 450, 300);


        this.addWindowListener(this);
        this.setVisible(true);
    }

    public void windowClosing(WindowEvent e) {

        int response = JOptionPane.showConfirmDialog(
                null,                                // parent component
                "Do you want to quit?",          // message
                "Confirm",                           // title
                JOptionPane.OK_CANCEL_OPTION,           // option type
                JOptionPane.QUESTION_MESSAGE         // message type
        );

//        if(response == JOptionPane.OK_OPTION)
//        {((Window)e.getComponent()).dispose();}
//        else{}

    }

    public void windowOpened(WindowEvent e) {
//            JOptionPane.showMessageDialog(null, "window opened");
        }


        public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}

    public static void main(String[] arags)
    {
        new WindowTest1();
    }
}
