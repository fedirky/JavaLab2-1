package io.github.mykytko.javalab2.triangle;

import java.util.ArrayList;


public class Triangle {
	private Vertex vertex1;
	private Vertex vertex2;
	private Vertex vertex3;

	public Triangle() {
		vertex1 = new Vertex(0, 0);
		vertex2 = new Vertex(0, 0);
		vertex3 = new Vertex(0, 0);
	}

	public Triangle(Vertex vertex1, Vertex vertex2, Vertex vertex3) {
		 this.vertex1 = vertex1;
		 this.vertex2 = vertex2;
		 this.vertex3 = vertex3;
	}

	public ArrayList<Vertex> getVertices() {
		return new ArrayList<>() {
			{
				add(vertex1);
				add(vertex2);
				add(vertex3);
			}
		};
	}

	@Override
	public String toString() {
		return "1: " + vertex1.toString()
				+ " 2: " + vertex2.toString()
				+ " 3: " + vertex3.toString();
	}
}