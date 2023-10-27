package edu.hw3;

public class Task4 {
    final static int MAX_NUMBER = 3999;
    final static int CUBE_OF_BASE = 1000;
    final static int SQUARE_OF_BASE = 100;
    final static int BASE = 10;

    String convertToRoman(int number) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        if (number > MAX_NUMBER || number <= 0) {
            throw new IllegalArgumentException();
        } else {
            int thousandsPos = number / CUBE_OF_BASE;
            int hundredsPos = (number % CUBE_OF_BASE) / SQUARE_OF_BASE;
            int tensPos = (number % SQUARE_OF_BASE) / BASE;
            int onesPos = number % BASE;
            return thousands[thousandsPos] + hundreds[hundredsPos] + tens[tensPos] + ones[onesPos];
        }
    }
}
