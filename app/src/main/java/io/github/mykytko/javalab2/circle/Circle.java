package io.github.mykytko.javalab2.circle;
import io.github.mykytko.javalab2.triangle.Vertex;
public class Circle {
    private Vertex center;
    private Integer radius;

    public Circle() {
        center = new Vertex(0,0);
        radius = 1;
    }

    public Circle(Vertex a, int b) {
        center = a;
        radius = b;
    }
    public Vertex getCenter(){
        return this.center;
    }
    public Integer getRadius(){
        return this.radius;
    }

    @Override
    public String toString() {
        return "Center " + center.toString() + "\nRadius " + this.radius;
    }
}
