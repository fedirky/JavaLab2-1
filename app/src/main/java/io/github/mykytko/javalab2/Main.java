package io.github.mykytko.javalab2;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Random;

import io.github.mykytko.javalab2.triangle.*;

public class Main {
    public static void main(String[] args) {

    }

    private static Pair <Circle, Triangle> TestFactory(BaseFactory factory, Random rand) {
    	var points = new ArrayList <Pair <Circle, Triangle>> ();

    	for(var i = 0; i < 4; i++) {
    		var x = (float) ((float) (rand.nextInt(2000) - 1000) / 10.0);
    		var y = (float) ((float) (rand.nextInt(2000) - 1000) / 10.0);
    		var point = new Pair<> (x, y);

    		points.add(point);
    	}

    	var center = points.get(0);
    	var radius = (float) ((float) (rand.nextInt(500)) / 10.0);
    	var circle = factory.createCircle(center, radius);

    	points.remove(0);
    	var triangle = factory.createTriangle(points);

    	var result = new Pair<> (circle, triangle);

    	return result;
    }
}
