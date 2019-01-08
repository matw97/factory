package com.mateuszw;

import java.util.EnumMap;

public class ShapeFactory {
    private static final EnumMap<ShapeType, Shape> shapes = new EnumMap<>(ShapeType.class);

    public Shape getShape(ShapeType shapeType) {
        return shapes.get(shapeType);
    }

    static {
        shapes.put(ShapeType.CIRCLE, new Circle());
        shapes.put(ShapeType.RECTANGLE, new Rectangle());
        shapes.put(ShapeType.SQUARE, new Square());
    }
}
