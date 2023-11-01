package edu.hw4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class HeaviestFishTest {

    @Test
    @DisplayName("Рыб нет")
    void heaviestFish() {
        HeaviestFish heaviestFish = new HeaviestFish();
        Animal A = new Animal("A", Animal.Type.CAT, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list1 = new ArrayList<>();
        list1.add(A);
        list1.add(B);
        list1.add(C);
        Animal D = new Animal("A", Animal.Type.SPIDER, Animal.Sex.M, 12, 132, 50, true);
        Animal E = new Animal("B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal F = new Animal("C", Animal.Type.BIRD, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list2 = new ArrayList<>();
        list1.add(D);
        list1.add(E);
        list1.add(F);
        List<List<Animal>> lists = new ArrayList<List<Animal>>();
        Animal response = null;
        Assertions.assertThat(heaviestFish.heaviestFish(lists)).isEqualTo(response);
    }

    @Test
    void heaviestFish2() {
        HeaviestFish heaviestFish = new HeaviestFish();
        Animal A = new Animal("A", Animal.Type.FISH, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list1 = new ArrayList<>();
        list1.add(A);
        list1.add(B);
        list1.add(C);
        Animal D = new Animal("A", Animal.Type.SPIDER, Animal.Sex.M, 12, 132, 50, true);
        Animal E = new Animal("B", Animal.Type.FISH, Animal.Sex.M, 20, 190, 70, true);
        Animal F = new Animal("C", Animal.Type.BIRD, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list2 = new ArrayList<>();
        list1.add(D);
        list1.add(E);
        list1.add(F);
        List<List<Animal>> lists = new ArrayList<List<Animal>>();
        lists.add(list1);
        lists.add(list2);
        Animal response = E;
        Assertions.assertThat(heaviestFish.heaviestFish(lists)).isEqualTo(response);
    }
}
