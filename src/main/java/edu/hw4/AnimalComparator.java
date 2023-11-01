package edu.hw4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnimalComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal animal1, Animal animal2) {
        if (animal1.type.equals(Animal.Sex.M) && animal2.equals(Animal.Sex.F)) {
            return 1;
        } else if (animal1.type.equals(Animal.Sex.F) && animal2.equals(Animal.Sex.M)) {
            return -1;
        } else {
            return animal1.name.compareTo(animal2.name);
        }
    }

    public static List<Animal> sortAnimal(List<Animal> list) {
        List<Animal> listCAT = new ArrayList<>();
        List<Animal> listDOG = new ArrayList<>();
        List<Animal> listBIRD = new ArrayList<>();
        List<Animal> listFISH = new ArrayList<>();
        List<Animal> listSPIDER = new ArrayList<>();
        for (Animal animal : list) {
            if (animal.type.equals(Animal.Type.CAT)) {
                listCAT.add(animal);
            } else if (animal.type.equals(Animal.Type.DOG)) {
                listDOG.add(animal);
            } else if (animal.type.equals(Animal.Type.BIRD)) {
                listBIRD.add(animal);
            } else if (animal.type.equals(Animal.Type.FISH)) {
                listFISH.add(animal);
            } else if (animal.type.equals(Animal.Type.SPIDER)) {
                listSPIDER.add(animal);
            }
        }
        listCAT.sort(new AnimalComparator());
        listDOG.sort(new AnimalComparator());
        listBIRD.sort(new AnimalComparator());
        listFISH.sort(new AnimalComparator());
        listSPIDER.sort(new AnimalComparator());
        List<Animal> answer = new ArrayList<>();
        listCAT.addAll(listDOG);
        listCAT.addAll(listBIRD);
        listCAT.addAll(listFISH);
        listCAT.addAll(listSPIDER);
        return listCAT;
    }
}
