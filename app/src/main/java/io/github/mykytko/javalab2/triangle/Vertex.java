package io.github.mykytko.javalab2.triangle;

public class Vertex {
	private Float x;
	private Float y;

	public Vertex(float x, float y) {
		this.x = x;
		this.y = y;
	}

	Float getX() { return x; }
	Float getY() { return y; }

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
