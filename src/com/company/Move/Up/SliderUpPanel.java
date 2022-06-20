package com.company.Move.Up;

import com.company.Cube;
import com.company.CubePanel;

import javax.swing.*;
import java.awt.*;

public class SliderUpPanel extends JPanel {

    public SliderUpPanel(Cube cube, CubePanel cubePanel) {
        FlowLayout grid = new FlowLayout();
        this.setLayout(grid);

        this.add(new JTextField("Up"));
        this.add(new SliderUp(cube, cubePanel));
    }
}
