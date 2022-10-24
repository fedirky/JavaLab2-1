package io.github.mykytko.javalab2;

public interface BaseFactory {
    public Circle createCircle(Pair <float, float> center, float radius);
    public Triangle createTriangle(ArrayList <Pair <float, float>> vertices);
}
