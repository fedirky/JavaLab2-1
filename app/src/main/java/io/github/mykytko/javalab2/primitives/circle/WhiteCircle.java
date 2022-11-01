package io.github.mykytko.javalab2.primitives.circle;
import io.github.mykytko.javalab2.primitives.Point;
import io.github.mykytko.javalab2.Color;

public class WhiteCircle extends Circle {
    private Color color = Color.WHITE;

    public WhiteCircle(){
        super();
    }
    public WhiteCircle(Point a, int b){
        super(a,b);
    }
    @Override
    public String toString() {

        return super.toString() + " and has color: " + color;
    }
}
