package by.epam.training.kimbar.model.entity;

import by.epam.training.kimbar.model.entity.Point;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PointTest {
    Point p;

    @Before
    public void init(){
        p = new Point();
    }

    @Test
    public void creationTest1(){
        double expected = 5.3;
        p = new Point(5.3);
        assertEquals(expected,p.getValue(),0);
    }
    @Test
    public void creationTest2(){
        double expected = 6.1;
        p = new Point(6.1);
        assertEquals(expected,p.getValue(),0);
    }
    @Test
    public void getPointTest1(){
        double expected = 5.8;
        p.setValue(5.8);
        assertEquals(expected,p.getValue(),0);
    }
    @Test
    public void getPointTest2(){
        double expected = 6.3;
        p.setValue(6.3);
        assertEquals(expected,p.getValue(),0);
    }

}
