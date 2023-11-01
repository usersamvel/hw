package edu.hw4;

import java.util.HashMap;
import java.util.List;

public class NameErrorModified {
    HashMap<String, String> check(List<Animal> list) {
        HashMap<String, String> answer = new HashMap<>();
        for (Animal animal : list) {
            String errors = "";
            if (animal.name.equals(null) || animal.type.equals(null) || animal.sex.equals(null)) {
                errors += "nullField";
            }
            if (animal.age < 0 || animal.weight < 0 || animal.height < 0) {
                if (errors.equals("")) {
                    errors = "NegativeNumber";
                } else {
                    errors += " and NegativeNumber";
                }
            }
            answer.put(animal.name, errors);
        }
        return answer;
    }
}
