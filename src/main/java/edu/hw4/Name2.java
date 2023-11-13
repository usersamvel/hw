package edu.hw4;

import java.util.ArrayList;
import java.util.List;

public class Name2 {
    public ArrayList<Animal> name2(List<Animal> list) {
        ArrayList<Animal> answer = new ArrayList<>();
        for (Animal animal : list) {
            int count = 0;
            for (char ch : animal.name.toCharArray()) {

                if (ch == ' ') {
                    ++count;
                }
                if (count >= 2) {
                    answer.add(animal);
                    break;
                }
            }
        }
        return answer;
    }
}
