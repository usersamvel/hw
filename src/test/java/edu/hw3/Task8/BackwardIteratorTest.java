package edu.hw3.Task8;

import edu.hw3.Task8.BackwardIterator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BackwardIteratorTest {

    @Test
    @DisplayName("Тест из примера")
    void hasNext() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        BackwardIterator<Integer> it = new BackwardIterator<>(list);
        it.next();
        it.next();
        boolean response = it.hasNext();
        Assertions.assertThat(response).isEqualTo(false);
    }

    @Test
    @DisplayName("Пустой список")
    void hasNext2() {
        List<Integer> list = new ArrayList<>();
        BackwardIterator<Integer> it = new BackwardIterator<>(list);
        boolean response = it.hasNext();
        Assertions.assertThat(response).isEqualTo(false);
    }

    @Test
    @DisplayName("Тест из примера")
    void next() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        BackwardIterator<Integer> it = new BackwardIterator<>(list);
        int response = it.next();
        Assertions.assertThat(response).isEqualTo(3);
    }

    @Test
    @DisplayName("Пустой список")
    void next2() {
        List<Integer> list = new ArrayList<>();
        BackwardIterator<Integer> it = new BackwardIterator<>(list);
        Assertions.assertThatThrownBy(it::next).isInstanceOf(IllegalArgumentException.class);
    }
}
