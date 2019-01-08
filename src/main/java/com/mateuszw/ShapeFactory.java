package com.mateuszw;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<ShapeType, Shape> shapes = new HashMap<ShapeType, Shape>();

    public Shape getShape(ShapeType shapeType) {
        return shapes.get(shapeType);
    }

    static {
        shapes.put(ShapeType.CIRCLE, new Circle());
        shapes.put(ShapeType.RECTANGLE, new Rectangle());
        shapes.put(ShapeType.SQUARE, new Square());
    }
}
