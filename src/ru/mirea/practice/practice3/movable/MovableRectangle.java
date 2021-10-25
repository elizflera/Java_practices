package ru.mirea.practice.practice3.movable;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft, bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);

    }

    @Override
    public void moveUp() {
        if (topLeft.equals(bottomRight)){
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if (topLeft.equals(bottomRight)){
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if (topLeft.equals(bottomRight)){
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public void moveRight() {
        if (topLeft.equals(bottomRight)){
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }
    @Override
    public String toString(){
        return "MovableRectangle{"+
                "topLeft="+topLeft+
                ", bottomRight="+bottomRight+
                '}';
    }
}
