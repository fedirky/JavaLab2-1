package io.github.mykytko.javalab2.circle;
import io.github.mykytko.javalab2.triangle.Vertex;
import io.github.mykytko.javalab2.Color;

public class BlackCircle extends Circle {
    private Color color = Color.BLACK;

    public BlackCircle(){
        super();
    }
    public BlackCircle(Vertex a, int b){
        super(a,b);
    }
    @Override
    public String toString() {
        return super.toString() + " and has color: " + color;
    }
}
