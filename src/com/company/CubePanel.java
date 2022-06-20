package com.company;

import javax.swing.*;
import java.awt.*;

public class CubePanel extends JPanel {
    private Cube cube;

    public CubePanel(Cube cube){
        this.cube = cube;
    }

    public void draw(){
        this.paint(this.getGraphics());
    }

    public void paint(Graphics g){
        super.paint(g);
        g.translate(this.getWidth()/2, this.getHeight()/2);
        cube.ortDraw(g);
    }


}