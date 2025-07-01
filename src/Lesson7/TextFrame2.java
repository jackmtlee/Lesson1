package Lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TextFrame2 extends JFrame implements ActionListener{
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 300;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    private JButton clearButton;
    private JButton addButton;
    private JTextField inputLine;
    private JTextArea textArea;

    public TextFrame2(){
        Container contentPane = getContentPane();
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setResizable(false);
        setTitle("Program TextFrame");
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        //set the layout manager
        contentPane.setLayout(new FlowLayout());
        textArea = new JTextArea();
        textArea.setColumns(22);
        textArea.setRows(8);
        textArea.setBorder(BorderFactory.createLineBorder(Color.RED));
        textArea.setEditable(false);
        contentPane.add(textArea);
        JScrollPane scrollText = new JScrollPane(textArea);
        scrollText.setSize(200,125);
        contentPane.add(scrollText);

        inputLine = new JTextField();
        inputLine.setColumns(22);
        contentPane.add(inputLine);
        inputLine.addActionListener(this);

        addButton = new JButton("ADD");
        contentPane.add (addButton);
        addButton.addActionListener(this);

        clearButton =new JButton("CLEAR");
        contentPane.add (clearButton);
        clearButton.addActionListener(this);

        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void  actionPerformed(ActionEvent event){

        if(event.getSource() instanceof JButton){
            JButton clickedButton = (JButton) event.getSource();
            if(clickedButton == addButton){
                addText(inputLine.getText());
            }
            else if (clickedButton == clearButton){
                clearText();
            }
        }
        else{
            addText(inputLine.getText());
        }
    }

    private void addText(String text){
        textArea.append(text+"\n");
        inputLine.setText("");
    }
    private void clearText(){
        textArea.setText("");
        inputLine.setText("");
    }

    public static void main(String[] args) {
        TextFrame2 frame = new TextFrame2();
        frame.setVisible(true);
    }
}



