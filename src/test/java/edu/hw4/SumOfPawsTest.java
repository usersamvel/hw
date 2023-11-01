package edu.hw4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SumOfPawsTest {

    @Test
    void sumOfPaws() {
        SumOfPaws sumOfPaws = new SumOfPaws();
        Animal A = new Animal("A", Animal.Type.CAT, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);
        int response = 12;
        Assertions.assertThat(sumOfPaws.sumOfPaws(list)).isEqualTo(response);
    }

    @Test
    @DisplayName("Пустой список")
    void sumOfPaws2() {
        SumOfPaws sumOfPaws = new SumOfPaws();
        Animal A = new Animal("A", Animal.Type.CAT, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("B", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("C", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list = new ArrayList<>();
        int response = 0;
        Assertions.assertThat(sumOfPaws.sumOfPaws(list)).isEqualTo(response);
    }
}
