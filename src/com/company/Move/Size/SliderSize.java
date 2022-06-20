package com.company.Move.Size;
import com.company.Cube;
import com.company.CubePanel;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderSize extends JSlider{
    private SliderSize slider;
    private final Cube cube;
    private final CubePanel panel;
    private double oldValue = 0.01;

    public SliderSize(Cube cube, CubePanel panel){
        super(1, 10, 1);
        this.cube = cube;
        this.panel = panel;
        this.slider = this;

        SliderListener listener = new SliderListener();
        this.addChangeListener(listener);

    }

    private class SliderListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            double currentValue = slider.getValue() / 100.0;

            if (oldValue == currentValue){
                return;
            }
            cube.scale((1/oldValue));
            cube.scale(currentValue);
            oldValue = currentValue;
            panel.repaint();
        }
    }
}

