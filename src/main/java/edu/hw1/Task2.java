package edu.hw1;

public class Task2 {

    static final int DIGIT = 9;
    static final int BASE = 10;

    public int countDigits(int num) {

        int num1 = num;
        int digits = 1;
        while (num1 > DIGIT) {
            num1 = num1 / BASE;
            ++digits;
        }
        return digits;
    }
}
