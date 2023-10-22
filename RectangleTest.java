package edu.hw2;

import edu.hw2.Task2.Rectangle;
import edu.hw2.Task2.Square;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    @DisplayName("Отрицательная ширина у Rectangle")
    void setWidthRectangle() {
        Rectangle rectangle = new Rectangle();
        Assertions.assertThatThrownBy(() -> rectangle.setWidth(-20)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("Отрицательная ширина у Square")
    void setWidthSquare() {
        Square rectangle = new Square();
        Assertions.assertThatThrownBy(() -> rectangle.setWidth(-20)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("Отрицательная длина у Rectangle")
    void setHeightRectangle() {
        Rectangle rectangle = new Rectangle();
        Assertions.assertThatThrownBy(() -> rectangle.setHeight(-20)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("Отрицательная ширина у Square")
    void setHeightSquare() {
        Rectangle rectangle = new Rectangle();
        Assertions.assertThatThrownBy(() -> rectangle.setHeight(-20)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("Площадь у Rectangle")
    void areaRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(20);
        double response = rectangle.area();
        Assertions.assertThat(response).isEqualTo(200);
    }

    @Test
    @DisplayName("Площадь у Square")
    void areaSquare() {
        Square rectangle = new Square();
        rectangle.setHeight(10);
        rectangle.setWidth(20);
        double response = rectangle.area();
        Assertions.assertThat(response).isEqualTo(200);
    }
}
