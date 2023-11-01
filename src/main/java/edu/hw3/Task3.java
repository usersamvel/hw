package edu.hw3;

import java.util.HashMap;

public class Task3<T> {
    public String freqDict(T[] array) {
        HashMap<T, Integer> counter = new HashMap<T, Integer>();
        for (int i = 0; i < array.length; ++i) {
            if (counter.get(array[i]) != null) {
                counter.put(array[i], counter.get(array[i]) + 1);
            } else {
                counter.put(array[i], 1);
            }
        }
        String answer = "{";
        int len = counter.size();
        int count = 0;
        for (T key : counter.keySet()) {
            if (count < len - 1) {
                answer += String.format("%s: %s, ", key, counter.get(key));
            } else {
                answer += String.format("%s: %s}", key, counter.get(key));
            }
            ++count;
        }
        return answer;
    }
}
