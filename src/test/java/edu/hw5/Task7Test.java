package edu.hw5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    void regular1() {
        Task7 task7 = new Task7();
        String string = "010";
        boolean response = task7.regular1(string);
        Assertions.assertThat(response).isEqualTo(true);
    }

    @Test
    void regular1_() {
        Task7 task7 = new Task7();
        String string = "011";
        boolean response = task7.regular1(string);
        Assertions.assertThat(response).isEqualTo(false);
    }

    @Test
    void regular2() {
        Task7 task7 = new Task7();
        String string = "111010011";
        boolean response = task7.regular2(string);
        Assertions.assertThat(response).isEqualTo(true);
    }

    @Test
    void regular2_() {
        Task7 task7 = new Task7();
        String string = "001010011";
        boolean response = task7.regular2(string);
        Assertions.assertThat(response).isEqualTo(false);
    }

    @Test
    void regular3() {
        Task7 task7 = new Task7();
        String string = "01";
        boolean response = task7.regular3(string);
        Assertions.assertThat(response).isEqualTo(true);
    }

    @Test
    void regular3_() {
        Task7 task7 = new Task7();
        String string = "0100";
        boolean response = task7.regular3(string);
        Assertions.assertThat(response).isEqualTo(false);
    }
}
