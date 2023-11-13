package edu.hw4;

import java.util.Comparator;
import java.util.List;

public class KOld implements Comparator<Animal> {
    @Override
    public int compare(Animal animal1, Animal animal2) {
        return -animal1.age + animal2.age;
    }

    public Animal kold(List<Animal> list, int k) {
        if (k > list.size()) {
            throw new IllegalArgumentException();
        }
        list.sort(new KOld());
        return list.get(k - 1);
    }
}
