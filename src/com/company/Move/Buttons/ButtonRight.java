package com.company.Move.Buttons;

import com.company.Cube;
import com.company.CubePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonRight extends JButton {
    private final Cube cube;
    private final CubePanel panel;

    public ButtonRight(Cube cube, CubePanel panel) {
        this.setText("Right");

        ButtonRightListener rightListener = new ButtonRightListener();
        this.addActionListener(rightListener);

        this.cube = cube;
        this.panel = panel;
    }

    private class ButtonRightListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cube.rotate(0, 1, 0);
            panel.paint(panel.getGraphics());
        }
    }
}