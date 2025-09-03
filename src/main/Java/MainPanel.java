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

    //Construtor
    MainPanel () {
        super(new GridBagLayout());
        setBorder(BorderFactory.createLineBorder(Color.RED));

        addMainCanvas(1, 1, defaultColorMap());
        addToolBar(1, 0);
        
        //Example grid - temp code
        int[][] exampleGrid = {{1,1,0,0},{1,0,0,1},{0,0,1,1},{0,1,1,1}};
        gridCanvas.SetGrid(exampleGrid);

    }

    //Returns a color map for the mainCanvas to use
    //only maps key 0 and 1
    HashMap<Integer, Color> defaultColorMap(){
        HashMap<Integer, Color> defaultColorMap = new HashMap<Integer,Color>();
        defaultColorMap.put(0, Color.GRAY);
        defaultColorMap.put(1, Color.BLACK);
        return defaultColorMap;
    }

    //Creates grid canvas and adds it to display
    // gridx/gridy is x y postion on main panel's gridBagLayout
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

    //Creates ToolBar
    // gridx/gridy is x y postion on main panel's gridBagLayout
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
