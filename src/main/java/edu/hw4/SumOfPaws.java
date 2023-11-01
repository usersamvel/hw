package edu.hw4;

import java.util.List;

public class SumOfPaws {
    public int sumOfPaws(List<Animal> list) {
        int answer = 0;
        for (Animal animal : list) {
            answer += animal.paws();
        }
        return answer;
    }
}
