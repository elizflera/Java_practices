package ru.mirea.practice.practice8;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Pet> hashmap = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String s;
        //Получение котов
        System.out.println("Введите клички котов. Для прекращения ввода нажмите 0");
        s = input.next();
        while (!Objects.equals(s, "0")) {
            hashmap.put(s, new Cat (s));
            s = input.next();
        }
        //Получение собак
        System.out.println("Введите клички собак. Для того чтобы остановить ввод, нажмите 0");
        s = input.next();
        while (!Objects.equals(s, "0")) {
            hashmap.put(s, new Dog (s));
            s = input.next();
        }

        // Получение сов
        System.out.println("Введите клички сов. Для того чтобы остановить ввод, нажмите 0");
        s = input.next();
        while (!Objects.equals(s, "0")) {
            hashmap.put(s, new Owl (s));
            s = input.next();
        }

        System.out.println("--------------------------------------------------------");

        System.out.println("Отображение полученного набора:");
        System.out.println(hashmap);
        System.out.println("--------------------------------------------------------");

        hashmap.put("Барсик", new Cat("Барсик"));
        hashmap.put("Бобик", new Dog("Бобик"));
        hashmap.put("Букля", new Owl("Букля"));

        System.out.println("Отображение после добавления элементов:");
        System.out.println(hashmap);

        System.out.println("--------------------------------------------------------");
        System.out.println("Подсчет повторов после рандомной генерации:");
        Random random = new Random();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 100; i++)
        {
            int number = random.nextInt(21);
            Integer frequency = hashMap.get(number);
            hashMap.put(number, frequency == null ? 1 : frequency + 1);
        }
        System.out.println(hashMap); // Отображение набора.
    }
}