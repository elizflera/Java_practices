package ru.mirea.practice.practice3.movable;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.radius=radius;
        this.center=new MovablePoint(x,y,xSpeed,ySpeed);
    }

    @Override
    public String toString(){
        return "MovableCircle{"+
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
