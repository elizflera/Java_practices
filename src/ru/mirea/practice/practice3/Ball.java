package ru.mirea.practice.practice3;

public class Ball {
    private double x;
    private double y;

    public Ball() {
    }

    private Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void SetX(double x) {
        this.x = x;
    }

    public void SetY(double y) {
        this.y = y;
    }

    public void SetXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        x += xDisp;
        y += yDisp;
    }

    public String toString() {
        return "x = " + x +" " +"y = " + y;
    }

    public static void main(String[] args) {
        Ball b1=new Ball(10, 3);
        System.out.println("first ball test");
        System.out.println(b1);
        b1.move(10, 17);
        System.out.println(b1);
        Ball b2= new Ball();
        System.out.println(b2);
        b2.move(-10,-10);
        System.out.println(b2);
    }
}
