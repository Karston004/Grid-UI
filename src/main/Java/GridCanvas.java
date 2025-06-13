package src.main.Java;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

//A Panel used for displaying grids using 2D graphics 
public class GridCanvas extends JPanel {

    GridCanvas(){

    }


    //EXAMPLE GRID SYSTEM!
    @Override
    protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2D = (Graphics2D) g;
    
    for (int x = 0; x < 10; x++) {
        for (int y = 0; y < 10; y++) {
            g2D.setColor(Color.BLACK); // Set colour for pixel.
            g2D.fillRect(x * 3, y * 3, 2, 2);
            }
        }
    }
    
}