import com.mateuszw.*;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShapeFactoryTest {
    private static ShapeFactory shapeFactory;
    private static Shape shape;

    @BeforeClass
    public static void setUp() {
        shapeFactory = new ShapeFactory();
    }

    @Test
    public void shouldReturnCircle() {
        shape = shapeFactory.getShape(ShapeType.CIRCLE);
        assertTrue(shape instanceof Circle);
        assertEquals(shape.draw(), "Drawing circle");
    }

    @Test
    public void shouldReturnRectangle() {
        shape = shapeFactory.getShape(ShapeType.RECTANGLE);
        assertTrue(shape instanceof Rectangle);
        assertEquals(shape.draw(), "Drawing rectangle");
    }

    @Test
    public void shouldReturnSquare() {
        shape = shapeFactory.getShape(ShapeType.SQUARE);
        assertTrue(shape instanceof Square);
        assertEquals(shape.draw(), "Drawing square");
    }
}
