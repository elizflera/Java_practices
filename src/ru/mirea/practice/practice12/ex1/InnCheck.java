package ru.mirea.practice.practice12.ex1;
import java.util.Hashtable;
import java.util.Objects;
import java.util.Scanner;
public class InnCheck {
    public static void main(String[] args) throws InnException {
        Scanner in = new Scanner(System.in);
        var a = new Hashtable<String, String>();
        a.put("Фамилия Имя Отчество", "1234");
        a.put("Иванов Иван Иванович", "5678");
        a.put("Флёра Елизавета Андреевна", "4444");
        System.out.println("Для оформления заказа введите данные:");
        String FIO, INN;
        System.out.print("ФИО: ");
        FIO = in.nextLine();
        System.out.print("ИНН: ");
        INN = in.next();
        String dINN = a.get(FIO);
        if (Objects.equals(INN, dINN)) {
            System.out.println("Заказ для пользователя " + FIO + " оформлен.");}
        else {throw new InnException("Введенный ИНН не действителен для данного пользователя.");}
    }
}
