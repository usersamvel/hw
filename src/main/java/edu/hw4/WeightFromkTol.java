package edu.hw4;

import java.util.HashMap;
import java.util.List;

public class WeightFromkTol {
    HashMap<Animal.Type, Integer> weightFromkTol(List<Animal> list, int k, int l) {
        HashMap<Animal.Type, Integer> answer = new HashMap<>();
        int weightCAT = 0;
        int weightDOG = 0;
        int weightBIRD = 0;
        int weightFISH = 0;
        int weightSPIDER = 0;
        for (Animal animal : list) {
            if (animal.age >= k && animal.age <= l) {
                if (animal.type.equals(Animal.Type.CAT)) {
                    weightCAT += animal.weight;
                } else if (animal.type.equals(Animal.Type.DOG)) {
                    weightDOG += animal.weight;
                } else if (animal.type.equals(Animal.Type.BIRD)) {
                    weightBIRD += animal.weight;
                } else if (animal.type.equals(Animal.Type.FISH)) {
                    weightFISH += animal.weight;
                } else if (animal.type.equals(Animal.Type.SPIDER)) {
                    weightSPIDER += animal.weight;
                }
            }
        }
        answer.put(Animal.Type.CAT, weightCAT);
        answer.put(Animal.Type.DOG, weightDOG);
        answer.put(Animal.Type.BIRD, weightBIRD);
        answer.put(Animal.Type.FISH, weightFISH);
        answer.put(Animal.Type.SPIDER, weightSPIDER);
        return answer;
    }
}
