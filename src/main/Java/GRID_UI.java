package src.main.java;
//This is the main class used to start the system and initalize the other classes

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class GRID_UI {
    JFrame mainFrame;
    JPanel mainPanel;
    public static void main(String[] args) {
        new GRID_UI();
    }

    GRID_UI(){
        createFrame(1080, 720);
        createGridBagLayout(mainFrame);

        mainFrame.setVisible(true);
    }

    void createFrame(int width, int height) {
        mainFrame = new JFrame();
        mainFrame.setSize(width,height);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void createGridBagLayout(Frame frame) {
        mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBorder(BorderFactory.createLineBorder(Color.RED));
        frame.add(mainPanel);
    }
}
