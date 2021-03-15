/*
 * Создать 10 случайных фигур Circle, Triangle, Rectangle со случайными параметрами – радиусом,
 * длиной стороны.
 * Все классы фигур имплементируют интерфейс Shape с одним методом getArea():double,
 * возвращающим площадь фигуры.
 * Найти фигуру с максимальной площадью, вывести информацию о ней: тип фигуры,
 * параметры фигуры.
 */

package lab29;

import java.util.List;

public class Lab29 {

    private static final int SHAPES_COUNT_LIST = 10;

    public static void main(String[] args) {

        ShapeProcess shapeProcess = new ShapeProcess();
        List<Shape> shapes = shapeProcess.getShapesList(SHAPES_COUNT_LIST);

        String shapesPrintFormat = "%-35s     %s \n";

        for (Shape shape : shapes) {
            System.out.format(shapesPrintFormat, shape, shape.getArea());
        }

        System.out.println("\nРезультат:");

        Shape shapeWithMaxArea = shapeProcess.getShapeWithMaxArea(shapes);

        System.out.println(shapeWithMaxArea + "   S = " + shapeWithMaxArea.getArea());

    }
}
