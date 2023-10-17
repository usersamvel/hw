package edu.hw1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Task1Test {

    @Test
    @DisplayName("Корректный ввод")
    void minutesToSecondsPositive() {
        Task1 task1 = new Task1();
        //given
        String s = "12:40";
        //when
        int response = task1.minutesToSeconds(s);
        //then
        Assertions.assertThat(response).isEqualTo(12 * 60 + 40);
    }

    @Test
    @DisplayName("Количество секунд больше 59")
    void minutesToSecondsMoreThan59() {
        Task1 task1 = new Task1();
        //given
        String s = "32:70";
        //when
        //then
        Assertions.assertThatThrownBy(() -> task1.minutesToSeconds(s)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("Встречаютя буквы")
    void minutesToSecondsLetters() {
        Task1 task1 = new Task1();
        //given
        String s = "12:a";
        //then
        Assertions.assertThatThrownBy(() -> task1.minutesToSeconds(s)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("Встречается '!'")
    void minutesToSecondsExclamation() {
        Task1 task1 = new Task1();
        //given
        String s = "12:!";
        //then
        Assertions.assertThatThrownBy(() -> task1.minutesToSeconds(s)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("':' встречается два раза")
    void minutesToSecondsColon() {
        Task1 task1 = new Task1();
        //given
        String s = "12:23:";
        //then
        Assertions.assertThatThrownBy(() -> task1.minutesToSeconds(s)).isInstanceOf(IllegalArgumentException.class);
    }

}
