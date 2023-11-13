package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public boolean isSubstring(String S, String T) {
        Pattern format = Pattern.compile(".*" + S + ".*");
        Matcher matcher = format.matcher(T);
        return matcher.find();
    }
}
