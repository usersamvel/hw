package edu.hw4;

import java.util.List;

public class SpiderDog {
    public Boolean spiderDog(List<Animal> list) {
        int bytesSpider = 0;
        int bytesDog = 0;
        for (Animal animal : list) {
            if (animal.type.equals(Animal.Type.SPIDER) && animal.bites) {
                ++bytesSpider;
            }
            if (animal.type.equals(Animal.Type.DOG) && animal.bites) {
                ++bytesDog;
            }
        }
        return (bytesSpider > bytesDog);
    }
}
