package testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.Point;

public class PointTest {

	Point p1, p2, p3, p4;
	
	@Before
	public void setUp() throws Exception {
		 p1 = new Point(1, 1);
		 p2 = new Point(2, 2);
		 p3 = new Point(3, 5);
		 p4 = new Point(1, 1);
	}


	@Test
	public void testDistance() {
		assertTrue(p1.distance(p2) == 1.4142135623730951);
		assertTrue(p1.distance(p4) == 0);
	}
	
	@Test
	public void testEquals(){
		assertTrue(p1.equals(p4));
		assertFalse(p1.equals(p2));
	}
	
}
