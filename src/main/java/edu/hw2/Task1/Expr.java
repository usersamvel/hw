package edu.hw2.Task1;

public sealed interface Expr
    permits Expr.Addition, Expr.Constant, Expr.Exponent, Expr.Multiplication, Expr.Negate {
    double evaluate();

    record Constant(double value) implements Expr {

        @Override
        public double evaluate() {
            return value;
        }

        public Constant(Expr expr) {
            this(expr.evaluate());
        }
    }

    record Negate(double value) implements Expr {
        @Override
        public double evaluate() {
            return -value;
        }

        public Negate(Expr expr) {
            this(expr.evaluate());
        }
    }

    record Exponent(double base, double exponent) implements Expr {

        @Override
        public double evaluate() {
            return Math.pow(base, exponent);
        }

        public Exponent(double base, double exponent) {
            if (base < 0 && (exponent % 1 != 0)) {
                throw new IllegalArgumentException("Отрицательное основание");

            } else {
                this.base = base;
                this.exponent = exponent;
            }

        }

        public Exponent(Expr expr1, Expr expr2) {

            this(expr1.evaluate(), expr2.evaluate());

        }

        public Exponent(Expr expr, double value) {
            this(expr.evaluate(), value);

        }

        public Exponent(double value, Expr expr) {
            this(value, expr.evaluate());

        }

    }

    record Addition(double summand1, double summand2) implements Expr {
        @Override
        public double evaluate() {
            return summand1 + summand2;
        }

        public Addition(Expr expr1, Expr expr2) {
            this(expr1.evaluate(), expr2.evaluate());
        }

        public Addition(Expr expr, double value) {
            this(expr.evaluate(), value);
        }

        public Addition(double value, Expr expr) {
            this(value, expr.evaluate());
        }
    }

    record Multiplication(double factor1, double factor2) implements Expr {
        @Override
        public double evaluate() {
            return factor1 * factor2;
        }

        public Multiplication(Expr expr1, Expr expr2) {
            this(expr1.evaluate(), expr2.evaluate());
        }

        public Multiplication(Expr expr, double value) {
            this(expr.evaluate(), value);
        }

        public Multiplication(double value, Expr expr) {
            this(value, expr.evaluate());
        }
    }
}
