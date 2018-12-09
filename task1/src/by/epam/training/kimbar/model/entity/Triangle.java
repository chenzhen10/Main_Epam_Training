package by.epam.training.kimbar.model.entity;

import java.util.Objects;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle() {
    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        if(a.getValue() < 0){
            a.setValue(0);
        }
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        if(b.getValue() < 0){
            b.setValue(0);
        }
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        if(c.getValue() < 0){
            c.setValue(0);
        }
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(a, triangle.a) &&
                Objects.equals(b, triangle.b) &&
                Objects.equals(c, triangle.c);
    }

    @Override
    public int hashCode() {

        return Objects.hash(a, b, c);
    }
}
