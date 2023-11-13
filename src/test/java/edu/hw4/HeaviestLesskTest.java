package edu.hw4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

class HeaviestLesskTest {

    @Test
    void heaviestLessk() {
        HeaviestLessk heaviestLessk = new HeaviestLessk();
        Animal A = new Animal("A", Animal.Type.CAT, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);
        list.sort(new Weight());
        Optional<Animal> response = Optional.of(A);
        Assertions.assertThat(heaviestLessk.heaviestLessk(list, 140)).isEqualTo(response);
    }

    @Test
    @DisplayName("Нет животных ниже k")
    void heaviestLessk2() {
        HeaviestLessk heaviestLessk = new HeaviestLessk();
        Animal A = new Animal("A", Animal.Type.CAT, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);
        list.sort(new Weight());
        Optional<Animal> response = Optional.empty();
        Assertions.assertThat(heaviestLessk.heaviestLessk(list, 90)).isEqualTo(response);
    }
}
