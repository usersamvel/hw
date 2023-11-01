package edu.hw3.Task7;

import java.util.Comparator;

public class NullIsLeast implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        if (str1 != null && str2 != null) {
            return str1.compareTo(str2);
        }
        if (str1 == null && str2 != null) {
            return -1;
        }
        if (str1 != null) {
            return 1;
        }
        return 0;
    }
}
