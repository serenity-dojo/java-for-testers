package com.serenitydojo.module06inheritance;

/**
 * Exercise 6.2c: A square is a special kind of rectangle.
 */
//@@ solution
public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }
}
//@@ starter
public class Square {
    // TODO: make Square extend Rectangle. Its constructor takes a single side length,
    //       and passes it to the Rectangle constructor as both the width and the height.
}
//@@ end
