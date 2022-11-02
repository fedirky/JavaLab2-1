package io.github.mykytko.javalab2.primitives.circle;
import io.github.mykytko.javalab2.primitives.Point;
import io.github.mykytko.javalab2.Color;

public class BlackCircle extends Circle {
    private Color color = Color.BLACK;

    public BlackCircle(){
        super();
    }
    public BlackCircle(Point a, int b){
        super(a,b);
    }
    @Override
    public String toString() {

        return super.toString() + " and has color: " + color;
    }
}
