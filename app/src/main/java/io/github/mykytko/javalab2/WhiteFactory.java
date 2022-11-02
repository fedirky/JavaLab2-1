package io.github.mykytko.javalab2;

import java.util.ArrayList;

import io.github.mykytko.javalab2.circle.WhiteCircle;
import io.github.mykytko.javalab2.triangle.WhiteTriangle;

public class WhiteFactory implements BaseFactory {
    @Override
    public Circle createCircle(Point center, float radius) {
      return new WhiteCircle(center, radius);
    }

    @Override
    public Triangle createTriangle(ArrayList <Point> vertices) throws InvalidFactoryColorException {
      return new WhiteTriangle(vertices);
    }
}
