package edu.hw4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class WeightTest {

    @Test
    void kFirst() {
        Weight weight = new Weight();
        Animal A = new Animal("A", Animal.Type.CAT, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);
        list.sort(new Weight());
        List<Animal> response = new ArrayList<>();
        response.add(B);
        response.add(A);
        Assertions.assertThat(Weight.kFirst(list, 2)).isEqualTo(response);
    }

    @Test
    void kFirst2() {
        Weight weight = new Weight();
        Animal A = new Animal("A", Animal.Type.CAT, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);
        list.sort(new Weight());
        List<Animal> response = new ArrayList<>();
        response.add(B);
        response.add(A);
        response.add(C);
        Assertions.assertThat(Weight.kFirst(list, 6)).isEqualTo(response);
    }
}
