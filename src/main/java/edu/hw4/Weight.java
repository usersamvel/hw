package edu.hw4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Weight implements Comparator<Animal> {

    @Override
    public int compare(Animal animal1, Animal animal2) {
        return -animal1.weight + animal2.weight;
    }

    public static List<Animal> kFirst(List<Animal> list, int k) {
        list.sort(new Weight());
        List<Animal> answer = new ArrayList<>();
        int len = list.size();
        int i = 0;
        int count = 0;
        while (i < len && count < k) {
            answer.add(list.get(i));
            ++i;
            ++count;
        }
        return answer;
    }
}
