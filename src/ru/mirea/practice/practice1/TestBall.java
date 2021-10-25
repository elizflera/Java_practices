package ru.mirea.practice.practice1;

public class TestBall {
        public static void main(String[] args) {
                Ball b1 = new Ball(12, 2);
                System.out.println(b1);
                b1.SetXYSpeed();
                System.out.println(b1);
                b1.move(12, 21);
                System.out.println(b1);
        }
        }
