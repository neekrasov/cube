package com.company;

import java.awt.*;
import java.util.Scanner;

public class Cube {
    private Facet[] facets;
    public static int c;

    public Cube() {
        facets = new Facet[6];

        System.out.println("Задайте точку с, она отрицательна и не должна заходить в куб. сейчас это меньше -" + Main.k);
        Scanner scanner = new Scanner(System.in);
        c = -1500;
//        c = scanner.nextInt();

        facets[0] = new Facet(new R3Vector(0, 0, 0), new R3Vector(0, 1, 0), new R3Vector(1, 1, 0), new R3Vector(1, 0, 0));
        facets[0].setColor(Color.BLUE);

        facets[1] = new Facet(new R3Vector(1, 1, 1), new R3Vector(0, 1, 1), new R3Vector(0, 0, 1), new R3Vector(1, 0, 1));
        facets[1].setColor(Color.MAGENTA);

        facets[2] = new Facet(new R3Vector(1, 1, 1), new R3Vector(0, 1, 1), new R3Vector(0, 1, 0), new R3Vector(1, 1, 0));
        facets[2].setColor(Color.YELLOW);

        facets[3] = new Facet(new R3Vector(1, 0, 1), new R3Vector(1, 0, 0), new R3Vector(0, 0, 0), new R3Vector(0, 0, 1));
        facets[3].setColor(Color.ORANGE);

        facets[4] = new Facet(new R3Vector(0, 0, 0), new R3Vector(0, 1, 0), new R3Vector(0, 1, 1), new R3Vector(0, 0, 1));
        facets[4].setColor(Color.RED);

        facets[5] = new Facet(new R3Vector(1, 0, 1), new R3Vector(1, 0, 0), new R3Vector(1, 1, 0), new R3Vector(1, 1, 1));
        facets[5].setColor(Color.GREEN);
    }

    public void scale(double k) {
        for (int i = 0; i < 6; i++) {
            facets[i].scale(k);
        }
    }

    public void translate(double dx, double dy, double dz) {
        for (int i = 0; i < 6; i++) {
            facets[i].translate(dx, dy, dz);
        }
    }

    public void rotate(double ux, double uy, double uz) {
        for (int i = 0; i < 6; i++) {
            facets[i].rotate(ux, uy, uz);
        }
    }

    public void ortDraw(Graphics g) {
        for (int i = 0; i < 6; i++) {
            facets[i].ortDraw(g);
        }
    }
}
