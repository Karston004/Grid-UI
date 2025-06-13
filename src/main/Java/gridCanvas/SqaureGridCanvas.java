package src.main.java.gridCanvas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.HashMap;

//A Panel used for displaying grids using 2D graphics 
public class SqaureGridCanvas extends AbstractGridCanvas {

    protected SqaureGridCanvas(int gridx, int gridy, HashMap<Integer, Color> colorMap) {
		super(gridx, gridy, colorMap);
	}

    @Override
    protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2D = (Graphics2D) g;
    
    int cellSize = Math.min(getWidth()/grid.length, getHeight()/grid[0].length);

    int offsetX = (getWidth() - grid.length*cellSize)/2;
    int offsetY = (getHeight()- grid[0].length*cellSize)/2;

    for (int x = 0; x < grid.length; x++) {
        for (int y = 0; y < grid[0].length; y++) {
            g2D.setColor(colorMap.get(grid[x][y])); // Set colour for pixel.
            g2D.fillRect(offsetX+ x * cellSize, offsetY + y * cellSize, cellSize - 1, cellSize -1);
            }
        }
    }
    
}