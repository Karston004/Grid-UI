package src.main.java.gridCanvas;

import java.util.HashMap;
import java.awt.Color;
import javax.swing.JPanel;

public abstract class AbstractGridCanvas extends JPanel {
    HashMap<Integer, Color> colorMap;
    int grid[][];

    protected AbstractGridCanvas (int gridx, int gridy, HashMap<Integer, Color> colorMap) {
        grid = new int[gridx][gridy];
        this.colorMap = colorMap;
    }

    protected void updateColorMap(HashMap<Integer, Color> colorMap){
        this.colorMap = colorMap;
    }

    protected void SetGrid(int g[][]){
        //Check input
        if (g == null || g.length == 0 || g[0] == null) 
            throw new IllegalArgumentException("Input grid is empty or null: 2D not null array expected");
        
        if (g.length != grid.length || g[0].length != grid[0].length)
            grid = new int[g.length][g[0].length];
        //update grid
        grid = g;
    }

    //Classes that extend this should override the paintComponent
    
} 