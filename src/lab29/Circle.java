package lab29;

import utils.Utils;

import java.util.Objects;

public class Circle implements Shape {

    private final int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Utils.round(Math.PI * Math.pow(r, 2));
    }

    @Override
    public String toString() {
        return "Круг r = " + r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return r == circle.r;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }
}