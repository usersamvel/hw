package edu.hw2.Task2;

public class Rectangle {
    private int width;
    private int height;

    static final String ERROR = "отрицательное число";

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException(ERROR);
        }
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException(ERROR);
        }
    }

    public double area() {
        return width * height;
    }

    int getWidth(Rectangle rectangle) {
        return rectangle.width;
    }

    int getHeight(Rectangle rectangle) {
        return rectangle.height;
    }
}

