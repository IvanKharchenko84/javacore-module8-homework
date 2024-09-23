package javacore.module8.homework;

import javacore.module8.homework.figures.*;

public class Main {
    public static void main(String[] args) {
        Printer<Shape> printer = new ShapePrinter();
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape trapeze = new Trapeze();
        Shape[] shapes = {circle, quad, rectangle, triangle, trapeze};
        for (Shape shape : shapes) {
            printer.print(shape);
        }
    }
}
