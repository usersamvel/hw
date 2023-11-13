package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public boolean validPlate(String plate) {
        Pattern format = Pattern.compile("^[АВЕКМНОРСТУХ]{1}\\d{3}[АВЕКМНОРСТУХ]{2}\\d{2,3}$");
        Matcher matcher = format.matcher(plate);
        return matcher.find();
    }
}
