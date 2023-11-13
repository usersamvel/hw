package edu.hw5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Task1 {
    public String averageTime(String[] list) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd, hh:mm");
        int n = list.length;
        long sum = 0;
        for (int i = 0; i < n; ++i) {
            try {
                Date start = sdf.parse(list[i].substring(0, 17));
                Date end = sdf.parse(list[i].substring(20, 37));
                sum += ((end.getTime() - start.getTime()) / 60000);
            } catch (ParseException e) {
                throw new ParseException("error", -1);
            }
        }
        sum = sum / n;
        long hours = sum / 60;
        long mins = sum % 60;
        return String.format("%dч %dм", hours, mins);
    }
}
