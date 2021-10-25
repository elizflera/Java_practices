package ru.mirea.practice.practice1;
import java.lang.*;
public class Ball {
    private double x; // переменные, опис. положение мяча
    private double y;

        public Ball(double x, double y) {
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
            this.x=x;
        }

        public void SetY(double y) {
            this.y=y;
        }

        public void SetXY(double x, double y) {
            this.x=x;
            this.y=y;
        }

        public void move(double xDisp, double yDisp) {
            x+=xDisp;
            y+=yDisp;
        }

        public void SetXYSpeed() {
            x+=0.5;
            y+=0.5;
        }

        @Override
        public String toString() {
            return "Ball @ ("+this.x+", "+this.y+").";
        }
    }

