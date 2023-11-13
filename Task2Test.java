package edu.hw3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    @DisplayName("Первый тест из примера")
    void clusterize1() {
        Task2 task2 = new Task2();
        String string = "()()()";
        String response = task2.clusterize(string);
        Assertions.assertThat(response).isEqualTo("[\"()\", \"()\", \"()\"]");
    }

    @Test
    @DisplayName("Третий тест из примера")
    void clusterize2() {
        Task2 task2 = new Task2();
        String string = "((()))(())()()(()())";
        String response = task2.clusterize(string);
        Assertions.assertThat(response).isEqualTo("[\"((()))\", \"(())\", \"()\", \"()\", \"(()())\"]");
    }

    @Test
    @DisplayName("Несбалансированная последовательность скобое")
    void clusterize3() {
        Task2 task2 = new Task2();
        String string = "()())";
        Assertions.assertThatThrownBy(() -> task2.clusterize(string)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("Другие символы")
    void clusterize4() {
        Task2 task2 = new Task2();
        String string = "()2()";
        Assertions.assertThatThrownBy(() -> task2.clusterize(string)).isInstanceOf(IllegalArgumentException.class);
    }
}
