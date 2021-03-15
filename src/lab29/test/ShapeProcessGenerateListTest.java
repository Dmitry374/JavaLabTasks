package lab29.test;

import lab29.Shape;
import lab29.ShapeProcess;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ShapeProcessGenerateListTest {

    private static final int SHAPES_COUNT_LIST = 10;

    private final ShapeProcess shapeProcess = new ShapeProcess();
    private final List<Shape> shapes = shapeProcess.getShapesList(SHAPES_COUNT_LIST);

    @Test
    public void getShapesList_generateCorrectListSize() {
        Assert.assertEquals(SHAPES_COUNT_LIST, shapes.size());
    }

    @Test
    public void getShapesList_generateCorrectList() {
        Assert.assertFalse(shapes.contains(null));
    }
}