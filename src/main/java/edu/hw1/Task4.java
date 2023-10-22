package edu.hw1;

public class Task4 {

    public String fixString(String inputStr) {
        int len = inputStr.length();
        StringBuilder resultStr = new StringBuilder();
        for (int i = 0; i < len; i = i + 2) {
            if (i <= len - 2) {
                resultStr.append(inputStr.charAt(i + 1));
                resultStr.append(inputStr.charAt(i));
            } else {
                resultStr.append(inputStr.charAt(i));
            }
        }
        return resultStr.toString();
    }
}
