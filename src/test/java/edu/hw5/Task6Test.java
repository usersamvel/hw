package edu.hw5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void isSubstring() {
        Task6 task6 = new Task6();
        String S = "abc";
        String T = "achfdbaabgabcaabg";
        boolean response = task6.isSubstring(S, T);
        Assertions.assertThat(response).isEqualTo(true);
    }

    @Test
    void isSubstring_() {
        Task6 task6 = new Task6();
        String S = "abz";
        String T = "achfdbaabgabcaabg";
        boolean response = task6.isSubstring(S, T);
        Assertions.assertThat(response).isEqualTo(false);
    }
}
