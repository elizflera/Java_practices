package ru.mirea.practice.practice12.ex2;
import java.util.*;
public class Main {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws StudentException {
        System.out.print("Введите количество студентов: ");
        int Kstud = in.nextInt();
        Student st[] = new Student[Kstud];
        List<Student> stu = new ArrayList<>();
        System.out.print("Введите ФИО студентов: ");
        String name = in.nextLine();
        for (int i = 0; i < Kstud; i++) {
            name = in.nextLine();
            int id = (int) (Math.random()*200);
            int b = (int) (Math.random()*100);
            st[i] = new Student(name, id, b);
            stu.add(new Student(name, id, b));
        }
        System.out.println("--------------------------------------------");
        System.out.println("Для вывода списка студентов с оценками нажмите \"1\".");
        System.out.println("Для сортировки списка студентов с оценками нажмите \"2\".");
        System.out.println("Для поиска студента нажмите \"3\".");
        System.out.println("Для завершения работы программы нажмите \"0\".");
        System.out.println("--------------------------------------------");
        String flag = in.nextLine();
        while (!Objects.equals(flag, "0")) {
            switch (flag) {
                case "1":
                    System.out.println("Список студентов: ");
                    for (Student i : stu) {
                        System.out.println(i);
                    }
                    break;
                case "2":
                    Comparator<Student> comp = new SortingStudentsByGPA();
                    stu.sort(comp);
                    System.out.println("Отсортированный список студентов: ");
                    for (Student i : stu) {
                        System.out.println(i);
                    }
                    break;
                case "3":
                    int help = find(st, Kstud);
                    if (help != 0) {System.out.println("Студент найден: " + st[help]);}
                    else throw new StudentException("Такой студент отсутствует в списке.");
            }
            System.out.print("Введите номер следующего действия: ");
            flag = in.nextLine();
        }
    }
    public static int find(Student st[], int Kstud) {
        System.out.print("Введите ФИО искомого студента: ");
        String Ffio = in.nextLine();
        for (int i = 0; i < Kstud; i++) {
            if (st[i].getFIO().equals(Ffio)) {
                return i;
            }
        }
        return 0;
    }
}
