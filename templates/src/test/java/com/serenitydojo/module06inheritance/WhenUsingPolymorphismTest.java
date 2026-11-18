package com.serenitydojo.module06inheritance;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
//@@ starter
import static org.junit.jupiter.api.Assertions.fail;
//@@ end

/**
 * Exercise 6.2: Abstract methods, abstract classes and polymorphism.
 * <p>
 * Implement the area() method of Circle and Rectangle, and create the Square class.
 */
class WhenUsingPolymorphismTest {

    @Test
    void aShapeIsAbstract() {
        assertThat(Modifier.isAbstract(Shape.class.getModifiers())).isTrue();
    }

    @Test
    void theAreaOfACircle() {
        Shape circle = new Circle(2);

        assertThat(circle.area()).isCloseTo(12.566, within(0.001));
    }

    @Test
    void theAreaOfARectangle() {
        Shape rectangle = new Rectangle(3, 4);

        assertThat(rectangle.area()).isEqualTo(12.0);
    }

    @Test
    void theAreaOfASquare() {
//@@ starter
        fail("TODO: create the Square class, then uncomment the code below");
//@@ end
//@@ starter-commented
        Shape square = new Square(5);

        assertThat(square).isInstanceOf(Rectangle.class);
        assertThat(square.area()).isEqualTo(25.0);
//@@ end
    }

    @Test
    void eachShapeDescribesItselfUsingItsOwnArea() {
        List<Shape> shapes = List.of(new Circle(1), new Rectangle(2, 3));

        assertThat(shapes.get(0).describe()).isEqualTo("Circle with an area of 3.14");
        assertThat(shapes.get(1).describe()).isEqualTo("Rectangle with an area of 6.00");
    }

    @Test
    void shapesCanBeTreatedPolymorphically() {
        List<Shape> shapes = List.of(new Rectangle(2, 3), new Rectangle(4, 5), new Circle(1));

        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }

        assertThat(totalArea).isCloseTo(29.14, within(0.01));
    }
}
