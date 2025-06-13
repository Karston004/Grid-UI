package src.main.java;

import javax.swing.JPanel;

import src.main.java.gridCanvas.SqaureGridCanvas;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;

public class MainPanel extends JPanel {
    SqaureGridCanvas mainCanvas;
    MainPanel () {
        super(new GridBagLayout());
        setBorder(BorderFactory.createLineBorder(Color.RED));

        addMainCanvas(0, 0);
    }

    void addMainCanvas(int gridx, int gridy){
        mainCanvas = new SqaureGridCanvas();
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1;
        c.weighty = 1;
        c.gridx = gridx;
        c.gridy = gridy;
        add(mainCanvas, c);
    }



}
