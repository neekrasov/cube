package com.company.Move.Left;

import com.company.Cube;
import com.company.CubePanel;

import javax.swing.*;
import java.awt.*;

public class SliderLeftPanel extends JPanel {

    public SliderLeftPanel(Cube cube, CubePanel cubePanel) {
        FlowLayout grid = new FlowLayout();
        this.setLayout(grid);

        this.add(new JTextField("Left"));
        this.add(new SliderLeft(cube, cubePanel));
    }
}
