package com.ans4;

public class Area extends Shape{
    @Override
    int rectangleArea(int length, int breadth) {
        System.out.println("Area of Rectangle is: "+length*breadth);
        return length*breadth;
    }

    @Override
    int squareArea(int side) {
        System.out.println("Area of Square is: "+side*side);
        return side*side;
    }

    @Override
    int circleArea(int radius) {
        System.out.println("Area of Circle is: "+(int)(3.14*(radius^2)));
        return (int)(3.14*3.14*radius);
    }
}
