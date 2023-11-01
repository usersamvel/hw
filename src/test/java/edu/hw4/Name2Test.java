package edu.hw4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class Name2Test {

    @Test
    void name2() {
        Name2 name2 = new Name2();
        Animal A = new Animal("A A A", Animal.Type.CAT, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("B B B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);
        list.sort(new Weight());
        List<Animal> response = new ArrayList<>();
        response.add(B);
        response.add(A);
        Assertions.assertThat(name2.name2(list)).isEqualTo(response);
    }

    @Test
    @DisplayName("Нет подходящих")
    void name2_2() {
        Name2 name2 = new Name2();
        Animal A = new Animal("A A", Animal.Type.CAT, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("B B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);
        List<Animal> response = new ArrayList<>();
        Assertions.assertThat(name2.name2(list)).isEqualTo(response);
    }
}
