package io.github.mykytko.javalab2;

import java.util.ArrayList;

import io.github.mykytko.javalab2.circle.Circle;
import io.github.mykytko.javalab2.triangle.Triangle;

public class BlackFactory implements BaseFactory {
    @Override
    public Circle createCircle(Point center, float radius) {
      return new BlackCircle(center, radius);
    }

    @Override
    public Triangle createTriangle(ArrayList <Point> vertices) throws InvalidFactoryColorException {
      return new BlackTriangle(vertices);
    }
}
