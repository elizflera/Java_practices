package ru.mirea.practice.practice9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class SolarSystem {
    public static boolean element_existance(ArrayList<String> RecievedList, String element)
    {
        return RecievedList.contains(element);
    }

    public static int get_index(ArrayList<String> RecievedList, String element)
    {
        return RecievedList.indexOf(element);
    }

    public static void add_element(ArrayList<String> RecievedList, String element)
    {
        RecievedList.add(element);
    }

    public static void remove_element(ArrayList<String> RecievedList, String element)
    {
        RecievedList.remove(element);
    }

    public static void change_element(ArrayList<String> RecievedList, String old_element, String new_element)
    {
        RecievedList.set(RecievedList.indexOf(old_element), new_element);
    }

    public static void swap_elements(ArrayList<String> RecievedList, String element1, String element2)
    {
        Collections.swap(RecievedList, RecievedList.indexOf(element1), RecievedList.indexOf(element2));
    }

    public static String random_element(ArrayList<String> RecievedList)
    {
        ArrayList<String> lottery = new ArrayList<>(RecievedList.size());
        for (int i = 0; i < RecievedList.size(); i++)
        {
            lottery.add(RecievedList.get(i));
        }
        Collections.shuffle(lottery);
        return lottery.get(0);
    }

    public static String max_element(ArrayList<String> RecievedList)
    {
        return Collections.max(RecievedList);  // Возврат первого элемента по алфавиту.
    }

    public static String min_element(ArrayList<String> RecievedList)
    {
        return Collections.min(RecievedList);  // Возврат последнего элемента по алфавиту.
    }

    public static void mix_elements(ArrayList<String> RecievedList)
    {
        Collections.shuffle(RecievedList);  // Перемешивание списка.
    }

    public static void sort_elements(ArrayList<String> RecievedList)
    {
        Collections.sort(RecievedList);  // Сортировка по алфавиту.
    }

    public static void reverse_list(ArrayList<String> RecievedList)
    {
        Collections.reverse(RecievedList);  // Разворот списка.
    }

    public static void main(String[] args)
    {

        String venus = new String("Венера");
        String earth = new String("Земля");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");
        String pluto = new String("Плутон");
        String mercury = new String("Меркурий");
        String mars = new String("Марс");
        // Неизменяемый список с планетами Солнечной системы.
        List<String> solarSystem_const = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(mercury, venus, earth, mars, jupiter, saturn, uranus, neptune)));
        System.out.println("Планеты Солнечной системы:");
        System.out.println(solarSystem_const);
        // Изменяемый список с планетами Солнечной системы:
        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(venus, mars, mercury, neptune, earth, saturn));
        // Оставим в списке только планеты земной группы, используя метод удаления элемента.
        remove_element(solarSystem, neptune);
        remove_element(solarSystem, saturn);
        System.out.println("Планеты земной группы в Солнечной системе:");
        System.out.println(solarSystem);
        // Разворот списка планет и вывод первого элемента для получения самой удалённой от Солнца планеты Солнечной системы.
        reverse_list(solarSystem);
        System.out.println("Самая удалённая от Солнца планета Солнечной системы:");
        System.out.println(solarSystem.get(0));
        // Произведём замену планет земной группы на газовые гиганты.
        change_element(solarSystem, mercury, jupiter);
        change_element(solarSystem, venus, saturn);
        change_element(solarSystem, earth, uranus);
        change_element(solarSystem, mars, neptune);
        System.out.println("Газовые гиганты Солнечной системы:");
        System.out.println(solarSystem);
        // Добавим планеты земной группы в список.
        add_element(solarSystem, mercury);
        add_element(solarSystem, venus);
        add_element(solarSystem, earth);
        add_element(solarSystem, mars);
        System.out.println("Cписок планет Солнечной системы:");
        System.out.println(solarSystem);
        // Отсортируем планеты по алфавиту.
        sort_elements(solarSystem);
        System.out.println("Планеты по алфавиту:");
        System.out.println(solarSystem);
        // Вывод первой планеты по алфавиту.
        System.out.println("Первая планета по алфавиту:");
        System.out.println(max_element(solarSystem));
        // Вывод последней планеты по алфавиту.
        System.out.println("Последняя планета по алфавиту:");
        System.out.println(min_element(solarSystem));
        // Произведём выбор случайной планеты.
        String x = random_element(solarSystem);
        System.out.println("Рассмотрим планету:");
        System.out.println(x);
        // Осуществим вывод номера этой планеты по удалённости от Солнца.
        System.out.println("Номер для данной планеты по удалённости от Солнца:");
        System.out.println(get_index(solarSystem, x) + 1);
        // Отсортируем планеты вручную по удалённости от Солнца.
        swap_elements(solarSystem, mercury, venus);
        swap_elements(solarSystem, venus, earth);
        swap_elements(solarSystem, earth, mars);
        swap_elements(solarSystem, jupiter, neptune);
        System.out.println("Планеты Солнечной системы по удалённости от Солнца:");
        System.out.println(solarSystem);
        // Проверка на наличие в списке планет.
        if (element_existance(solarSystem, pluto) == true)
        {
            System.out.println("Плутон является планетой Солнечной системы.");
        }
        else
        {
            System.out.println("Плутон не является планетой Солнечной системы.");
        }
    }
}
