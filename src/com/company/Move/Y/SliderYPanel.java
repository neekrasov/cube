package com.company.Move.Y;

import com.company.Cube;
import com.company.CubePanel;

import javax.swing.*;
import java.awt.*;

public class SliderYPanel extends JPanel {

    public SliderYPanel(Cube cube, CubePanel cubePanel) {
        FlowLayout grid = new FlowLayout();
        this.setLayout(grid);

        this.add(new JTextField("Y"));
        this.add(new SliderY(cube, cubePanel));
    }
}
