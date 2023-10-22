package edu.hw1;

public class Task5 {

    static final int DIGIT = 9;
    static final int BASE = 10;

    public int child(int num) {
        int num1 = num;
        int ans = 0;
        int digits = 0;
        while (num1 > 0) {
            int digit1 = num1 % BASE;
            num1 = num1 / BASE;
            int digit2 = num1 % BASE;
            num1 = num1 / BASE;
            ans = ans + (digit1 + digit2) * (int) Math.pow(BASE, digits);
            if (digit1 + digit2 >= BASE) {
                digits += 2;
            } else {
                digits += 1;
            }
        }
        return ans;
    }

    public boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        int len = str.length();
        for (int i = 0; i < len / 2 + 1; ++i) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeDescendant(int num) {
        int num1 = num;
        if (num1 < 0) {
            throw new IllegalArgumentException("negative number");
        }
        if (num1 < DIGIT) {
            return true;
        }
        while (num1 >= BASE) {
            if (isPalindrome(num1)) {
                return true;
            }
            num1 = child(num1);
        }
        return false;
    }
}
