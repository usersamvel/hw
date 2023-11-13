package edu.hw4;

import java.util.ArrayList;
import java.util.List;

public class AgeNotEqualToPaws {
    public ArrayList<Animal> ageNotEqualToPaws(List<Animal> list) {
        ArrayList<Animal> answer = new ArrayList<>();
        for (Animal animal : list) {
            if (animal.age != animal.paws()) {
                answer.add(animal);
            }
        }
        return answer;
    }
}
