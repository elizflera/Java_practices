package ru.mirea.practice.practice6;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<ru.mirea.practice.practice6.Student> {
    @Override
    public int compare(ru.mirea.practice.practice6.Student o1, ru.mirea.practice.practice6.Student o2){
        return -(o1.getScore() - o2.getScore());
    }
}