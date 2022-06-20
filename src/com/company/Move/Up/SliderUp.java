package com.company.Move.Up;

import com.company.Cube;
import com.company.CubePanel;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderUp extends JSlider{
    private SliderUp slider;
    private final Cube cube;
    private final CubePanel panel;
    private double oldValue;

    public SliderUp(Cube cube, CubePanel panel){
        super(0, 400, 0);
        this.cube = cube;
        this.panel = panel;
        this.slider = this;

        SliderListener listener = new SliderListener();
        this.addChangeListener(listener);

    }

    private class SliderListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            int y = 0;
            if(slider.getValue() < oldValue){
                y = (int) (Math.abs(slider.getValue()-oldValue));
            }
            else if(slider.getValue() > oldValue){
                y = (int) (-Math.abs(slider.getValue()-oldValue));
            }
            oldValue = slider.getValue();
            cube.translate(0, y, 0);
            panel.repaint();
        }
    }
}

