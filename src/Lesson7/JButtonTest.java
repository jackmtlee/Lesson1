package Lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JButtonTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel top = new JPanel();
        JPanel bottom = new JPanel();
        final JRadioButton b1 = new JRadioButton("red");
        final JRadioButton b2 = new JRadioButton("blue");
        final JRadioButton b3 = new JRadioButton("yellow");
        ButtonGroup group = new ButtonGroup();
        group.add(b1);
        group.add(b2);
        group.add(b3);

        bottom.setLayout(new FlowLayout());
        bottom.add(b1);
        bottom.add(b2);
        bottom.add(b3);

        frame.add(top, BorderLayout.CENTER);
        frame.add(bottom, BorderLayout.SOUTH);
        frame.setBounds(100, 100, 450, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener myListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b1.isSelected())
                    top.setBackground(Color.RED);
                if (b2.isSelected())
                    top.setBackground(Color.BLUE);
                if (b3.isSelected())
                    top.setBackground(Color.YELLOW);
            }
        };

        b1.addActionListener(myListener);
        b2.addActionListener(myListener);
        b3.addActionListener(myListener);
    }
}
