package edu.hw4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class HeightTest {

    @Test
    void compare() {
        Height heigh = new Height();
        Animal A = new Animal("A", Animal.Type.CAT, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);
        list.sort(new Height());
        List<Animal> response = new ArrayList<>();
        response.add(C);
        response.add(A);
        response.add(B);
        Assertions.assertThat(list).isEqualTo(response);
    }

    @Test
    @DisplayName("Пустой список")
    void compare2() {
        Height sortAnimal1 = new Height();
        Animal A = new Animal("A", Animal.Type.CAT, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list = new ArrayList<>();
        list.sort(new Height());
        List<Animal> response = new ArrayList<>();
        Assertions.assertThat(list).isEqualTo(response);
    }
}
