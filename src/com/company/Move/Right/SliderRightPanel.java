package com.company.Move.Right;

import com.company.Cube;
import com.company.CubePanel;

import javax.swing.*;
import java.awt.*;

public class SliderRightPanel extends JPanel {

    public SliderRightPanel(Cube cube, CubePanel cubePanel) {
        FlowLayout grid = new FlowLayout();
        this.setLayout(grid);

        this.add(new JTextField("Right"));
        this.add(new SliderRight(cube, cubePanel));
    }
}
