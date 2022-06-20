package com.company.Move.Y;

import com.company.Cube;
import com.company.CubePanel;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderY extends JSlider {
    private SliderY slider;
    private final Cube cube;
    private final CubePanel panel;
    private double oldValue;

    public SliderY(Cube cube, CubePanel panel) {
        super(0, 360, 0);
        this.cube = cube;
        this.panel = panel;
        this.slider = this;

        SliderListener listener = new SliderListener();
        this.addChangeListener(listener);

    }

    private class SliderListener implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent e) {
            int uy = 0;
            if (slider.getValue() < oldValue) {
                uy = (int) (-Math.abs(slider.getValue() - oldValue));
            } else if (slider.getValue() > oldValue) {
                uy = (int) (Math.abs(slider.getValue() - oldValue));
            }
            oldValue = slider.getValue();
            cube.rotate(0, uy, 0);
            panel.repaint();
        }
    }
}

