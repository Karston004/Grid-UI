package src.main.java.gridCanvas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.HashMap;

public class HexGridCanvas extends AbstractGridCanvas {

    public HexGridCanvas(int gridx, int gridy, HashMap<Integer, Color> colorMap) {
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
            drawHex(g2D, offsetX + x*cellSize, offsetY + y*cellSize, (cellSize)/2, colorMap.get(grid[x][y]));
            }
        }
    }
    
    

    protected void drawHex(Graphics2D g2D, int cX, int cY, int radius,Color color){
        int[] xPoints = new int[6];
        int[] yPoints = new int[6];

        for (int i = 0; i < 6; i++) {
            double angle = Math.toRadians(60 * i - 30);
            xPoints[i] = (int) (cX + radius * Math.cos(angle));
            yPoints[i] = (int) (cY + radius * Math.sin(angle));
        }


        Polygon hex = new Polygon(xPoints, yPoints, 6);
        g2D.setColor(color);
        g2D.fillPolygon(hex);
    }
}




    

