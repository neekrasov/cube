package com.company;


import com.company.Move.Size.SliderSizePanel;
import com.company.Move.Down.SliderDownPanel;
import com.company.Move.Left.SliderLeftPanel;
import com.company.Move.Right.SliderRightPanel;
import com.company.Move.Up.SliderUpPanel;
import com.company.Move.X.SliderXPanel;
import com.company.Move.Y.SliderYPanel;
import com.company.Move.Z.SliderZPanel;

import javax.swing.*;
import java.awt.*;

public class MoveCubeСontoller extends JPanel { //View

    public MoveCubeСontoller(Cube cube, CubePanel cubePanel) {
        this.setBackground(Color.BLUE);

//        ButtonUp buttonUp = new ButtonUp(cube, cubePanel);
//        ButtonDown buttonDown = new ButtonDown(cube, cubePanel);
//        ButtonLeft buttonLeft = new ButtonLeft(cube, cubePanel);
//        ButtonRight buttonRight = new ButtonRight(cube, cubePanel);

        SliderXPanel sliderXPanel = new SliderXPanel(cube, cubePanel);
        SliderYPanel sliderYPanel = new SliderYPanel(cube, cubePanel);
        SliderZPanel sliderZPanel = new SliderZPanel(cube, cubePanel);

        SliderUpPanel sliderUpPanel = new SliderUpPanel(cube, cubePanel);
        SliderDownPanel sliderDownPanel = new SliderDownPanel(cube, cubePanel);
        SliderLeftPanel sliderLeftPanel = new SliderLeftPanel(cube, cubePanel);
        SliderRightPanel sliderRightPanel = new SliderRightPanel(cube, cubePanel);

        SliderSizePanel sliderSizePanel = new SliderSizePanel(cube, cubePanel);

        GridLayout grid = new GridLayout(3, 1);
        this.setLayout(grid);
        this.add(sliderXPanel);
        this.add(sliderYPanel);
        this.add(sliderZPanel);
        this.add(sliderUpPanel);
        this.add(sliderDownPanel);
        this.add(sliderLeftPanel);
        this.add(sliderRightPanel);
        this.add(sliderSizePanel);

//        this.add(buttonUp);
//        this.add(buttonDown, downLevel);
//        this.add(buttonLeft, downLevel);
//        this.add(buttonRight, downLevel);
//        this.add(new JTextField("X"));
    }

//    @Override
//    public void update(Observable o, Object arg) {
//        panel.repaint();
//    }
}
