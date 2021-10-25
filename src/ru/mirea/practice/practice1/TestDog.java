package ru.mirea.practice.practice1;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("N", 7);
        Dog d2 = new Dog("Pup",4);
        System.out.println(d1);
        d1.PeopleAge();
        System.out.println(d2);
    }
}
