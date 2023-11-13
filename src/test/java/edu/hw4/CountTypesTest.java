package edu.hw4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CountTypesTest {
    @Test
    void countTypes() {
        CountTypes countTypes = new CountTypes();
        Animal A = new Animal("A", Animal.Type.CAT, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);

        HashMap<Animal.Type, Integer> response = new HashMap<Animal.Type, Integer>();
        response.put(Animal.Type.CAT, 2);
        response.put(Animal.Type.DOG, 1);
        Assertions.assertThat(countTypes.countTypes(list)).isEqualTo(response);

    }

    @Test
    @DisplayName("Пустой список")
    void countTypes2() {
        CountTypes countTypes = new CountTypes();
        Animal A = new Animal("A", Animal.Type.CAT, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list = new ArrayList<>();
        HashMap<Animal.Type, Integer> response = new HashMap<Animal.Type, Integer>();
        Assertions.assertThat(countTypes.countTypes(list)).isEqualTo(response);

    }
}
