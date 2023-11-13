package edu.hw4;

import java.util.List;

public class DogHigherk {
    public Boolean dogHigherk(List<Animal> list, int k) {
        for (Animal animal : list) {
            if (animal.type.equals(Animal.Type.DOG) && animal.height > k) {
                return true;
            }
        }
        return false;
    }
}
