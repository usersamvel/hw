package edu.hw4;

import java.util.Comparator;

public class Height implements Comparator<Animal> {

    @Override
    public int compare(Animal animal1, Animal animal2) {
        return animal1.height - animal2.height;
    }
}
