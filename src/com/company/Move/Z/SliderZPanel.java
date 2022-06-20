package com.company.Move.Z;

import com.company.Cube;
import com.company.CubePanel;

import javax.swing.*;
import java.awt.*;

public class SliderZPanel extends JPanel {

    public SliderZPanel(Cube cube, CubePanel cubePanel) {
        FlowLayout grid = new FlowLayout();
        this.setLayout(grid);
        this.add(new JTextField("Z"));
        this.add(new SliderZ(cube, cubePanel));
    }
}
