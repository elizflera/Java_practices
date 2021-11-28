package ru.mirea.practice.practice13;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class Solution {
    public static <T> ArrayList<T> newArrayList(T... elements) {
        ArrayList<T> list = new ArrayList<>();
        for (T element : elements)
            list.add(element);
        return list;
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        HashSet<T> set = new HashSet<>();
        for (T element : elements)
            set.add(element);
        return set;
    }

    public static <K, V> HashMap<K, V> newHashMap(ArrayList<K> keys, ArrayList<V> values) {
        HashMap<K, V> map = new HashMap<>();
        int n = Math.min(keys.size(), values.size());
        for (int i = 0; i < n; i++)
            map.put(keys.get(i), values.get(i));
        return map;
    }

    public static void main(String[] args) {
        ArrayList<String> keys = newArrayList("First", "Second", "Third", "Forth");
        ArrayList<Integer> values = newArrayList(1, 2, 3, 4, 5);

        HashMap<String, Integer> hashMap = newHashMap(keys, values);
        HashSet<Double> hashSet = newHashSet(1.0, 2.1, 3.2, 4.3);

        System.out.println("keys: " + keys);
        System.out.println("values: " + values);
        System.out.println("hashMap: " + hashMap);
        System.out.println("hashSet: " + hashSet);
    }
}
