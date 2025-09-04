package src.main.java.gridCanvas;

import java.util.HashMap;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;


public abstract class AbstractGridCanvas extends JPanel{
    HashMap<Integer, Color> colorMap;
    int grid[][];
    public record Point(int x, int y) {}

    public AbstractGridCanvas (int gridWidth, int gridHeight, HashMap<Integer, Color> colorMap) {
        grid = new int[gridWidth][gridHeight];
        this.colorMap = colorMap;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mPressed(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mReleased(e);
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                mDragged(e);
            }
        });
    }

    public void updateColorMap(HashMap<Integer, Color> colorMap){
        this.colorMap = colorMap;
    }

    public void SetGrid(int g[][]){
        //Check input
        if (g == null || g.length == 0 || g[0] == null) 
            throw new IllegalArgumentException("Input grid is empty or null: 2D not null array expected");
        
        if (g.length != grid.length || g[0].length != grid[0].length)
            grid = new int[g.length][g[0].length];
        //update grid
        grid = g;
    }

    protected abstract int[][] mPressed(MouseEvent e);
    protected abstract int[][] mReleased(MouseEvent e);
    protected abstract int[][] mDragged(MouseEvent e);
    
    //Classes that extend this should override the paintComponent
    
} 