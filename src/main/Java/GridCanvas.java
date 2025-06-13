package src.main.java;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

//A Panel used for displaying grids using 2D graphics 
public class GridCanvas extends JPanel {

    int gridX = 10;
    int gridY = 10;
    int cellSize = 30;
    int tileSize = 28;
    GridCanvas(){

    }


    //EXAMPLE GRID SYSTEM!
    @Override
    protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2D = (Graphics2D) g;
    

    int offsetX = (getWidth() - gridX*cellSize)/2;
    int offsetY = (getHeight()- gridY*cellSize)/2;

    for (int x = 0; x < gridX; x++) {
        for (int y = 0; y < gridY; y++) {
            g2D.setColor(Color.BLACK); // Set colour for pixel.
            g2D.fillRect(offsetX+ x * cellSize, offsetY + y * cellSize, tileSize, tileSize);
            }
        }
    }
    
}