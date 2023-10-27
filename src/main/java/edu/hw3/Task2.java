package edu.hw3;

public class Task2 {
    String clusterize(String brackets) {
        int len = brackets.length();
        String answer = "[\"";
        int counter = 0;
        for (int i = 0; i < len; ++i) {
            char ch = brackets.charAt(i);
            if (ch == '(') {
                ++counter;
                answer += ch;
            } else if (ch == ')') {
                --counter;
                answer += ch;
            } else {
                throw new IllegalArgumentException();
            }
            if (counter == 0) {
                if (i != len - 1) {
                    answer += "\", \"";
                } else {
                    answer += "\"]";
                }
            }
        }
        if (counter != 0) {
            throw new IllegalArgumentException();
        }
        return answer;
    }
}
