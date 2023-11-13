package edu.hw3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    @DisplayName("Первый тест")
    void convertToRoman() {

        Task4 task4 = new Task4();
        int number = 2;
        String response = task4.convertToRoman(number);
        Assertions.assertThat(response).isEqualTo("II");

    }

    @Test
    @DisplayName("Второй тест")
    void convertToRoman2() {

        Task4 task4 = new Task4();
        int number = 1994;
        String response = task4.convertToRoman(number);
        Assertions.assertThat(response).isEqualTo("MCMXCIV");

    }

    @Test
    @DisplayName("Отрицательное число")
    void convertToRoman3() {
        Task4 task4 = new Task4();
        int number = -9;
        Assertions.assertThatThrownBy(() -> task4.convertToRoman(number)).isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    @DisplayName("Большое число")
    void convertToRoman4() {
        Task4 task4 = new Task4();
        int number = 4001;
        Assertions.assertThatThrownBy(() -> task4.convertToRoman(number)).isInstanceOf(IllegalArgumentException.class);

    }
}
