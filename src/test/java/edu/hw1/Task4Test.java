package edu.hw1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Task4Test {

    @Test
    void fixString1() {
        Task4 task4 = new Task4();
        //given
        String s = "123456";
        //when
        String response = task4.fixString(s);
        //then
        Assertions.assertThat(response).isEqualTo("214365");
    }

    @Test
    void fixString2() {
        Task4 task4 = new Task4();
        //given
        String s = "hTsii  s aimex dpus rtni.g";
        //when
        String response = task4.fixString(s);
        //then
        Assertions.assertThat(response).isEqualTo("This is a mixed up string.");
    }

    @Test
    void fixString3() {
        Task4 task4 = new Task4();
        //given
        String s = "badce";
        //when
        String response = task4.fixString(s);
        //then
        Assertions.assertThat(response).isEqualTo("abcde");
    }

    @Test
    @DisplayName("Пустая строка")
    void fixString4() {
        Task4 task4 = new Task4();
        //given
        String s = "";
        //when
        String response = task4.fixString(s);
        //then
        Assertions.assertThat(response).isEqualTo("");
    }

}
