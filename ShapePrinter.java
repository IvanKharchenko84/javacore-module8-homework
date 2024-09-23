package javacore.module8.homework;

class ShapePrinter implements Printer<Shape> {

    @Override
    public void print(Shape shape) {
        System.out.println("Shape: " + shape.printShapeName() + " is printed...!");
    }
}
