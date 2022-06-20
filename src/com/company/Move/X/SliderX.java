package com.company.Move.X;

import com.company.Cube;
import com.company.CubePanel;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderX extends JSlider{
    private SliderX slider;
    private final Cube cube;
    private final CubePanel panel;
    private double oldValue;

    public SliderX(Cube cube, CubePanel panel){
        super(0, 360, 0);
        this.setName("X");
        this.cube = cube;
        this.panel = panel;
        this.slider = this;

        SliderListener listener = new SliderListener();
        this.addChangeListener(listener);

    }

    private class SliderListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            int ux = 0;
            if(slider.getValue() < oldValue){
                ux = (int) (-Math.abs(slider.getValue()-oldValue));
            }
            else if(slider.getValue() > oldValue){
                ux = (int) (Math.abs(slider.getValue()-oldValue));
            }
            oldValue = slider.getValue();
            cube.rotate(ux, 0, 0);
            panel.repaint();
        }
    }
}

