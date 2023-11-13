package edu.hw5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task2 {
    public ArrayList<String> friday13(int year) throws ParseException {
        ArrayList<String> answer = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date start = sdf.parse(String.format("%d-01-01", year));
        Date end = sdf.parse(String.format("%d-12-31", year));
        for (Date date = start; date.before(end); date = Date.from(date.toInstant().plusSeconds(60 * 60 * 24))) {
            if (date.getDay() == 5 && date.getDate() == 13) {
                answer.add(sdf.format(date));
            }
        }
        return answer;
    }

    public Date nextFriday13(String start_) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date start = sdf.parse(start_);
        for (Date date = start; ; date = Date.from(date.toInstant().plusSeconds(60 * 60 * 24))) {
            if (date.getDay() == 5 && date.getDate() == 13) {
                return date;
            }
        }
    }
}
