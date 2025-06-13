package src.main.java;
//This is the main class used to start the system and initalize the other classes

import javax.swing.JFrame;
import java.awt.Frame;

public class GridUI {   
    JFrame mainFrame;
    MainPanel mainPanel;

    public static void main(String[] args) {
        new GridUI();
    }

    GridUI(){
        createFrame(1080, 720);
        createMainPanel(mainFrame);

        mainFrame.setVisible(true);
    }

    void createFrame(int width, int height) {
        mainFrame = new JFrame();
        mainFrame.setSize(width,height);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void createMainPanel(Frame frame) {
        mainPanel = new MainPanel();
        frame.add(mainPanel);
    }
}
