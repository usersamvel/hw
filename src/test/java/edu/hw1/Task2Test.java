package edu.hw1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Task2Test {

    @Test
    @DisplayName("4666")
    void countDigits4666() {
        Task2 task2 = new Task2();
        //given
        int n = 4666;
        //when
        int response = task2.countDigits(n);
        //then
        Assertions.assertThat(response).isEqualTo(4);
    }

    @Test
    @DisplayName("544")
    void countDigits544() {
        Task2 task2 = new Task2();
        //given
        int n = 544;
        //when
        int response = task2.countDigits(n);
        //then
        Assertions.assertThat(response).isEqualTo(3);
    }

    @Test
    @DisplayName("0")
    void countDigits0() {
        Task2 task2 = new Task2();
        //given
        int n = 0;
        //when
        int response = task2.countDigits(n);
        //then
        Assertions.assertThat(response).isEqualTo(1);
    }
}
