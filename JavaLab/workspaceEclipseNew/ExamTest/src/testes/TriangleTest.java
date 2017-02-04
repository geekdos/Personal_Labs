package testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.Point;
import classes.Triangle;

public class TriangleTest {
	
	Triangle t1, t2, t3, t4, t5;

	@Before
	public void setUp() throws Exception {
		t1 = new Triangle(new Point(1, 1), new Point(2, 2), new Point(3, 3)); // un triangle isocel
		t2 = new Triangle(new Point(2, 1), new Point(2, 3), new Point(3, 4)); // un triangle scalene
		t3 = new Triangle(new Point(0, 0), new Point(1, 0), new Point(1, 1)); // un triangle rectangle
		t4 = new Triangle(new Point(1, 1), new Point(2, 2), new Point(3, 3)); // un triangle rectangle isocel
		t5 = new Triangle(new Point(1, 1), new Point(5, 9), new Point(1, 1)); // un triangle Equals
	}

	@Test
	public void testType() {
		assertTrue(t1.type() == "isocel");
		assertTrue(t2.type() == "scalene");
		//assertTrue(t3.type() == "rectangle");
		//assertTrue(t4.type() == "rectangle isocel");
		//assertTrue(t5.type() == "Equals");
	}

	@Test
	public void testEstTriangle() {
		//utilisation de assertTrue
		assertTrue(t1.estTriangle()); // est un triangle
		assertTrue(t2.estTriangle()); // est un triangle
		assertTrue(t3.estTriangle()); // est un triangle
		assertTrue(t4.estTriangle()); // est un triangle
		
		//utilisation de assertFalse
		assertFalse(t5.estTriangle()); // n'est pas un triangle
	}

}
