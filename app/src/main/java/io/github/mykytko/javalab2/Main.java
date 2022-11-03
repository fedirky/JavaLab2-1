package io.github.mykytko.javalab2;

import javafx.util.Pair;
import java.util.ArrayList;
import java.util.Random;

import io.github.mykytko.javalab2.factories.AbstractFactory;
import io.github.mykytko.javalab2.factories.BaseFactory;
import io.github.mykytko.javalab2.factories.UnsupportedColorException;
import io.github.mykytko.javalab2.primitives.Color;
import io.github.mykytko.javalab2.primitives.Point;
import io.github.mykytko.javalab2.primitives.circle.Circle;
import io.github.mykytko.javalab2.primitives.triangle.InvalidPointsAmountException;
import io.github.mykytko.javalab2.primitives.triangle.Triangle;

public class Main {
    public static void main(String[] args) {
    
    }

    private static Pair <Circle, Triangle> TestFactory(BaseFactory factory, Random rand) {
    	var points = new ArrayList<Point>();

        for(var i = 0; i < 4; i++) {
            var x = (float) ((float) (rand.nextInt(2000) - 1000) / 10.0);
            var y = (float) ((float) (rand.nextInt(2000) - 1000) / 10.0);
            var point = new Point(x, y);

            points.add(point);
        }

        var center = points.get(0);
        var radius = (float) ((float) (rand.nextInt(500)) / 10.0);
        var circle = factory.createCircle(center, radius);

        points.remove(0);
        Triangle triangle = null;
        try {
            triangle = factory.createTriangle(points);
        } catch (InvalidPointsAmountException e) {
            e.printStackTrace();
        }

        return new Pair<>(circle, triangle);
    }
}
