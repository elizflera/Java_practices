package ru.mirea.practice.practice3.movable;
import java.util.Objects;

public class MovablePoint implements ru.mirea.practice.practice3.movable.Movable {
    int x,y,xSpeed, ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        if (xSpeed<0) {
            xSpeed *= -1;
        }
        if (ySpeed<0){
            ySpeed*=-1;
        }
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public void moveUp() {
        y+=ySpeed;
    }

    @Override
    public void moveDown() {
        y+=ySpeed;
    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
    }

    @Override
    public void moveRight() {
        x+=xSpeed;

    }

    @Override

       public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    @Override
    public boolean equals(Object o){
        if (this==o) return true;
        if (o==null||getClass()!=o.getClass()) return false;
        MovablePoint that = (MovablePoint) o;
        return xSpeed == that.xSpeed &&
                ySpeed == that.ySpeed;
    }
    @Override
    public int hashCode(){
        return Objects.hash(xSpeed,ySpeed);
    }
}
