package com.company.Move.Z;

import com.company.Cube;
import com.company.CubePanel;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderZ extends JSlider{
    private SliderZ slider;
    private final Cube cube;
    private final CubePanel panel;
    private double oldValue;

    public SliderZ(Cube cube, CubePanel panel){
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
            int uz = 0;

            if(slider.getValue() < oldValue){
                uz = (int) (-Math.abs(slider.getValue()-oldValue));
            }
            else if(slider.getValue() > oldValue){
                uz = (int) (Math.abs(slider.getValue()-oldValue));
            }
            oldValue = slider.getValue();
            cube.rotate(0, 0, uz);
            panel.repaint();
        }
    }
}

