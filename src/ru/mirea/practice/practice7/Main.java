package ru.mirea.practice.practice7;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayDeque<Integer> qu1 = new ArrayDeque<>(), qu2 = new ArrayDeque<>();
        int a, j = 0;
        System.out.println("Введите карты первого игрока");
        for(int i = 0; i < 5; i++){
            a = (int) (Math.random()*10);
            qu1.addLast(a);
            System.out.println(a);
        }
        System.out.println("--------------------------------");
        System.out.println("Введите карты второго игрока");
        for(int i = 0; i < 5; i++){
            a = (int) (Math.random()*10);
            qu2.addLast(a);
            System.out.println(a);
        }
        System.out.println("--------------------------------");
        while (j != 106 && !(qu1.isEmpty() || qu2.isEmpty())){
            if (qu1.getFirst() > qu2.getFirst()){
                qu1.addLast(qu1.pollFirst());
                qu1.addLast(qu2.pollFirst());
            } else {
                qu2.addLast(qu1.pollFirst());
                qu2.addLast(qu2.pollFirst());
            }

            if (qu1.isEmpty()){
                System.out.println("Победил первый на " + (j + 1) + " ход");
            } else if (qu2.isEmpty()){
                System.out.println("Победил второй на " + (j + 1) + " ход");
            }

            j++;
        }
        if (j >=106) System.out.println("БОТВА");
    }
}
