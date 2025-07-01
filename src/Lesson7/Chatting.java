package Lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chatting {
    private JFrame mainFrame = new JFrame("chatting");
    private JTextArea contentArea = new JTextArea();
    private JScrollPane scrollPane = new JScrollPane(contentArea);
    private JPanel bottomPanel = new JPanel();
    private JLabel label = new JLabel("input here");
    private JTextField message = new JTextField(50);
    private JButton sendBtn = new JButton("submit");

    private void addListener() {
        sendBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String msg = message.getText().toString();
                if (msg.equals("")) {
                    JOptionPane.showMessageDialog(null, "blank");
                } else {
                    contentArea.append("\n" + msg);
                    message.setText("");
                }
            }
        });
    }

    private void initializeComponent() {
        contentArea.setBackground(new Color(255, 255, 255));
        contentArea.setEditable(false);
        bottomPanel.add(label);
        bottomPanel.add(message);
        bottomPanel.add(sendBtn);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.add(scrollPane, BorderLayout.CENTER);
        mainFrame.add(bottomPanel, BorderLayout.SOUTH);
        mainFrame.setBounds(300, 200, 800, 500);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Chatting() {
        initializeComponent();
        addListener();
    }

    public static void main(String[] args) {
        new Chatting();
    }

}
