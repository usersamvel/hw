package edu.hw3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test<T> {

    @Test
    @DisplayName("Первый пример")
    void freqDict() {
        Task3 task3 = new Task3();
        String[] array = {"a", "bb", "a", "bb"};
        String response = task3.freqDict(array);
        Assertions.assertThat(response).isEqualTo("{bb: 2, a: 2}");
    }

    @Test
    @DisplayName("Второй пример")
    void freqDict2() {
        Task3 task3 = new Task3();
        String[] array = {"код", "код", "код", "bug"};
        String response = task3.freqDict(array);
        Assertions.assertThat(response).isEqualTo("{код: 3, bug: 1}");
    }

    @Test
    @DisplayName("Третий пример")
    void freqDict3() {
        Task3 task3 = new Task3();
        Integer[] array = {1, 1, 2, 2};
        String response = task3.freqDict(array);
        Assertions.assertThat(response).isEqualTo("{1: 2, 2: 2}");
    }
}
