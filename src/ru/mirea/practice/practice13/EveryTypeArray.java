package ru.mirea.practice.practice13;
import java.util.Arrays;

public class EveryTypeArray<T> {
    private T [] array;
    public EveryTypeArray(T [] array) {
        this.array = array;
    }

    public T get(int i) {
        return array[i];
    }



    @Override
    public String toString() {
        return "EveryType{" +
                "array=" + Arrays.toString(array) + ", " +
                array[0].getClass() + "}" ;
    }

    public static void main(String[] args) {
        Integer arrayInt[] = {1,2,3};
        Double arrayDouble[] = {1.1, 2.2, 3.3};
        String arrayString[] = {"a", "b", "c"};


        EveryTypeArray etInt = new EveryTypeArray<>(arrayInt);
        EveryTypeArray etDouble = new EveryTypeArray<>(arrayDouble);
        EveryTypeArray etString = new EveryTypeArray<>(arrayString);

        System.out.println(etInt);
        System.out.println(etDouble);
        System.out.println(etString);

        System.out.println("================");

        System.out.println(etInt.get(0));
        System.out.println(etDouble.get(1));
        System.out.println(etString.get(2));
    }
}
