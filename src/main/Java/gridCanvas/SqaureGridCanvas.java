package src.main.java.gridCanvas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.HashMap;
import java.awt.event.MouseEvent;

//A Panel used for displaying grids using 2D graphics 
public class SqaureGridCanvas extends AbstractGridCanvas {
    //local varibles
    private int cellSize;
    private int offsetX;
    private int offsetY;



    public SqaureGridCanvas(int gridx, int gridy, HashMap<Integer, Color> colorMap) {
		super(gridx, gridy, colorMap);
	}

    @Override
    protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2D = (Graphics2D) g;
    
    //Info saved locally to allow clicks to be asinged to a cell without doing their own calculations
    //fine max cell size based on width or height constraint
    this.cellSize = Math.min(getWidth()/grid.length, getHeight()/grid[0].length);

    this.offsetX = (getWidth() - grid.length*cellSize)/2;
    this.offsetY = (getHeight()- grid[0].length*cellSize)/2;

    for (int x = 0; x < grid.length; x++) {
        for (int y = 0; y < grid[0].length; y++) {
            g2D.setColor(colorMap.get(grid[x][y])); // Set colour for tile based on colorMap
            g2D.fillRect(offsetX+ x * cellSize, offsetY + y * cellSize, (int)(cellSize * 0.95), (int)(cellSize * 0.95));
            }
        }
    }

    private Point getCell(MouseEvent e){
        int x = (int)(e.getX() - this.offsetX + (int)(cellSize * 0.025))/cellSize;
        int y = (e.getY() - this.offsetY + (int)(cellSize * 0.025))/cellSize;

        if (x >= this.grid.length || e.getX() < this.offsetX) x = -1;
        if (y >= this.grid[0].length || e.getY() < this.offsetY) y = -1;
        
        return new Point(x, y);
    };

    @Override
    protected int[][] mPressed(MouseEvent e){
        System.out.println(e.getX() + " " + e.getY() + " " + getWidth() + " " + getHeight());
        System.out.println(getCell(e));
        return grid;
    };
    
    @Override
    protected int[][] mReleased(MouseEvent e){
        return grid;
    };

    @Override
    protected int[][] mDragged(MouseEvent e){
        return grid;
    };

}