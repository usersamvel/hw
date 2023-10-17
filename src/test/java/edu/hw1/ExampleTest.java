package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    @Test
    void say_hello() {
        Example example = new Example();
        String word = "hello";
        String response = example.say(word);
        org.assertj.core.api.Assertions.assertThat(response).isEqualToIgnoringCase("world");
    }
    @Test
    void sayPing() {
        Example example = new Example();
        String word = "ping";
        String response = example.say(word);
        org.assertj.core.api.Assertions.assertThat(response).isEqualToIgnoringCase("pong");
    }
    @Test
    void sayOther() {
        Example example = new Example();
        String word = "other";
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> {
            example.say(word);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
