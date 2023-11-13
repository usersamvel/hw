package edu.hw3;

import edu.hw1.Task7;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void atbash1() {
        Task1 task1 = new Task1();
        //given
        String string = "Hello world!";
        //when
        String response = task1.atbash(string);
        //then
        Assertions.assertThat(response).isEqualTo("Svool dliow!");
    }

    @Test
    void atbash2() {
        Task1 task1 = new Task1();
        //given
        String string =
            "Any fool can write code that a computer can understand. Good programmers write code that humans can understand. ― Martin Fowler";
        //when
        String response = task1.atbash(string);
        //then
        Assertions.assertThat(response).isEqualTo(
            "Zmb ullo xzm dirgv xlwv gszg z xlnkfgvi xzm fmwvihgzmw. Tllw kiltiznnvih dirgv xlwv gszg sfnzmh xzm fmwvihgzmw. ― Nzigrm Uldovi");
    }

    @Test
    void atbash3() {
        Task1 task1 = new Task1();
        //given
        String string = "";
        //when
        String response = task1.atbash(string);
        //then
        Assertions.assertThat(response).isEqualTo("");
    }
}
