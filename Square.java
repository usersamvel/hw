package edu.hw2.Task2;

public class Square extends Rectangle {

    @Override public void setWidth(int width) {
        if (getHeight(this) == 0) {
            super.setHeight(width);
            super.setWidth(width);
        } else {
            super.setWidth(width);
        }
    }

    @Override public void setHeight(int height) {
        if (getWidth(this) == 0) {
            super.setHeight(height);
            super.setWidth(height);
        } else {
            super.setHeight(height);
        }
    }
}
