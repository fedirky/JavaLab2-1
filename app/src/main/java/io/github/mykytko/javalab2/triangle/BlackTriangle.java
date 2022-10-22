package io.github.mykytko.javalab2.triangle;

import io.github.mykytko.javalab2.Color;

public class BlackTriangle extends Triangle {
	private final Color color = Color.BLACK;

	public BlackTriangle() {
		super();
	}

	public BlackTriangle(Vertex vertex1, Vertex vertex2, Vertex vertex3) {
		super(vertex1, vertex2, vertex3);
	}

	public Color getColor() {
		return color;
	}

	@Override
	public String toString() {
		return super.toString() + " Color: " + color;
	}
}
