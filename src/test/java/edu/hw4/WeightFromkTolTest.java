package edu.hw4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class WeightFromkTolTest {

    @Test
    void weightFromKTol() {
        WeightFromkTol weightFromkTol = new WeightFromkTol();
        Animal A = new Animal("A", Animal.Type.CAT, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);
        HashMap<Animal.Type, Integer> response = new HashMap<>();
        int k = 4;
        int l = 40;
        response.put(Animal.Type.CAT, 120);
        response.put(Animal.Type.DOG, 30);
        response.put(Animal.Type.BIRD, 0);
        response.put(Animal.Type.FISH, 0);
        response.put(Animal.Type.SPIDER, 0);
        Assertions.assertThat(weightFromkTol.weightFromkTol(list, k, l)).isEqualTo(response);
    }

    @Test
    @DisplayName("Нет подходящих")
    void weightFromkTol2() {
        WeightFromkTol weightFromkTol = new WeightFromkTol();
        Animal A = new Animal("A", Animal.Type.CAT, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);
        HashMap<Animal.Type, Integer> response = new HashMap<>();
        int k = 70;
        int l = 80;
        response.put(Animal.Type.CAT, 0);
        response.put(Animal.Type.DOG, 0);
        response.put(Animal.Type.BIRD, 0);
        response.put(Animal.Type.FISH, 0);
        response.put(Animal.Type.SPIDER, 0);
        Assertions.assertThat(weightFromkTol.weightFromkTol(list, k, l)).isEqualTo(response);
    }
}
