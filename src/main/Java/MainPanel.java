package src.main.java;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;

public class MainPanel extends JPanel {
    MainPanel () {
        super(new GridBagLayout());
        this.setBorder(BorderFactory.createLineBorder(Color.RED));
    }
}
