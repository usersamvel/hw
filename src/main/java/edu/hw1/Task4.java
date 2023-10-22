package edu.hw1;

public class Task4 {

    public String fixString(String str) {
        int len = str.length();
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < len; i = i + 2) {
            if (i <= len - 2) {
                str1.append(str.charAt(i + 1));
                str1.append(str.charAt(i));
            } else {
                str1.append(str.charAt(i));
            }
        }
        return str1.toString();
    }
}
