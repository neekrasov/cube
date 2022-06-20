package com.company;

public class R3Vector {
    private double x, y, z;

    public R3Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void scale(double k) {
        x = x * k;
        y = y * k;
        z = z * k;
    }

    public void translate(double dx, double dy, double dz) {
        x += dx;
        y += dy;
        z += dz;
    }

    public void rotate(double ux, double uy, double uz) { //угол в градусах
        rotateX(ux);
        rotateY(uy);
        rotateZ(uz);
    }

    private void rotateX(double u) {
        u = Math.toRadians(u);
        double tx = x;
        x = tx*Math.cos(u)-y*Math.sin(u);
        y = tx*Math.sin(u)+y*Math.cos(u);
    }

    private void rotateY(double u){
        u = Math.toRadians(u);
        double tx = x;
        x = x*Math.cos(u)+z*Math.sin(u);
        z = -tx*Math.sin(u)+z*Math.cos(u);
    }

    private void rotateZ(double u){
        u = Math.toRadians(u);
        double ty = y;
        y = y*Math.cos(u)+z*Math.sin(u);
        z = -ty*Math.sin(u)+z*Math.cos(u);
    }

    public static R3Vector vect(R3Vector a, R3Vector b){
        double xx = b.y * a.z - (b.z * a.y);     // |x1 |y1 |z1 |
        double yy = -(b.x * a.z - (b.z * a.x));  // |x2 |y2 |z2 |
        double zz = b.x * a.y - (b.y * a.x);     // векторное произведение двух векторов ( (y1*z2-y2*z1)-(x1*z2-x2*z1)+(x1*y2-y1*x2) )
        return (new R3Vector(xx,yy,zz));
    }

    public static R3Vector shiftToZero(R3Vector begin, R3Vector end){
        return (new R3Vector(end.x - begin.x, end.y -begin.y, end.z - begin.z));
    }

//    public void OrtDraw(Graphics g){
//
//    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
