package edu.hw4;

import java.util.HashMap;
import java.util.List;

public class NameErrors {

    public HashMap<String, ValidationError> check(List<Animal> list) {
        ValidationError validationError = new ValidationError();
        HashMap<String, ValidationError> answer = new HashMap<>();
        for (Animal animal : list) {
            if (animal.name.equals(null) || animal.type.equals(null) || animal.sex.equals(null)) {
                validationError.nullField = true;
            } else {
                validationError.nullField = false;
            }
            if (animal.age < 0 || animal.weight < 0 || animal.height < 0) {
                validationError.negativeNumber = true;
            } else {
                validationError.negativeNumber = false;
            }
            answer.put(animal.name, validationError);
        }
        return answer;
    }

    public static ValidationError checkAnimal(Animal animal) {
        ValidationError validationError = new ValidationError();
        HashMap<String, ValidationError> answer = new HashMap<>();

        if (animal.name.equals(null) || animal.type.equals(null) || animal.sex.equals(null)) {
            validationError.nullField = true;
        } else {
            validationError.nullField = false;
        }
        if (animal.age < 0 || animal.weight < 0 || animal.height < 0) {
            validationError.negativeNumber = true;
        } else {
            validationError.negativeNumber = false;
        }
        answer.put(animal.name, validationError);

        return validationError;
    }
}
