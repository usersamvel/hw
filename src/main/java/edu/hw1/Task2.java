package edu.hw1;

public class Task2 {

    static final int DIGIT = 9;
    static final int BASE = 10;

    public int countDigits(int inputNumber) {

        int mutableNumber = inputNumber;
        int digits = 1;
        while (mutableNumber > DIGIT) {
            mutableNumber = mutableNumber / BASE;
            ++digits;
        }
        return digits;
    }
}
