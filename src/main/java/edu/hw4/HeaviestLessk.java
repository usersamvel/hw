package edu.hw4;

import java.util.List;
import java.util.Optional;

public class HeaviestLessk {
    public Optional<Animal> heaviestLessk(List<Animal> list, int k) {
        list.sort(new Weight());
        for (Animal animal : list) {
            if (animal.height < k) {
                return Optional.of(animal);
            }
        }
        return Optional.empty();
    }
}
