package edu.hw1;

public class Task5 {

    static final int DIGIT = 9;
    static final int BASE = 10;

    public int child(int inputNumber) {
        int mutableNumber = inputNumber;
        int ans = 0;
        int digits = 0;
        while (mutableNumber > 0) {
            int digit1 = mutableNumber % BASE;
            mutableNumber = mutableNumber / BASE;
            int digit2 = mutableNumber % BASE;
            mutableNumber = mutableNumber / BASE;
            ans = ans + (digit1 + digit2) * (int) Math.pow(BASE, digits);
            if (digit1 + digit2 >= BASE) {
                digits += 2;
            } else {
                digits += 1;
            }
        }
        return ans;
    }

    public boolean isPalindrome(int inputNumber) {
        String strFromNumber = Integer.toString(inputNumber);
        int len = strFromNumber.length();
        for (int i = 0; i < len / 2 + 1; ++i) {
            if (strFromNumber.charAt(i) != strFromNumber.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeDescendant(int inputNumber) {
        int mutableNumber = inputNumber;
        if (mutableNumber < 0) {
            throw new IllegalArgumentException("negative number");
        }
        if (mutableNumber < DIGIT) {
            return true;
        }
        while (mutableNumber >= BASE) {
            if (isPalindrome(mutableNumber)) {
                return true;
            }
            mutableNumber = child(mutableNumber);
        }
        return false;
    }
}
