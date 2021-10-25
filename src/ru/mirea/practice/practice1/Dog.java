package ru.mirea.practice.practice1;
import java.lang.*;
public class Dog {
    private String name;
    private int age;

    public Dog(String n, int a) { //конструктор получение имени и возраста
        name = n;
        age = a;
    }

    public Dog(String n) { // конструктор получение имени
        name = n;
        age = 0;
    }

    public Dog() {
        name = "Puppy";
        age = 0;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return this.name+", age "+this.age;
    }

    public void PeopleAge() { //метод вычисления человеческого возраста собаки
        System.out.println(name+ " age in human years is "+ age*7 + " years" );
    }
}
