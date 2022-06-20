package com.company.Move.Buttons;

import com.company.Cube;
import com.company.CubePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonLeft extends JButton {
    private Cube cube;
    private CubePanel panel;

    public ButtonLeft(Cube cube, CubePanel panel) {
        this.setText("Left");

        MyButtonListener listener = new MyButtonListener();
        this.addActionListener(listener);

        this.cube = cube;
        this.panel = panel;
    }

    private class MyButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cube.rotate(0, -1, 0);
            panel.paint(panel.getGraphics());
        }
    }
}