package edu.hw4;

import java.util.HashMap;
import java.util.List;

public class Heaviest {
    HashMap<Animal.Type, Animal> heaviest(List<Animal> list) {
        HashMap<Animal.Type, Animal> answer = new HashMap<>();
        int weightCAT = 0;
        int weightDOG = 0;
        int weightBIRD = 0;
        int weightFISH = 0;
        int weightSPIDER = 0;
        for (Animal animal : list) {
            if (animal.type.equals(Animal.Type.CAT) && animal.weight > weightCAT) {
                answer.put(Animal.Type.CAT, animal);
                weightCAT = animal.weight;
            } else if (animal.type.equals(Animal.Type.DOG) && animal.weight > weightDOG) {
                answer.put(Animal.Type.DOG, animal);
                weightDOG = animal.weight;
            } else if (animal.type.equals(Animal.Type.BIRD) && animal.weight > weightBIRD) {
                answer.put(Animal.Type.BIRD, animal);
                weightBIRD = animal.weight;
            } else if (animal.type.equals(Animal.Type.FISH) && animal.weight > weightFISH) {
                answer.put(Animal.Type.FISH, animal);
                weightFISH = animal.weight;
            } else if (animal.type.equals(Animal.Type.SPIDER) && animal.weight > weightSPIDER) {
                answer.put(Animal.Type.SPIDER, animal);
                weightSPIDER = animal.weight;
            }
        }
        return answer;
    }
}
