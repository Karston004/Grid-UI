package src.main.java.gridCanvas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.HashMap;
import java.awt.event.MouseEvent;

public class HexGridCanvas extends AbstractGridCanvas {

    public HexGridCanvas(int gridx, int gridy, HashMap<Integer, Color> colorMap) {
	super(gridx, gridy, colorMap);
	}

    @Override
    protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2D = (Graphics2D) g;

    double rFromWidth  = getWidth() / (Math.sqrt(3) * grid.length + 0.5 * Math.sqrt(3));
    double rFromHeight = getHeight() / (1.5 * (grid[0].length - 1) + 2);
    
    double r = Math.min(rFromWidth, rFromHeight);
    double apothem = r * Math.sqrt(3)/2;

    double offsetX = (getWidth()-(grid.length*2+1)*apothem)/2;
    double offsetY = (getHeight()-r*(1.5*(grid[0].length-1)+2))/2;


    for (int x = 0; x < grid.length; x++) {
        for (int y = 0; y < grid[0].length; y++) {
            drawHex(g2D, apothem+offsetX + x*apothem*2 + apothem*(y%2), offsetY+ r + y*r*1.5, r*0.95, colorMap.get(grid[x][y]));
            }
        }
    }
    
    

    protected void drawHex(Graphics2D g2D, double cX, double cY, double radius,Color color){
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


    @Override
    protected void mPressed(MouseEvent e){
    };
    
    @Override
    protected void mReleased(MouseEvent e){
    };

    @Override
    protected void mDragged(MouseEvent e){
    };
}




    

