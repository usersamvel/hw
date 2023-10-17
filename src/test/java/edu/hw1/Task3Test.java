package edu.hw1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Task3Test {

    @Test
    void isNestable1() {
        Task3 task3 = new Task3();
        //given
        int[] a = {1, 2, 3, 4};
        int[] b = {0, 6};
        //when
        Boolean response = task3.isNestable(a, b);
        //then
        Assertions.assertThat(response).isEqualTo(true);
    }

    @Test
    void isNestabl2() {
        Task3 task3 = new Task3();
        //given
        int[] a = {3, 1};
        int[] b = {4, 0};
        //when
        Boolean response = task3.isNestable(a, b);
        //then
        Assertions.assertThat(response).isEqualTo(true);
    }

    @Test
    void isNestabl3() {
        Task3 task3 = new Task3();
        //given
        int[] a = {9, 9, 8};
        int[] b = {8, 9};
        //when
        Boolean response = task3.isNestable(a, b);
        //then
        Assertions.assertThat(response).isEqualTo(false);
    }

    @Test
    void isNestabl4() {
        Task3 task3 = new Task3();
        //given
        int[] a = {1, 2, 3, 4};
        int[] b = {2, 3};
        //when
        Boolean response = task3.isNestable(a, b);
        //then
        Assertions.assertThat(response).isEqualTo(false);
    }

    @Test
    void isNestabl5() {
        Task3 task3 = new Task3();
        //given
        int[] a = {};
        int[] b = {2, 3};
        //when
        Boolean response = task3.isNestable(a, b);
        //then
        Assertions.assertThat(response).isEqualTo(false);
    }

    @Test
    void isNestabl6() {
        Task3 task3 = new Task3();
        //given
        int[] a = {3, 5, 6};
        int[] b = {};
        //when
        Boolean response = task3.isNestable(a, b);
        //then
        Assertions.assertThat(response).isEqualTo(false);
    }

}
