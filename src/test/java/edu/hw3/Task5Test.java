package edu.hw3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    @DisplayName("Тест из примера")
    void parseContacts() {
        Task5 task5 = new Task5();
        String[] contacts = {"John Locke", "Thomas Aquinas", "David Hume", "Rene Descartes"};
        String trend = "ASC";
        String[] response = task5.parseContacts(contacts, trend);
        Assertions.assertThat(response)
            .isEqualTo(new String[] {"Thomas Aquinas", "Rene Descartes", "David Hume", "John Locke"});
    }

    @Test
    @DisplayName("Тест из примера")
    void parseContacts2() {
        Task5 task5 = new Task5();
        String[] contacts = {"Paul Erdos", "Leonhard Euler", "Carl Gauss"};
        String trend = "DESC";
        String[] response = task5.parseContacts(contacts, trend);
        Assertions.assertThat(response)
            .isEqualTo(new String[] {"Carl Gauss", "Leonhard Euler", "Paul Erdos"});
    }

    @Test
    @DisplayName("Тест из примера")
    void parseContacts3() {
        Task5 task5 = new Task5();
        String[] contacts = {};
        String trend = "DESC";
        String[] response = task5.parseContacts(contacts, trend);
        Assertions.assertThat(response)
            .isEqualTo(new String[] {});
    }

    @Test
    @DisplayName("Тест из примера")
    void parseContacts4() {
        Task5 task5 = new Task5();
        String[] contacts = null;
        String trend = "DESC";
        String[] response = task5.parseContacts(contacts, trend);
        Assertions.assertThat(response)
            .isEqualTo(new String[] {});
    }

    @Test
    @DisplayName("Некорректный ввод")
    void parseContacts5() {
        Task5 task5 = new Task5();
        String[] contacts = {"A B C"};
        String trend = "DESC";
        Assertions.assertThatThrownBy(() -> task5.parseContacts(contacts, trend))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("Некорректный ввод")
    void parseContacts6() {
        Task5 task5 = new Task5();
        String[] contacts = {"wer ret", "1wer mnb"};
        String trend = "DESC";
        Assertions.assertThatThrownBy(() -> task5.parseContacts(contacts, trend))
            .isInstanceOf(IllegalArgumentException.class);
    }
}
