package io.github.mykytko.javalab2.triangle;

import io.github.mykytko.javalab2.Color;

public class WhiteTriangle extends Triangle {
	private final Color color = Color.WHITE;

	public WhiteTriangle() {
		super();
	}

	public WhiteTriangle(Vertex vertex1, Vertex vertex2, Vertex vertex3) {
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
