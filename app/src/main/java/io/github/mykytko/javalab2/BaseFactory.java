package io.github.mykytko.javalab2;

import java.util.ArrayList;

import io.github.mykytko.javalab2.circle.Circle;
import io.github.mykytko.javalab2.triangle.Triangle;

public interface BaseFactory {
    public Circle createCircle(Point center, float radius);
    public Triangle createTriangle(ArrayList <Point> vertices) throws InvalidFactoryColorException;
}
