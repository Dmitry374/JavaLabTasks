package lab29;

import utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class ShapeProcess {

    public List<Shape> getShapesList(int n) {
        List<Shape> shapes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int shapeType = Utils.getRandomNumberInRange(0, 3);
            Shape shape = getShape(shapeType);

            shapes.add(shape);
        }

        return shapes;
    }

    private Shape getShape(int shapeType) {
        Shape shape = null;

        int r;
        int a;
        int b;
        int c;

        switch (shapeType) {
            case 0:
                r = Utils.getRandomNumberInRange(1, 18);
                shape = new Circle(r);
                break;
            case 1:
                a = Utils.getRandomNumberInRange(1, 25);
                b = Utils.getRandomNumberInRange(1, 25);
                c = Utils.getRandomNumberInRange(1, 25);
                try {
                    shape = new Triangle(a, b, c);
                } catch (Exception e) {
                    shape = null;
                }
                break;
            case 2:
                a = Utils.getRandomNumberInRange(1, 25);
                b = Utils.getRandomNumberInRange(1, 25);
                shape = new Rectangle(a, b);
                break;
        }

        if (shape == null) {
            return getShape(shapeType);
        }

        return shape;
    }

    public Shape getShapeWithMaxArea(List<Shape> shapes) {

        if (shapes == null) {
            System.out.println("Shapes list is null");
            return null;
        }

        if (shapes.isEmpty()) {
            System.out.println("Shapes list is empty");
            return null;
        }

        double maxArea = 0;
        int indexMaxShapeArea = 0;

        for (int i = 0; i < shapes.size(); i++) {
            if (maxArea < shapes.get(i).getArea()) {
                maxArea = shapes.get(i).getArea();
                indexMaxShapeArea = i;
            }
        }

        return shapes.get(indexMaxShapeArea);
    }
}
