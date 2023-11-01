package edu.hw4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class LongestNameTest {

    @Test
    void longestName() {
        LongestName longestName = new LongestName();
        Animal A = new Animal("Aaron", Animal.Type.CAT, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("Bob", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("Chris", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);
        Animal response = A;
        Assertions.assertThat(longestName.longestName(list)).isEqualTo(response);
    }

    @Test
    @DisplayName("Пустой список")
    void longestName2() {
        LongestName longestName = new LongestName();
        Animal A = new Animal("Aaron", Animal.Type.CAT, Animal.Sex.M, 12, 132, 50, true);
        Animal B = new Animal("Bob", Animal.Type.CAT, Animal.Sex.M, 20, 190, 70, true);
        Animal C = new Animal("Chris", Animal.Type.DOG, Animal.Sex.F, 4, 100, 30, true);
        List<Animal> list = new ArrayList<>();
        Animal response = null;
        Assertions.assertThat(longestName.longestName(list)).isEqualTo(response);
    }
}
