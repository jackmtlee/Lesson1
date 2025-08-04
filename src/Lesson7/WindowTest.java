package Lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WindowTest
{
//    WindowListener
//    WindowAdapter
//    //  Apporach 1
//    class MyListener1 implements WindowListener {
//        public void windowOpened(WindowEvent e) {
//            System.out.println("opening the window");
//        }
//        public void windowClosing(WindowEvent e) {
//            ((Window)e.getComponent()).dispose();
//            System.out.println("closing the window");
//        }
//        public void windowClosed(WindowEvent e) {}
//        public void windowIconified(WindowEvent e) {}
//        public void windowDeiconified(WindowEvent e) {}
//        public void windowActivated(WindowEvent e) {}
//        public void windowDeactivated(WindowEvent e) {}
//    }
//
//    // Apporach 2
//    class MyListener2 extends WindowAdapter
//    {
//        public void windowClosing(WindowEvent e) {
//            ((Window)e.getComponent()).dispose();
//            System.out.println("using adapter");
//        }
//    }



    public WindowTest(){
        Frame f = new Frame("Your Frame");
        f.setBounds(100, 100, 450, 300);

//        f.addWindowListener(new MyListener1());

//        // Approach 3
//        f.addWindowListener(new WindowListener() {
//            @Override
//            public void windowOpened(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowClosing(WindowEvent e) {
//                ((Window)e.getComponent()).dispose();
//                System.out.println("using ananymous interface");
//            }
//
//            @Override
//            public void windowClosed(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowIconified(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowDeiconified(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowActivated(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowDeactivated(WindowEvent e) {
//
//            }
//        });

        // Approach 4
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int response = JOptionPane.showConfirmDialog(
                        null,                                // parent component
                        "Do you want to quit?",          // message
                        "Confirm",                           // title
                        JOptionPane.OK_CANCEL_OPTION,           // option type
                        JOptionPane.QUESTION_MESSAGE         // message type
                );

            if(response == JOptionPane.OK_OPTION)
            {((Window)e.getComponent()).dispose();}

            }
        });


        f.setVisible(true);
    }


    public static void main(String[] args)
    {
        new WindowTest();
    }
}
