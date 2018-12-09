package by.epam.training.kimbar.model.logic;

import by.epam.training.kimbar.model.entity.Point;
import by.epam.training.kimbar.model.entity.Triangle;
import by.epam.training.kimbar.model.logic.TriangleLogic;

import static org.junit.Assert.*;

import by.epam.training.kimbar.view.LoggerPrinter;
import by.epam.training.kimbar.view.Printer;
import org.junit.Before;
import org.junit.Test;

public class TriangleLogicTest {
    TriangleLogic tr;
    Triangle trig;


    @Before
    public void init() {
        tr = new TriangleLogic();
        trig = new Triangle();
    }


    @Test
    public void getSquareOfTriangleTest() {
        int expected = 12;
        trig.setA(new Point(5.0));
        trig.setB(new Point(5.0));
        trig.setC(new Point(6.0));
        assertEquals(expected, tr.getSquareOfTriangle(trig), 0);
    }

    @Test
    public void getPerimeterOfTriangleTest() {
        int exp = 16;
        trig.setA(new Point(5.0));
        trig.setB(new Point(5.0));
        trig.setC(new Point(6.0));
        assertEquals(exp, tr.getPerimeterOfTriangle(trig), 0);
    }

    @Test
    public void isTriangleTest1() {
        boolean isTriangle = true;
        trig.setA(new Point(7.0));
        trig.setB(new Point(5.0));
        trig.setC(new Point(6.0));
        assertEquals(isTriangle, tr.isTriangle(trig));
    }

    @Test
    public void isTriangleTest2() {
        boolean isTriangle = false;
        trig.setA(new Point(5.0));
        trig.setB(new Point(5.0));
        trig.setC(new Point(5.0));
        assertEquals(isTriangle, tr.isTriangle(trig));
    }

    @Test
    public void isRectangularTest1() {
        boolean isRectangular = true;
        trig.setA(new Point(6.0));
        trig.setB(new Point(8.0));
        trig.setC(new Point(10.0));
        assertEquals(isRectangular, tr.isRectangular(trig));
    }

    @Test
    public void isRectangularTest2() {
        boolean isRectangular = false;
        trig.setA(new Point(3.0));
        trig.setB(new Point(4.0));
        trig.setC(new Point(7.0));
        assertEquals(isRectangular, tr.isRectangular(trig));
    }

    @Test
    public void isIsoscelesTest1() {
        boolean isIsosceles = true;
        trig.setA(new Point(5.0));
        trig.setB(new Point(5.0));
        trig.setC(new Point(7.0));
        assertEquals(isIsosceles, tr.isIsosceles(trig));
    }

    @Test
    public void isIsoscelesTest2() {
        boolean isIsosceles = false;
        trig.setA(new Point(8.0));
        trig.setB(new Point(5.0));
        trig.setC(new Point(7.0));
        assertEquals(isIsosceles, tr.isIsosceles(trig));
    }

    @Test
    public void isEquilateralTest1() {
        boolean isEquilateral = true;
        trig.setA(new Point(7.0));
        trig.setB(new Point(7.0));
        trig.setC(new Point(7.0));
        assertEquals(isEquilateral, tr.isEquilateral(trig));
    }

    @Test
    public void isEquilateralTest2() {
        boolean isEquilateral = false;
        trig.setA(new Point(8.0));
        trig.setB(new Point(5.0));
        trig.setC(new Point(7.0));
        assertEquals(isEquilateral, tr.isEquilateral(trig));
    }

    @Test
    public void isAcuteAngledTest1() {
        boolean isAcuteAngled = true;
        trig.setA(new Point(5.0));
        trig.setB(new Point(4.0));
        trig.setC(new Point(4.0));
        assertEquals(isAcuteAngled, tr.isAcuteAngled(trig));
    }

    @Test
    public void isAcuteAngledTest2() {
        boolean isAcuteAngled = false;
        trig.setA(new Point(8.0));
        trig.setB(new Point(3.0));
        trig.setC(new Point(4.0));
        assertEquals(isAcuteAngled, tr.isAcuteAngled(trig));
    }

    @Test
    public void isObtuseTest1() {
        boolean isObtuse = true;
        trig.setA(new Point(23.0));
        trig.setB(new Point(5.0));
        trig.setC(new Point(6.0));
        assertEquals(isObtuse, tr.isObtuse(trig));
    }

    @Test
    public void isObtuseTest2() {
        boolean isObtuse = false;
        trig.setA(new Point(4.0));
        trig.setB(new Point(4.0));
        trig.setC(new Point(4.0));
        assertEquals(isObtuse, tr.isObtuse(trig));
    }

    @Test
    public void hasNinetyDegreesTest1() {
        boolean hasNinetyDegrees = true;
        trig.setA(new Point(3.0));
        trig.setB(new Point(4.0));
        trig.setC(new Point(5.0));
        assertEquals(hasNinetyDegrees, tr.hasNinetyDegrees(trig));
    }

    @Test
    public void hasNinetyDegreesTest2() {
        boolean hasNinetyDegrees = false;
        trig.setA(new Point(4.0));
        trig.setB(new Point(4.0));
        trig.setC(new Point(4.0));
        assertEquals(hasNinetyDegrees, tr.hasNinetyDegrees(trig));
    }


}
