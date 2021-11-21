package ru.mirea.practice.practice11;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Horses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Количество лошадей: ");
        n = in.nextInt();
        horse(n);
    }

    public static void horse(int n) {
        Object lock = new Object();
        List<Thread> horses = new ArrayList<Thread>(n);
        String number;
        for (int i = 1; i < n + 1; i++) {
            number = "" + i;
            Thread horse_i = new Thread(new HorseThread(lock, "Лошадь № " + number));
            horses.add(horse_i);
        }
        for (int i = 0; i < n; i++) {
            horses.get(i).start();
        }
    }
}

class HorseThread implements Runnable {
    private Object lock;
    private String name;

    public HorseThread(Object lock, String name) {
        this.lock = lock;
        this.name = name;
    }

    @Override
    public void run()
    {
        synchronized (lock) {
            for (int i = 0; i < 10001; i++)
            {
                if (i == 10000)
                {
                    System.out.println("Финишировала "+ name);
                    try {
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lock.notify();
                    try {
                        lock.wait(1000);
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
