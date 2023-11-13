package edu.hw5;

import edu.hw3.Task4;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void friday13() throws ParseException {
        Task2 task2 = new Task2();
        int number = 2;
        ArrayList<String> response = task2.friday13(1925);
        ArrayList<String> answer = new ArrayList<>();
        answer.add("1925-02-13");
        answer.add("1925-03-13");
        answer.add("1925-11-13");
        Assertions.assertThat(response).isEqualTo(answer);
    }

    @Test
    void friday13_() throws ParseException {
        Task2 task2 = new Task2();
        ArrayList<String> response = task2.friday13(2024);
        ArrayList<String> answer = new ArrayList<>();
        answer.add("2024-09-13");
        answer.add("2024-12-13");
        Assertions.assertThat(response).isEqualTo(answer);
    }

    @Test
    void nextFriday13() throws ParseException {
        Task2 task2 = new Task2();
        Date response = task2.nextFriday13("2024-01-01");
        Assertions.assertThat(response).isEqualTo("2024-09-13");
    }

    @Test
    void nextFriday13_() throws ParseException {
        Task2 task2 = new Task2();
        Date response = task2.nextFriday13("1925-01-01");
        Assertions.assertThat(response).isEqualTo("1925-02-13");
    }
}
