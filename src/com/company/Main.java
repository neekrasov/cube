package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main extends JFrame {
    int width = 800;
    int height = 800;
    CubePanel cubePanel;
    public static int k;

    public Main(){
        this.setTitle("Сладкий кубик");
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расширение куба");
        k = 1000;
////        k = scanner.nextInt();

        Container pane = this.getContentPane();
        pane.setLayout(new GridLayout(2, 1));
        Cube cube = new Cube();
        cube.translate(-0.5, -0.5, -0.5);
        cube.scale(50);

        CubePanel cubePanel = new CubePanel(cube);
        this.cubePanel = cubePanel;
        MoveCubeСontoller moveCubePanel = new MoveCubeСontoller(cube, cubePanel);

        pane.add(cubePanel);
        pane.add(moveCubePanel);

        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g){
        Graphics2D gr = (Graphics2D) g;
        BasicStroke pen1 = new BasicStroke(2); //толщина линии 20
        gr.setStroke(pen1);
        g.clearRect(0, 0, width, height);

        super.paint(g);

        cubePanel.draw();
    }


    public static void main(String[] args) {new Main();}

}
