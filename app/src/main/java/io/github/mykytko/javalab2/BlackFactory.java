package io.github.mykytko.javalab2;

import java.util.ArrayList;

import io.github.mykytko.javalab2.circle.BlackCircle;
import io.github.mykytko.javalab2.triangle.BlackTriangle;

public class BlackFactory implements BaseFactory {
    @Override
    public Circle createCircle(Point center, float radius) {
      return new BlackCircle(center, radius);
    }

    @Override
    public Triangle createTriangle(ArrayList <Point> vertices) {
      return new BlackTriangle(vertices);
    }
}
