package edu.hw4;

import java.util.List;

public class LongestName {
    public Animal longestName(List<Animal> list) {
        if (list.size() == 0) {
            return null;
        } else {
            Animal answer = list.get(0);
            int currentLength = answer.name.length();
            for (int i = 1; i < list.size(); ++i) {
                if (list.get(i).name.length() > currentLength) {
                    currentLength = list.get(i).name.length();
                    answer = list.get(i);
                }
            }
            return answer;
        }
    }
}
