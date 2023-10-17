package edu.hw1;

import java.util.Arrays;

public class Task6 {

    static final int BASE = 10;
    static final int MAX = 9999;
    static final int MIN = 1000;
    static final int MAG_NUM = 6174;
    static final int DIG_NUM = 3;

    public int countK(int num) {
        int num1 = num;
        if (num1 > MAX || num1 <= MIN) {
            return -1;
        }
        int count = 0;
        while (num1 != MAG_NUM) {
            int digit1 = num1 % BASE;
            num1 = num1 / BASE;
            int digit2 = num1 % BASE;
            num1 = num1 / BASE;
            int digit3 = num1 % BASE;
            num1 = num1 / BASE;
            int digit4 = num1 % BASE;
            int[] digits = {digit1, digit2, digit3, digit4};
            Arrays.sort(digits);
            if (digits[0] == digits[DIG_NUM]) {
                return -1;
            }
            num1 = digits[DIG_NUM] * BASE * BASE * BASE + digits[2] * BASE * BASE + digits[1] * BASE + digits[0]
                - (digits[0] * BASE * BASE * BASE + digits[1] * BASE * BASE + digits[2] * BASE + digits[DIG_NUM]);
            ++count;
        }
        return count;
    }
}
