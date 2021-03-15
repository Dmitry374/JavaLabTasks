package lab29;

import utils.Utils;

import java.util.Objects;

public class Triangle implements Shape {

    private final int a;
    private final int b;
    private final int c;

    public Triangle(int a, int b, int c) throws Exception {
        this.a = a;
        this.b = b;
        this.c = c;

        if (!isTriangle()) {
            throw new Exception("Cant create triangle with sides a = " + a + " b = " + b + " c = " + c);
        }
    }

    private boolean isTriangle() {
        boolean isTriangle = true;

        if (a >= b + c) {
            isTriangle = false;
        }

        if (b >= a + c) {
            isTriangle = false;
        }

        if (c >= a + b) {
            isTriangle = false;
        }

        return isTriangle;
    }

    @Override
    public double getArea() {
        double p = Utils.round((a + b + c) / 2.0);
        return Utils.round(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    @Override
    public String toString() {
        return "Треугольник a = " + a + ", b = " + b + ", c = " + c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return a == triangle.a &&
                b == triangle.b &&
                c == triangle.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}
