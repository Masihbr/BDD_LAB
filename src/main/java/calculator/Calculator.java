package calculator;

import static java.lang.Math.sqrt;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int fract(int a, int b) { return (int) sqrt((double) a / b); }
}