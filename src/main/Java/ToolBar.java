package src.main.java;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ToolBar extends JPanel {
    //Class Attributes
    private Color defualtButtonColor = Color.white;
    public ArrayList<JButton> buttons;


    ToolBar () {
        super(new GridBagLayout());
        setBackground(Color.GRAY);
        buttons = new ArrayList<JButton>();
    }

    public void setDefualtButtonsColor(Color color){
        defualtButtonColor = color;
    }

    public void setAllButtonsColor(Color c){
        for (int i = 0; i < buttons.size(); i++){
            buttons.get(i).setBackground(c);
        }
    }

    public void createButton(int gridx, int gridy, String text, int width, int height){
        JButton newButton = new JButton(text);
        newButton.setBackground(defualtButtonColor);
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0;
        c.weighty = 0;
        c.gridx = gridx;
        c.gridy = gridy;
        newButton.setPreferredSize(new Dimension(width,height));
        buttons.add(newButton);
        add(newButton,c);
    }
}
