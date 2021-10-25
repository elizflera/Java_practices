package ru.mirea.practice.practice6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestStudent {

    public static void insertionSort(Student[] arr) {
        for(int i = 1; i < arr.length; i++) {
            Student currElem = arr[i];
            int prevKey = i - 1;
            while(prevKey >= 0 && arr[prevKey].getIdNumber() > currElem.getIdNumber()) {
                arr[prevKey+1] = arr[prevKey];
                prevKey--;
            }
            arr[prevKey+1] = currElem;
        }
    }

    public static List<Student> mergeList(List<Student> list1, List<Student> list2) {
        List<Student> list3 = new ArrayList<>();
        int pos1 = 0, pos2 = 0;
        for (int i = 0; i < list1.size() + list2.size(); i++){
            if (pos1 == list1.size()){
                list3.add(list2.get(pos2));
                pos2++;
            } else if (pos2 == list2.size()) {
                list3.add(list1.get(pos1));
                pos1++;
            } else if (list1.get(pos1).getScore() > list2.get(pos2).getScore()) {
                list3.add(list1.get(pos1));
                pos1++;
            } else {
                list3.add(list2.get(pos2));
                pos2++;
            }
        }
        return list3;
    }

    public static List<Student> mergeSort(List<Student> list){
        if (list == null) {
            return null;
        }

        if (list.size() < 2) {
            return list;
        }

        List<Student> list1 = new ArrayList<>();
        for (int i = 0; i < list.size() / 2; i++) {
            list1.add(list.get(i));
        }

        List<Student> list2 = new ArrayList<>();
        for (int i = list.size() / 2; i < list.size(); i++) {
            list2.add(list.get(i));
        }


        list1 = mergeSort(list1);
        list2 = mergeSort(list2);
        return mergeList(list1, list2);
    }

    public static void main(String[] args) {
        Student studentListInsertionSort[] = new Student[30];
        List<Student> studentListQuickSort = new ArrayList<>();
        List<Student> studentListMergeSort1 = new ArrayList<>();
        List<Student> studentListMergeSort2 = new ArrayList<>();
        List<Student> studentListMergeSort3;
        for (int i = 0; i < 30; i++) {
            studentListInsertionSort[i] = new Student((int) (Math.random() * 300), (int) (Math.random() * 300));
            studentListQuickSort.add(new Student((int) (Math.random() * 300), (int) (Math.random() * 300)));
            studentListMergeSort1.add(new Student((int) (Math.random() * 300), (int) (Math.random() * 300)));
            studentListMergeSort2.add(new Student((int) (Math.random() * 300), (int) (Math.random() * 300)));
        }
        insertionSort(studentListInsertionSort);
        System.out.println("Сортировка вставками");
        System.out.println("ID Score");
        for(Student student: studentListInsertionSort) {
            System.out.println(student);
        }


        Comparator<Student> comp = new SortingStudentsByGPA();
        studentListQuickSort.sort(comp);
        System.out.println("\n\nБыстрая сортировка");
        System.out.println("ID Score");
        for (Student student: studentListQuickSort) {
            System.out.println(student);
        }

        studentListMergeSort1 = mergeSort(studentListMergeSort1);
        studentListMergeSort2 = mergeSort(studentListMergeSort2);
        studentListMergeSort3 = mergeList(studentListMergeSort1, studentListMergeSort2);

        System.out.println("\n\nСортировка слиянием");
        System.out.println("ID Score");
        for (Student student: studentListMergeSort3) {
            System.out.println(student);
        }
    }
}
