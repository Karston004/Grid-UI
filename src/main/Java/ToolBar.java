package src.main.java;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class ToolBar extends JPanel {

    ToolBar () {
        super(new GridBagLayout());
        setBackground(Color.GRAY);
        createButtons();
    }

    void createButtons(){
        JButton exampleButton0 = new JButton("Example 0");
        exampleButton0.setBackground(Color.WHITE);
        exampleButton0.setPreferredSize(new Dimension(150,50));
        add(exampleButton0);
        JButton exampleButton1 = new JButton("Another Example");
        exampleButton1.setBackground(Color.WHITE);
        exampleButton1.setPreferredSize(new Dimension(150,50));
        add(exampleButton1);
        JButton exampleButton2 = new JButton("Exa");
        exampleButton2.setBackground(Color.WHITE);
        exampleButton2.setPreferredSize(new Dimension(150,50));
        add(exampleButton2);
        JButton exampleButton3 = new JButton("Example Last");
        exampleButton3.setBackground(Color.WHITE);
        exampleButton3.setPreferredSize(new Dimension(150,50));
        add(exampleButton3);
    }

}
