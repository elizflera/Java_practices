package ru.mirea.practice.practice13;
import java.util.ArrayList;

public class PrintFirstFive {
    public <E> ArrayList<E> run(E [] array) {
        ArrayList<E> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (i < 5)
                System.out.println(array[i]);
            list.add(array[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        Integer[] arrayInt = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Double[] arrayDouble = {1.0, 2.1, 3.2, 4.3, 5.4, 6.5, 7.6};
        String[] arrayString = {"a", "b", "c", "d", "e", "f", "g"};
        PrintFirstFive pfv = new PrintFirstFive();
        ArrayList listInt = pfv.run(arrayInt);
        ArrayList listDouble = pfv.run(arrayDouble);
        ArrayList listString = pfv.run(arrayString);

        System.out.println(listInt);
        System.out.println(listDouble);
        System.out.println(listString);
    }
}
