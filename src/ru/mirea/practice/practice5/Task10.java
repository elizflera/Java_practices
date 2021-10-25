package ru.mirea.practice.practice5;

public class Task10 {
    public static int reverseInt(int num, int ans) {
        if (num == 0)
            return ans;
        else
            return reverseInt(num / 10, 10 * ans + num % 10);
    }

    public static void main(String[] args) {
        int num1 = 123456789;
        int num2 = 6782194;
        System.out.println(num1);
        System.out.println(reverseInt(num1, 0));
        System.out.println(num2);
        System.out.println(reverseInt(num2, 0));
    }
}
