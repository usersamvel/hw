package edu.hw4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class AnimalComparatorTest {

    @Test
    void sortAnimal() {
        Weight weight = new Weight();
        Animal A = new Animal("A", Animal.Type.SPIDER, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        Animal D = new Animal("D", Animal.Type.FISH, Animal.Sex.F, 4, 100, 30, true);
        Animal E = new Animal("E", Animal.Type.FISH, Animal.Sex.M, 4, 100, 30, true);
        Animal F = new Animal("F", Animal.Type.FISH, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);
        list.add(E);
        list.add(D);
        list.add(F);
        list.sort(new AnimalComparator());
        List<Animal> response = new ArrayList<>();
        response.add(B);
        response.add(C);
        response.add(D);
        response.add(E);
        response.add(F);
        response.add(A);
        Assertions.assertThat(AnimalComparator.sortAnimal(list)).isEqualTo(response);
    }

    @Test
    @DisplayName("Пустой список")
    void sortAnimal2() {
        Weight weight = new Weight();
        Animal A = new Animal("A", Animal.Type.SPIDER, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        Animal D = new Animal("D", Animal.Type.FISH, Animal.Sex.F, 4, 100, 30, true);
        Animal E = new Animal("E", Animal.Type.FISH, Animal.Sex.M, 4, 100, 30, true);
        Animal F = new Animal("F", Animal.Type.FISH, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list = new ArrayList<>();
        list.sort(new AnimalComparator());
        List<Animal> response = new ArrayList<>();
        Assertions.assertThat(AnimalComparator.sortAnimal(list)).isEqualTo(response);
    }
}
