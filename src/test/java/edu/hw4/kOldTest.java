package edu.hw4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class kOldTest {

    @Test
    void kold() {
        KOld kold = new KOld();
        Animal A = new Animal("A", Animal.Type.CAT, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);
        list.sort(new Weight());
        Animal response = B;
        Assertions.assertThat(kold.kold(list, 1)).isEqualTo(response);
    }

    @Test
    @DisplayName("Некорректный ввод")
    void kold2() {
        KOld kold = new KOld();
        Animal A = new Animal("A", Animal.Type.CAT, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);
        list.sort(new Weight());
        Assertions.assertThatThrownBy(() -> kold.kold(list, 4)).isInstanceOf(IllegalArgumentException.class);
    }
}
