package edu.hw2;

import edu.hw2.Task1.Expr.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ExprTest {

    @Test
    @DisplayName("Тест из примера")
    void evaluateExample() {
        var two = new Constant(2);
        var four = new Constant(4);
        var negOne = new Negate(new Constant(1));
        var sumTwoFour = new Addition(two, four);
        var mult = new Multiplication(sumTwoFour, negOne);
        var exp = new Exponent(mult, 2);
        var res = new Addition(exp, new Constant(1));
        double response = res.evaluate();
        org.assertj.core.api.Assertions.assertThat(response).isEqualTo(37);
    }

    @Test
    @DisplayName("Ввод Constant и double в Addition")
    void evaluateAddition() {
        var two = new Constant(2);
        var sumTwoFour = new Addition(4, two);
        double response = sumTwoFour.evaluate();
        org.assertj.core.api.Assertions.assertThat(response).isEqualTo(6);
    }

    @Test
    @DisplayName("Ввод Constant и double в Multiplication")
    void evaluateMultiplication() {
        var two = new Constant(2);
        var multTwoFour = new Multiplication(4, two);
        double response = multTwoFour.evaluate();
        org.assertj.core.api.Assertions.assertThat(response).isEqualTo(8);
    }

    @Test
    @DisplayName("Отрицательное основание")
    void negativeBase() {
        Assertions.assertThatThrownBy(() -> new Exponent(-2, 3.5)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("Отрицательное основание")
    void negativeBase2() {
        var negTwo = new Constant(-2);
        Assertions.assertThatThrownBy(() -> new Exponent(negTwo, 0.1)).isInstanceOf(IllegalArgumentException.class);
    }

}
