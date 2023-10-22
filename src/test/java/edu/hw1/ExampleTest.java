package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ExampleTest {

    @Test
    @DisplayName("Введено hello")
    void sayHello() {
        Example example = new Example();
        String word = "hello";
        String response = example.say(word);
        org.assertj.core.api.Assertions.assertThat(response).isEqualToIgnoringCase("world");
    }

    @Test
    @DisplayName("Введено ping")
    void sayPing() {
        Example example = new Example();
        String word = "ping";
        String response = example.say(word);
        org.assertj.core.api.Assertions.assertThat(response).isEqualToIgnoringCase("pong");
    }

    @Test
    @DisplayName("Введено что-то другое")
    void sayOther() {
        Example example = new Example();
        String word = "other";
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> example.say(word))
            .isInstanceOf(IllegalArgumentException.class);
    }
}
