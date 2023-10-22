package edu.project1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConsoleHangmanTest {

    @Test
    @DisplayName("Буква не угадана")
    void hangman() {
        ConsoleHangman consoleHangman = new ConsoleHangman();
        String hiddenWord = "hello";
        String userInput = "a";
        StringBuilder userOutput = new StringBuilder("*****");
        int userHits = 0;
        int userMistakes = 0;
        String[] response = consoleHangman.hangmanForTest(hiddenWord, userInput, userOutput, userHits, userMistakes);
        Assertions.assertThat(response)
            .isEqualTo(new String[] {"Missed, mistake 1 out of 5", "The word: *****", "Guess a letter:"});

    }

    @Test
    @DisplayName("Победа")
    void hangman2() {
        ConsoleHangman consoleHangman = new ConsoleHangman();
        String hiddenWord = "hello";
        String userInput = "h";
        StringBuilder userOutput = new StringBuilder("*ello");
        int userHits = 4;
        int userMistakes = 2;
        String[] response = consoleHangman.hangmanForTest(hiddenWord, userInput, userOutput, userHits, userMistakes);
        Assertions.assertThat(response)
            .isEqualTo(new String[] {"Hit!", "The word: hello", "You won!"});

    }

    @Test
    @DisplayName("Буква угадана")
    void hangman3() {
        ConsoleHangman consoleHangman = new ConsoleHangman();
        String hiddenWord = "hello";
        String userInput = "h";
        StringBuilder userOutput = new StringBuilder("*ell*");
        int userHits = 2;
        int userMistakes = 2;
        String[] response = consoleHangman.hangmanForTest(hiddenWord, userInput, userOutput, userHits, userMistakes);
        Assertions.assertThat(response)
            .isEqualTo(new String[] {"Hit!", "The word: hell*", "Guess a letter:"});

    }

    @Test
    @DisplayName("Проигрыш")
    void hangman4() {
        ConsoleHangman consoleHangman = new ConsoleHangman();
        String hiddenWord = "hello";
        String userInput = "r";
        StringBuilder userOutput = new StringBuilder("*ell*");
        int userHits = 2;
        int userMistakes = 4;
        String[] response = consoleHangman.hangmanForTest(hiddenWord, userInput, userOutput, userHits, userMistakes);
        Assertions.assertThat(response)
            .isEqualTo(new String[] {"Missed, mistake 5 out of 5", "The word: *ell*", "You lost!"});

    }

    @Test
    @DisplayName("Некорректный ввод")
    void hangman5() {
        ConsoleHangman consoleHangman = new ConsoleHangman();
        String hiddenWord = "hello";
        String userInput = "tu";
        StringBuilder userOutput = new StringBuilder("*ell*");
        int userHits = 2;
        int userMistakes = 4;
        String[] response = consoleHangman.hangmanForTest(hiddenWord, userInput, userOutput, userHits, userMistakes);
        Assertions.assertThat(response)
            .isEqualTo(new String[] {"Incorrect input", "Guess a letter:"});

    }

    @Test
    @DisplayName("Сдача")
    void hangman6() {
        ConsoleHangman consoleHangman = new ConsoleHangman();
        String hiddenWord = "hello";
        String userInput = "I give up";
        StringBuilder userOutput = new StringBuilder("*ell*");
        int userHits = 2;
        int userMistakes = 4;
        String[] response = consoleHangman.hangmanForTest(hiddenWord, userInput, userOutput, userHits, userMistakes);
        Assertions.assertThat(response)
            .isEqualTo(new String[] {"You lost!"});

    }
}
