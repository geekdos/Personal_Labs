package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import project.SommeArgent;
import project.UniteDistincteException;

public class SommeArgentTest {

	public static int befor = 0;
	public static int after = 0;
	
	private SommeArgent som1;
	private SommeArgent som2;
	private SommeArgent som3;

	@Before
	public void setUp(){
		som1 = new SommeArgent(12, "DH");
		som2 = new SommeArgent(14, "DH");
		som3 = new SommeArgent(14, "DH");
		System.out.println(++befor +" ime passage avant exécution d'une méthode de test");
	}
	
	@Test
	public void testAdd() throws UniteDistincteException {
		SommeArgent result = som1.add(som2);
		SommeArgent expected = new SommeArgent(26, "DH");
		assertTrue(expected.equals(result));
		//assertEquals(expected, som1.add(som2));
	}
	
	@Test(expected = UniteDistincteException.class)
	public void testAddWithExeption() throws UniteDistincteException{
		SommeArgent sumArg1 = new SommeArgent(10, "EURO");
		SommeArgent sumArg2 = new SommeArgent(10, "DMA");
		
		SommeArgent rerult = sumArg1.add(sumArg2);
		SommeArgent expected = new SommeArgent(20, "EURO");
		
		assertTrue(expected.equals(rerult));
		
	}
	
	@Test
	public void testEquals(){		
		assertTrue(!som1.equals(null));
		assertTrue(som2.equals(som3));
	}

	@After
	public void tearDown(){
		System.out.println(++after +" ime passage apret exécution d'une méthode de test");
	}
	
}
