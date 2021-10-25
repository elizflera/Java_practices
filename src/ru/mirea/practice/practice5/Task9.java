package ru.mirea.practice.practice5;

public class Task9 {
    public static int noDoubleZero(int a, int b) {  //а - кол-во нулей, b - кол-во единиц
        if (a > b+1)
            return 0;
        else if (a == 0 || b == 0)
            return 1;
        else
            return (noDoubleZero(a-1, b-1) + noDoubleZero(a, b-1));
    }

    public static void main(String[] args) {
        System.out.println("a=1, b=2");
        System.out.println(noDoubleZero(1, 2));
        //011, 101, 110
        System.out.println("a=3, b=2");
        System.out.println(noDoubleZero(3, 2));
        //01010

    }
}
