package Lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextFrame1 extends JFrame implements ActionListener{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    private JButton cancelButton;
    private JButton okButton;
    private JTextField inputLine;
    private JLabel prompt;

    public TextFrame1(){
        Container contentPane = getContentPane();
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setResizable(false);
        setTitle("Button Frame");
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        //set the layout manager
        contentPane.setLayout(new FlowLayout());

        prompt = new JLabel();
        prompt.setText("Please enter your name:");
        prompt.setSize(150,25);
        contentPane.add(prompt);

        inputLine = new JTextField();
        inputLine.setColumns(22);
        contentPane.add(inputLine);
        inputLine.addActionListener(this);

        okButton = new JButton("OK");
        contentPane.add (okButton);
        okButton.addActionListener(this);

        cancelButton =new JButton("Cancel");
        contentPane.add (cancelButton);
        cancelButton.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void  actionPerformed(ActionEvent event){

        if(event.getSource() instanceof JButton){
            JButton clickedButton = (JButton) event.getSource();
            String buttonText = clickedButton.getText();
            setTitle("You clicked " + buttonText);
        }
        else{
            setTitle("You entered "+
                    inputLine.getText());
        }
    }
    public static void main(String[] args) {
        TextFrame1 frame = new  TextFrame1();
        frame.setVisible(true);
    }

}



