package edu.hw1;

public class Example {
    public String say(String word) {
        return switch (word) {
            case "hello" -> "world";
            case "ping" -> "pong";
            default -> throw new IllegalArgumentException("Unexpected value: " + word);
        };
    }
}

