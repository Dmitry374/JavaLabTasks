package lab29;

import java.util.Objects;

public class Rectangle implements Shape {

    private final int a;
    private final int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Прямоугольник a = " + a + ", b = " + b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return a == rectangle.a &&
                b == rectangle.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
