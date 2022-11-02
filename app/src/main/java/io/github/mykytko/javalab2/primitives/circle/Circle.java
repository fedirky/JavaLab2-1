package io.github.mykytko.javalab2.primitives.circle;
import io.github.mykytko.javalab2.primitives.Point;
public class Circle {
    private Point center;
    private Integer radius;

    public Circle() {
        center = new Point(0,0);
        radius = 1;
    }

    public Circle(Point a, int b) {
        center = a;
        radius = b;
    }
    public Point getCenter(){
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
