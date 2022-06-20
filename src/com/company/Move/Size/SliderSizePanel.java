package com.company.Move.Size;

import com.company.Cube;
import com.company.CubePanel;

import javax.swing.*;
import java.awt.*;

public class SliderSizePanel extends JPanel {

    public SliderSizePanel(Cube cube, CubePanel cubePanel) {
        FlowLayout grid = new FlowLayout();
        this.setLayout(grid);

        this.add(new JTextField("-"));
        this.add(new SliderSize(cube, cubePanel));
    }
}
