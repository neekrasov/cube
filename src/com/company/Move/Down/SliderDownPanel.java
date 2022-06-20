package com.company.Move.Down;

import com.company.Cube;
import com.company.CubePanel;

import javax.swing.*;
import java.awt.*;

public class SliderDownPanel extends JPanel {

    public SliderDownPanel(Cube cube, CubePanel cubePanel) {
        FlowLayout grid = new FlowLayout();
        this.setLayout(grid);

        this.add(new JTextField("Down"));
        this.add(new SliderDown(cube, cubePanel));
    }
}
