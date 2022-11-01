package io.github.mykytko.javalab2.circle;
import io.github.mykytko.javalab2.triangle.Vertex;
import io.github.mykytko.javalab2.Color;

abstract class Circle {
    private final Vertex center;
    private final Float radius;
    private final Color color;

    public Circle(Vertex a, float b, Color c) {
        center = a;
        radius = b;
        color = c;
    }
    public Vertex getCenter(){
        return this.center;
    }
    public Float getRadius(){
        return this.radius;
    }
    public Color getColor(){
        return this.color;
    }
    public float calculateArea(){
        return (float)(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return "Center: " + center.toString() +
               "\nRadius: " + this.radius  +
               "\nColor: " + this.color +
               "\nArea: " + calculateArea();
    }
}
