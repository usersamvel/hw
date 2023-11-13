package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public boolean regular1(String string) {
        Pattern format = Pattern.compile("^[0-1]{2}0[0-1]*$");
        Matcher matcher = format.matcher(string);
        return matcher.find();
    }

    public boolean regular2(String string) {
        Pattern format = Pattern.compile("^([0,1])[0-1]*\\1$");
        Matcher matcher = format.matcher(string);
        return matcher.find();
    }

    public boolean regular3(String string) {
        Pattern format = Pattern.compile("^[0-1]{1,3}$");
        Matcher matcher = format.matcher(string);
        return matcher.find();
    }
}
