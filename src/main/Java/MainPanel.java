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

        addMainCanvas(1, 1, defaultColorMap());
        addToolBar(1, 0);
        
        //Example grid
        int[][] exampleGrid = {{1,1,0,0},{1,0,0,1},{0,0,1,1},{0,1,1,1}};
        gridCanvas.SetGrid(exampleGrid);

    }

    HashMap<Integer, Color> defaultColorMap(){
        HashMap<Integer, Color> defaultColorMap = new HashMap<Integer,Color>();
        defaultColorMap.put(0, Color.GRAY);
        defaultColorMap.put(1, Color.BLACK);
        return defaultColorMap;
    }

    void addMainCanvas(int gridx, int gridy, HashMap<Integer, Color> colorMap){
        gridCanvas = new HexGridCanvas(0, 0, colorMap);
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 10;
        c.weighty = 10;
        c.gridx = gridx;
        c.gridy = gridy;
        add(gridCanvas, c);
    }

    void addToolBar(int gridx, int gridy){
        ToolBar toolBar = new ToolBar();
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0;
        c.weighty = 0;
        c.gridx = gridx;
        c.gridy = gridy;
        add(toolBar,c);
    }

}
