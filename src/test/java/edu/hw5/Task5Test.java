package edu.hw5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void validPlate() {
        Task5 task5 = new Task5();
        String plate = "А123ВЕ777";
        boolean response = task5.validPlate(plate);
        Assertions.assertThat(response).isEqualTo(true);
    }

    @Test
    void validPlate_() {
        Task5 task5 = new Task5();
        String plate = "А123ВГ77";
        boolean response = task5.validPlate(plate);
        Assertions.assertThat(response).isEqualTo(false);
    }
}
