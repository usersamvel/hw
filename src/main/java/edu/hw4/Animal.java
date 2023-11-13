package edu.hw4;

public class Animal {
    public enum Type {
        CAT, DOG, BIRD, FISH, SPIDER
    }

    public enum Sex {
        M, F
    }

    String name;
    Type type;
    Sex sex;
    int age;
    public int height;
    int weight;
    boolean bites;

    public Animal(String name, Type type, Sex sex, int age, int height, int weight, boolean bites) {
        this.name = name;
        this.type = type;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.bites = bites;
    }

    final static int FOUR = 4;
    final static int EIGHT = 8;

    public int paws() {
        return switch (type) {
            case CAT, DOG -> FOUR;
            case BIRD -> 2;
            case FISH -> 0;
            case SPIDER -> EIGHT;
        };
    }
}
