package edu.hw4;

import java.util.HashMap;
import java.util.List;

public class CountTypes {
    HashMap<Animal.Type, Integer> countTypes(List<Animal> list) {
        HashMap<Animal.Type, Integer> counter = new HashMap<>();
        for (Animal animal : list) {
            if (counter.get(animal.type) != null) {
                counter.put(animal.type, counter.get(animal.type) + 1);
            } else {
                counter.put(animal.type, 1);
            }
        }
        return counter;
    }
}
