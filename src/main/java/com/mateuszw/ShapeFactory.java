package com.mateuszw;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        switch (shapeType) {
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            case "circle":
                return new Circle();
            default:
                return null;
        }
    }
}
