package edu.hw5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Test
    void parseDate() {
        Task3 task3 = new Task3();
        Optional<LocalDate> response = task3.parseDate("2020-10-10");
        Assertions.assertThat(response).isEqualTo(Optional.of(LocalDate.parse("2020-10-10", dtf)));
    }

    @Test
    void parseDate_() {
        Task3 task3 = new Task3();
        Optional<LocalDate> response = task3.parseDate("1/3/1976");
        Assertions.assertThat(response).isEqualTo(Optional.of(LocalDate.parse("1976-03-01", dtf)));
    }

    @Test
    void parseDate__() {
        Task3 task3 = new Task3();
        Optional<LocalDate> response = task3.parseDate("1.3.1976");
        Assertions.assertThat(response).isEqualTo(Optional.empty());
    }
}
