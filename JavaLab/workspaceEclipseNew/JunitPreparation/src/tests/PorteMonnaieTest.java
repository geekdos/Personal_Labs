package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import project.PorteMonnaie;
import project.SommeArgent;
import project.UniteDistincteException;

public class PorteMonnaieTest {

	PorteMonnaie p1, p2;
	private SommeArgent som1, som2, som3;
	
	@Before
	public void setUp() throws Exception {
		som1 = new SommeArgent(12, "DH");
		som2 = new SommeArgent(13, "EURO");
		som3 = new SommeArgent(14, "DH");
		p1 = new PorteMonnaie();
		p2 = new PorteMonnaie();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAjouteSomme() throws UniteDistincteException {
		p1.ajouteSomme(som1);
		p1.ajouteSomme(som2);
		p1.ajouteSomme(som3);
		//SommeArgent result = som1.add(som2).add(som3);
		SommeArgent result = new SommeArgent(26, "DH");
		SommeArgent result2 = new SommeArgent(13, "EURO");
		//System.out.println("La somme "+result.getQuantite()+" "+result.getUnite());
		p2.ajouteSomme(result);
		p2.ajouteSomme(result2);
		//System.out.println(p2.getContenu().get(result.getUnite()));
		assertTrue(p1.equals(p2));
	}

}
