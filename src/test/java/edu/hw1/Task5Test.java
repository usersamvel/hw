package edu.hw1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Task5Test {

    @Test
    void isPalindromeDescendant1() {
        Task5 task5 = new Task5();
        //given
        int n = 11211230;
        //when
        boolean response = task5.isPalindromeDescendant(n);
        //then
        Assertions.assertThat(response).isEqualTo(true);
    }

    @Test
    void isPalindromeDescendant2() {
        Task5 task5 = new Task5();
        //given
        int n = 112;
        //when
        boolean response = task5.isPalindromeDescendant(n);
        //then
        Assertions.assertThat(response).isEqualTo(false);
    }

    @Test
    void isPalindromeDescendant3() {
        Task5 task5 = new Task5();
        //given
        int n = 13001120;
        //when
        boolean response = task5.isPalindromeDescendant(n);
        //then
        Assertions.assertThat(response).isEqualTo(true);
    }

    @Test
    void isPalindromeDescendant4() {
        Task5 task5 = new Task5();
        //given
        int n = 0;
        //when
        boolean response = task5.isPalindromeDescendant(n);
        //then
        Assertions.assertThat(response).isEqualTo(true);
    }

    @Test
    @DisplayName("Отрицательное число")
    void isPalindromeDescendant5() {
        Task5 task5 = new Task5();
        //given
        int n = -6;
        //when
        //then
        Assertions.assertThatThrownBy(() -> task5.isPalindromeDescendant(n))
            .isInstanceOf(IllegalArgumentException.class);
    }
}
