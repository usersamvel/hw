package edu.hw3;

public class Task1 {
    final static int SUM_OF_INDEXES1 = 219;
    final static int SUM_OF_INDEXES2 = 155;

    String atbash(String string) {
        String answer = "";
        for (int i = 0; i < string.length(); ++i) {
            char ch = string.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                answer += (char) (SUM_OF_INDEXES1 - ch);
            } else if ('A' <= ch && ch <= 'Z') {
                answer += (char) (SUM_OF_INDEXES2 - ch);
            } else {
                answer += ch;
            }
        }
        return answer;
    }
}
