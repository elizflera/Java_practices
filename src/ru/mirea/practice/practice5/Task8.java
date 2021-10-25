package ru.mirea.practice.practice5;

public class Task8 {
    public static boolean isPalindrome(int start, int end, String word) {
        if (word.charAt(start) != word.charAt(end)) {
            System.out.println("NO");
            return false;
        }
        else if ((start == end) || (start < end)) {
            System.out.println("YES");
            return true;
        }
        else
            return isPalindrome(++start, --end, word);
    }

    public static void main(String[] args) {
        String word1 = "asdfgh";
        String word2 = "level";
        String word3 = "racecar";
        System.out.println(word1);
        isPalindrome(0, word1.length() - 1, word1);
        System.out.println(word2);
        isPalindrome(0, word2.length() - 1, word2);
        System.out.println(word3);
        isPalindrome(0, word3.length() - 1, word3);
    }
}
