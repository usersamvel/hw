package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public boolean containSymbol(String password) {
        Pattern format = Pattern.compile("[~!@#$%^&*|]");
        Matcher matcher = format.matcher(password);
        return matcher.find();
    }
}
