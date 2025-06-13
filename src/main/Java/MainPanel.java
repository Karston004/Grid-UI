package src.main.java;

import javax.swing.JPanel;

import src.main.java.gridCanvas.AbstractGridCanvas;
import src.main.java.gridCanvas.HexGridCanvas;
import src.main.java.gridCanvas.SqaureGridCanvas;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.HashMap;

import javax.swing.BorderFactory;

public class MainPanel extends JPanel {
    AbstractGridCanvas gridCanvas;
    MainPanel () {
        super(new GridBagLayout());
        setBorder(BorderFactory.createLineBorder(Color.RED));


        HashMap<Integer, Color> defaultColorMap = new HashMap<Integer,Color>();
        defaultColorMap.put(0, Color.GRAY);
        defaultColorMap.put(1, Color.BLACK);
        addMainCanvas(0, 0, defaultColorMap);
        
        int[][] exampleGrid = {{1,1,0,0},{1,0,0,1},{0,0,1,1},{0,1,1,1}};
        gridCanvas.SetGrid(exampleGrid);
    }

    void addMainCanvas(int gridx, int gridy, HashMap<Integer, Color> colorMap){
        gridCanvas = new HexGridCanvas(gridx, gridy, colorMap);
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1;
        c.weighty = 1;
        c.gridx = gridx;
        c.gridy = gridy;
        add(gridCanvas, c);
    }



}
