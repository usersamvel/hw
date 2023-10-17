package edu.hw1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Task7RightTest {

    @Test
    void rotateRight() {
        Task7 task7 = new Task7();
        //given
        int n = 8;
        int shift = 1;
        //when
        int response = task7.rotateRight(n, shift);
        //then
        Assertions.assertThat(response).isEqualTo(4);
    }

    @Test
    void rotateRight2() {
        Task7 task7 = new Task7();
        //given
        int n = 456;
        int shift = 111;
        //when
        int response = task7.rotateRight(n, shift);
        //then
        Assertions.assertThat(response).isEqualTo(57);
    }

    @Test
    void rotateRight3() {
        Task7 task7 = new Task7();
        //given
        int n = 0;
        int shift = 1;
        //when
        int response = task7.rotateRight(n, shift);
        //then
        Assertions.assertThat(response).isEqualTo(0);
    }

    @Test
    @DisplayName("Отрицательное число")
    void rotateRight4() {
        Task7 task7 = new Task7();
        //given
        int n = -5;
        int shift = 5;
        //when
        Assertions.assertThatThrownBy(() -> task7.rotateRight(n, shift)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("Отрицательное число")
    void rotateRight5() {
        Task7 task7 = new Task7();
        //given
        int n = 10;
        int shift = -5;
        //when
        Assertions.assertThatThrownBy(() -> task7.rotateRight(n, shift)).isInstanceOf(IllegalArgumentException.class);
    }

}
