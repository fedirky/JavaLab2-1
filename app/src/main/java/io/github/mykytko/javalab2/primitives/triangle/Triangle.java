package io.github.mykytko.javalab2.primitives.triangle;

import io.github.mykytko.javalab2.primitives.Figure;
import io.github.mykytko.javalab2.primitives.Point;

import java.util.ArrayList;
import static java.lang.Math.abs;

public abstract class Triangle implements Figure {
	private final ArrayList<Point> vertices;

	public Triangle() {
		vertices = new ArrayList<>() {
			{
				add(new Point(0, 0));
				add(new Point(0, 0));
				add(new Point(0, 0));
			}
		};

	}

	public Triangle(ArrayList<Point> vertices) {
		this.vertices = vertices;
	}

	public ArrayList<Point> getVertices() {
		return vertices;
	}

	@Override
	public Float calculateArea() {
		return 0.5f * abs((vertices.get(0).getX() * (vertices.get(1).getY() - vertices.get(2).getY()))
				+ (vertices.get(1).getX() * (vertices.get(2).getY() - vertices.get(0).getY()))
				+ (vertices.get(2).getX() * (vertices.get(0).getY() - vertices.get(1).getY())));
	}

	@Override
	public String toString() {
		return "Area: " + calculateArea() + "; "
				+ "Vertices: " + vertices.get(0).toString()
				+ " " + vertices.get(1).toString()
				+ " " + vertices.get(2).toString();
	}
}