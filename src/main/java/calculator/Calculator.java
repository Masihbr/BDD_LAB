package calculator;

import static java.lang.Math.sqrt;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double fract(int a, int b) { return sqrt((double) a / b); }
}