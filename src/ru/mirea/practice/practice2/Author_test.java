package ru.mirea.practice.practice2;

public class Author_test {
    public static void main(String[] args) {
        Author author = new Author("Anna", "ann@mail.ru", 'F');
        System.out.println(author);
        author.setEmail("anna@mail.ru");
        System.out.println(author);
    }
}
