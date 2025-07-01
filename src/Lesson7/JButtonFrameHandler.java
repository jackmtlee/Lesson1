package Lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JButtonFrameHandler extends JFrame implements ActionListener{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private JButton cancelButton;
    private JButton okButton;

    public JButtonFrameHandler(){
        Container contentPane = getContentPane();
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setResizable(false);
        setTitle("Button Frame");
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);

        //set the layout manager
        contentPane.setLayout(new FlowLayout());
        okButton = new JButton("OK");
        contentPane.add (okButton);
        cancelButton =new JButton("Cancel");
        contentPane.add (cancelButton);
        cancelButton.addActionListener(this);
        okButton.addActionListener(this);

        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent event){
        JButton clickedButton = (JButton) event.getSource();
        String buttonText = clickedButton.getText();
        setTitle("You clicked " + buttonText);
    }
    public static void main(String[] args) {
        JButtonFrameHandler frame = new  JButtonFrameHandler();
        frame.setVisible(true);
    }
}
