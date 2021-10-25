package ru.mirea.practice.practice6;

public class Student {
    private String name;
    private String group;
    private int idNumber;
    private int score;

    public Student(String name, String group, int idNumber, int score) {
        this.name = name;
        this.group = group;
        this.idNumber = idNumber;
        this.score = score;
    }

    public Student(int idNumber, int score) {
        this.idNumber = idNumber;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("%d %d", idNumber, score);
    }
}

