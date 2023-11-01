package edu.hw4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BytesAnd100Test {

    @Test
    void bytesAnd100() {
        BytesAnd100 bytesAnd100 = new BytesAnd100();
        Animal A = new Animal("A", Animal.Type.CAT, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);
        List<Animal> response = new ArrayList<>();
        response.add(A);
        response.add(B);
        Assertions.assertThat(bytesAnd100.bytesAnd100(list)).isEqualTo(response);
    }

    @Test
    @DisplayName("Пустой список")
    void bytesAnd1002() {
        BytesAnd100 bytesAnd100 = new BytesAnd100();
        Animal A = new Animal("A", Animal.Type.CAT, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list = new ArrayList<>();
        List<Animal> response = new ArrayList<>();
        Assertions.assertThat(bytesAnd100.bytesAnd100(list)).isEqualTo(response);
    }
}
