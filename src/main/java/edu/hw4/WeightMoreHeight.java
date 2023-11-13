package edu.hw4;

import java.util.List;

public class WeightMoreHeight {
    public int weightMoreHeight(List<Animal> list) {
        int answer = 0;
        for (Animal animal : list) {
            if (animal.weight > animal.height) {
                ++answer;
            }
        }
        return answer;
    }
}
