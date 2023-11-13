package edu.hw4;

import java.util.List;

public class MOrF {
    Animal.Sex mOrF(List<Animal> list) {
        if (list.size() == 0) {
            return null;
        }
        int countM = 0;
        int countF = 0;
        for (Animal animal : list) {
            if (animal.sex.equals(Animal.Sex.M)) {
                ++countM;
            } else {
                ++countF;
            }
        }
        if (countM > countF) {
            return Animal.Sex.M;
        } else {
            return Animal.Sex.F;
        }
    }
}
