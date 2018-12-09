package by.epam.training.kimbar.model.entity;

import by.epam.training.kimbar.model.entity.Point;
import by.epam.training.kimbar.model.entity.Triangle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
    Triangle triangle;

    @Before
    public void init() {
        triangle = new Triangle();
    }

    @Test
    public void creationTriangleTest1() {
        double expected = 1.0;
        triangle = new Triangle(new Point(1.0), new Point(4.0), new Point(5.0));
        assertEquals(expected, triangle.getA().getValue(), 0);
    }

    @Test
    public void creationTriangleTest2() {
        double expected = 4.0;
        triangle = new Triangle(new Point(1.0), new Point(4.0), new Point(5.0));
        assertEquals(expected, triangle.getB().getValue(), 0);
    }

    @Test
    public void creationTriangleTest3() {
        double expected = 5.0;
        triangle = new Triangle(new Point(1.0), new Point(4.0), new Point(5.0));
        assertEquals(expected, triangle.getC().getValue(), 0);
    }

    @Test
    public void testSetA1() {
        double exp = 3.0;
        triangle.setA(new Point(3.0));
        assertEquals(exp, triangle.getA().getValue(), 0);
    }

    @Test
    public void testSetA2() {
        double exp = 0.0;
        triangle.setA(new Point(-2.0));
        assertEquals(exp, triangle.getA().getValue(), 0);
    }

    @Test
    public void testSetB1() {
        double exp = 5.0;
        triangle.setA(new Point(5.0));
        assertEquals(exp, triangle.getA().getValue(), 0);
    }

    @Test
    public void testSetB2() {
        double exp = 0.0;
        triangle.setA(new Point(-17.0));
        assertEquals(exp, triangle.getA().getValue(), 0);
    }

    @Test
    public void testSetC1() {
        double exp = 6.0;
        triangle.setA(new Point(6.0));
        assertEquals(exp, triangle.getA().getValue(), 0);
    }

    @Test
    public void testSetC2() {
        double exp = 0.0;
        triangle.setA(new Point(-3.0));
        assertEquals(exp, triangle.getA().getValue(), 0);
    }

    @Test
    public void equalsTest1() {
        boolean checker1 = true;
        Triangle triangle1 = new Triangle();
        triangle.setA(new Point(1.0));
        triangle1.setA(new Point(1.0));
        boolean checker2 = triangle.equals(triangle1);
        assertEquals(checker1, checker2);
    }

    @Test
    public void equalsTest2() {
        boolean checker1 = false;
        Triangle triangle1 = new Triangle();
        triangle.setA(new Point(2.0));
        triangle1.setA(new Point(1.0));
        boolean checker2 = triangle.equals(triangle1);
        assertEquals(checker1, checker2);
    }

    @Test
    public void equalsTest3() {
        boolean checker1 = true;
        Triangle triangle1 = new Triangle();
        triangle.setB(new Point(1.0));
        triangle1.setB(new Point(1.0));
        boolean checker2 = triangle.equals(triangle1);
        assertEquals(checker1, checker2);
    }

    @Test
    public void equalsTest4() {
        boolean checker1 = false;
        Triangle triangle1 = new Triangle();
        triangle.setB(new Point(5.0));
        triangle1.setB(new Point(1.0));
        boolean checker2 = triangle.equals(triangle1);
        assertEquals(checker1, checker2);
    }

    @Test
    public void equalsTest5() {
        boolean checker1 = true;
        Triangle triangle1 = new Triangle();
        triangle.setC(new Point(1.0));
        triangle1.setC(new Point(1.0));
        boolean checker2 = triangle.equals(triangle1);
        assertEquals(checker1,checker2);
    }

    @Test
    public void equalsTest6() {
        boolean checker1 = false;
        Triangle triangle1 = new Triangle();
        triangle.setA(new Point(5.0));
        triangle1.setA(new Point(4.0));
        boolean checker2 = triangle.equals(triangle1);
        assertEquals(checker1,checker2);
    }
}
