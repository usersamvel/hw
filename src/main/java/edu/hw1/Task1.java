package edu.hw1;

public class Task1 {

    static final int SEC_IN_MIN = 60;
    static final int COLON_POS = 3;
    static final String ERROR = "Некорректный формат";

    public int minutesToSeconds(String str) {
        int len = str.length();
        for (int i = 0; i < len; ++i) {
            char ch = str.charAt(i);
            if (!(Character.isDigit(ch) || ch == ':') || (ch == ':' && i != len - COLON_POS)) {
                throw new IllegalArgumentException(ERROR);
            }
        }
        String[] part = str.split(":");
        if (Integer.parseInt(part[1]) >= SEC_IN_MIN) {
            throw new IllegalArgumentException(ERROR);
        } else {
            return SEC_IN_MIN * Integer.parseInt(part[0]) + Integer.parseInt(part[1]);
        }
    }
}
