package edu.hw4;

import java.util.ArrayList;
import java.util.List;

public class BytesAnd100 {
    final static int HUNDRED = 100;

    public ArrayList<Animal> bytesAnd100(List<Animal> list) {
        ArrayList<Animal> answer = new ArrayList<Animal>();
        for (Animal animal : list) {
            if (animal.bites && animal.height > HUNDRED) {
                answer.add(animal);
            }
        }
        return answer;
    }
}
