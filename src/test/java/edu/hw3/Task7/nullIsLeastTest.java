package edu.hw3.Task7;

import edu.hw3.Task7.NullIsLeast;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.TreeMap;

class nullIsLeastTest {

    @Test
    @DisplayName("Сравнение строк")
    void compare() {
        NullIsLeast nullisleast = new NullIsLeast();
        String str1 = "a";
        String str2 = "b";
        int response = nullisleast.compare(str1, str2);
        Assertions.assertThat(response).isEqualTo(-1);
    }

    @Test
    @DisplayName("Сравнение строк")
    void compare2() {
        NullIsLeast nullisleast = new NullIsLeast();
        String str1 = "b";
        String str2 = "a";
        int response = nullisleast.compare(str1, str2);
        Assertions.assertThat(response).isEqualTo(1);
    }

    @Test
    @DisplayName("Сравнение строки и null")
    void compare3() {
        NullIsLeast nullisleast = new NullIsLeast();
        String str1 = "a";
        String str2 = null;
        int response = nullisleast.compare(str1, str2);
        Assertions.assertThat(response).isEqualTo(1);
    }

    @Test
    @DisplayName("Сравнение строки и null")
    void compare4() {
        NullIsLeast nullisleast = new NullIsLeast();
        String str1 = null;
        String str2 = "a";
        int response = nullisleast.compare(str1, str2);
        Assertions.assertThat(response).isEqualTo(-1);
    }

    @Test
    @DisplayName("Тест из примера")
    void compare5() {
        NullIsLeast nullisleast = new NullIsLeast();
        TreeMap<String, String> tree = new TreeMap<>(new NullIsLeast());
        tree.put(null, "test");
        boolean response = tree.containsKey(null);
        Assertions.assertThat(response).isEqualTo(true);
    }
}
