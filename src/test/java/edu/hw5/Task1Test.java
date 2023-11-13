package edu.hw5;

import edu.hw3.Task4;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void averageTime() throws ParseException {
        Task1 task1 = new Task1();
        String[] list = new String[] {"2022-03-12, 20:20 - 2022-03-12, 23:50", "2022-04-01, 21:30 - 2022-04-02, 01:20"};
        String response = task1.averageTime(list);
        Assertions.assertThat(response).isEqualTo("3ч 40м");
    }

    @Test
    void averageTime2() {
        Task1 task1 = new Task1();
        String[] list = new String[] {"2022-03-12 20:20 - 2022-03-12, 23:50", "2022-04-01, 21:30 - 2022-04-02, 01:20"};
        Assertions.assertThatThrownBy(() -> task1.averageTime(list)).isInstanceOf(ParseException.class);
    }
}
