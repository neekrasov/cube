package com.company.Move.Buttons;

import com.company.Cube;
import com.company.CubePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonUp extends JButton {
    private final Cube cube;
    private final CubePanel panel;

    public ButtonUp(Cube cube, CubePanel panel) {
        this.setText("Up");

        ButtonUpListener up = new ButtonUpListener();
        this.addMouseListener(up);

        this.cube = cube;
        this.panel = panel;
    }

    private class ButtonUpListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {
            cube.rotate(-1, 0, 0);
            panel.paint(panel.getGraphics());
        }

        @Override
        public void mouseReleased(MouseEvent e) {}
        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
    }
}
