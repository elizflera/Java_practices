package ru.mirea.practice.practice12.ex2;
import java.util.*;
public class Main {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws StudentException {
        System.out.print("Enter the number of students: ");
        String Kstudy = in.nextLine();
        int Kstud = Integer.parseInt(Kstudy);
        Student st[] = new Student[Kstud];
        List<Student> stu = new ArrayList<>();
        System.out.print("Enter the full name of the students: ");

        for (int i = 0; i < Kstud; i++) {
            String name = in.nextLine();
            int id = (int) (Math.random()*200);
            int b = (int) (Math.random()*100);
            st[i] = new Student(name, id, b);
            stu.add(new Student(name, id, b));
        }
        System.out.println("--------------------------------------------");
        System.out.println("To display a list of students with grades click \"1\".");
        System.out.println("To sort the list of students with grades click\"2\".");
        System.out.println("To search for students click \"3\".");
        System.out.println("To close the program click \"0\".");
        System.out.println("--------------------------------------------");
        String flag = in.nextLine();
        while (!Objects.equals(flag, "0")) {
            switch (flag) {
                case "1":
                    System.out.println("List of students: ");
                    for (Student i : stu) {
                        System.out.println(i);
                    }
                    break;
                case "2":
                    Comparator<Student> comp = new SortingStudentsByGPA();
                    stu.sort(comp);
                    System.out.println("Sorted list of students: ");
                    for (Student i : stu) {
                        System.out.println(i);
                    }
                    break;
                case "3":
                    int help = find(st, Kstud);
                    if (help != -1) {System.out.println("Student found: " + st[help]);}
                    else throw new StudentException("Such student is not on the list.");
            }
            System.out.print("Enter next action number: ");
            flag = in.nextLine();
        }
    }
    public static int find(Student st[], int Kstud) {
        System.out.print("Enter the full name of the student you are looking for: ");
        String Ffio = in.nextLine();
        for (int i = 0; i < Kstud; i++) {
            if (st[i].getFIO().equals(Ffio)) {
                return i;
            }
        }
        return -1;
    }
}
