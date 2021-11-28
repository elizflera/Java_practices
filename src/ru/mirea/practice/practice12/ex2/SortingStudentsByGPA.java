package ru.mirea.practice.practice12.ex2;
import java.util.Comparator;
public class SortingStudentsByGPA implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return -(o1.getBal() - o2.getBal());
        }
}
