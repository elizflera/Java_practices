package ru.mirea.practice.practice3.movable;

public class TestMovable {
    public static void main(String[] args){
        Movable m1 = new MovableCircle(1,1,2,3,4);
        Movable m2 = new MovablePoint(1,1,2,3);
        Movable m3 = new ru.mirea.practice.practice3.movable.MovableRectangle(1,1,4,5,2,3);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        m1.moveDown();
        m2.moveLeft();
        m3.moveRight();
        m3.moveUp();

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}
