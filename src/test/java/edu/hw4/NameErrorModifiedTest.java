package edu.hw4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class NameErrorModifiedTest {

    @Test
    void check() {
        NameErrorModified nameErrorModified = new NameErrorModified();
        Animal A = new Animal("A", Animal.Type.CAT, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);
        list.sort(new Weight());
        HashMap<String, String> response = new HashMap<>();
        response.put("A", "");
        response.put("B", "");
        response.put("C", "");
        Assertions.assertThat(NameErrorModified.check(list)).isEqualTo(response);
    }

    @Test
    void check2() {
        NameErrorModified nameErrorModified = new NameErrorModified();
        Animal A = new Animal("A", Animal.Type.CAT, Animal.Sex.M, -12, 132, 50, true);
        Animal B = new Animal("B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.M, 4, -100, 30, true);
        List<Animal> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);
        list.sort(new Weight());
        HashMap<String, String> response = new HashMap<>();
        response.put("A", "NegativeNumber");
        response.put("B", "");
        response.put("C", "NegativeNumber");
        Assertions.assertThat(NameErrorModified.check(list)).isEqualTo(response);
    }
}
