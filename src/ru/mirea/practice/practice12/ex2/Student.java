package ru.mirea.practice.practice12.ex2;

public class Student implements StudentInterface{
    private String FIO; // ФИО студента
    private int iDNumber; // id студента
    private int bal; // оценка студента

    //конструктор
    public Student(String FIO, int iDNumber, int bal) {
        this.FIO = FIO;
        this.iDNumber = iDNumber;
        this.bal = bal;
    }

//геттеры и сеттеры

    public void setBal(int bal) {
        this.bal = bal;
    }

    public int getBal() {
        return bal;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    @Override
    public String toString() {
        return "ID: " + iDNumber + ", ФИО: " + FIO + ", Оценка: " + bal;
    }
}
