package by.epam.training.kimbar.model.entity;

import java.util.Objects;

public class Point {

    private double value;


    public Point() {
    }

    public Point(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Point{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return value == point.value;
    }

    @Override
    public int hashCode() {

        return Objects.hash(value);
    }
}
