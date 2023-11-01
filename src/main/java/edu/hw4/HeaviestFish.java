package edu.hw4;

import java.util.List;

public class HeaviestFish {
    Animal heaviestFish(List<List<Animal>> lists) {
        int maxWeight = 0;
        Animal answer = null;
        for (List<Animal> list : lists) {
            for (Animal animal : list) {
                if (animal.type.equals(Animal.Type.FISH) && animal.weight > maxWeight) {
                    maxWeight = animal.weight;
                    answer = animal;
                }
            }
        }
        return answer;
    }
}
