package ru.mirea.practice.practice13;
import java.util.ArrayList;
public class ConvertToList {
    public <E> ArrayList<E> convertArrayToList(E[] array) {
        ArrayList<E> list = new ArrayList<>();
        for (E element: array)
            list.add(element);
        return list;
    }

    public static void main(String[] args) {
        ConvertToList ctl = new ConvertToList();
        Integer arrayInt[] = {1,2,3};
        Double arrayDouble[] = {1.1, 2.2, 3.3};
        String arrayString[] = {"a", "b", "c"};

        ArrayList<Integer> listInt = ctl.convertArrayToList(arrayInt);
        ArrayList<Double> listDouble = ctl.convertArrayToList(arrayDouble);
        ArrayList<String> listString = ctl.convertArrayToList(arrayString);

        System.out.println(listInt);
        System.out.println(listDouble);
        System.out.println(listString);

        System.out.println(listInt.get(0).getClass());
        System.out.println(listDouble.get(0).getClass());
        System.out.println(listString.get(0).getClass());

        System.out.println("================");


    }
}
