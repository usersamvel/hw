package edu.hw5;

import edu.hw5.Task4;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void containSymbol() {
        Task4 task4 = new Task4();
        String password = "!";
        boolean response = task4.containSymbol("!");
        Assertions.assertThat(response).isEqualTo(true);
    }

    @Test
    void containSymbol_() {
        Task4 task4 = new Task4();
        String password = "!";
        boolean response = task4.containSymbol("cwyg9");
        Assertions.assertThat(response).isEqualTo(false);
    }
}
