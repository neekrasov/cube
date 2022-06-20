package com.company.Move.X;

import com.company.Cube;
import com.company.CubePanel;

import javax.swing.*;
import java.awt.*;

public class SliderXPanel extends JPanel {

    public SliderXPanel(Cube cube, CubePanel cubePanel) {
        FlowLayout grid = new FlowLayout();
        this.setLayout(grid);

        this.add(new JTextField("X"));
        this.add(new SliderX(cube, cubePanel));
    }
}
