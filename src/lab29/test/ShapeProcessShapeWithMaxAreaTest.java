package lab29.test;

import lab29.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ShapeProcessShapeWithMaxAreaTest {

    private final ShapeProcess shapeProcess = new ShapeProcess();
    private final List<Shape> shapes = new ArrayList<>();

    private final Shape shapeWithMaxAreaExpected = new Rectangle(21, 11);

    @Before
    public void setUpShapesList() {
        shapes.add(new Circle(3));
        shapes.add(new Rectangle(4, 5));
        try {
            shapes.add(new Triangle(3, 4, 5));
        } catch (Exception e) {
            e.printStackTrace();
        }
        shapes.add(new Circle(7));
        shapes.add(new Rectangle(3, 9));
        try {
            shapes.add(new Triangle(5, 7, 11));
        } catch (Exception e) {
            e.printStackTrace();
        }
        shapes.add(shapeWithMaxAreaExpected);
        shapes.add(new Circle(5));
        try {
            shapes.add(new Triangle(6, 13, 18));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getShapeWithMaxArea_correctData() {
        Shape shapeWithMaxAreaActual = shapeProcess.getShapeWithMaxArea(shapes);

        Assert.assertEquals(shapeWithMaxAreaExpected, shapeWithMaxAreaActual);
    }

    @Test
    public void getShapeWithMaxArea_ListIsNull() {
        Shape shapeWithMaxArea = shapeProcess.getShapeWithMaxArea(null);

        Assert.assertNull(shapeWithMaxArea);
    }

    @Test
    public void getShapeWithMaxArea_emptyShapesList() {
        Shape shapeWithMaxArea = shapeProcess.getShapeWithMaxArea(new ArrayList<>());

        Assert.assertNull(shapeWithMaxArea);
    }
}