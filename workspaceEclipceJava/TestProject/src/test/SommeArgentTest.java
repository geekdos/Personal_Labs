/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import project.SommeArgent;
import project.UniteDistincteException;

/**
 * @author theXuser
 *
 */
public class SommeArgentTest {

	private SommeArgent m12CHF;
	private SommeArgent m14CHF;
	private SommeArgent m14USD;
	private static int nbPasseDansInit = 0;
	private static int nbPasseDansAfter = 0;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		m12CHF = new SommeArgent(12, "CHF"); // (1)
		m14CHF = new SommeArgent(14, "CHF");
		m14USD = new SommeArgent(14, "USD");
		System.out.println(++nbPasseDansInit + "ime passage avant exécution d'une méthode de test");
	}
	
	
	public void testAdd() throws UniteDistincteException {
		SommeArgent expected = new SommeArgent(26, "CHF");
		SommeArgent result = m12CHF.add(m14CHF); // (2)
		Assert.assertTrue(expected.equals(result)); // (3)
	}
	
	@Test(expected = UniteDistincteException.class)
	public void testAdd2() throws UniteDistincteException {
		SommeArgent expected = new SommeArgent(26, "CHF");
		SommeArgent result = m12CHF.add(m14CHF); // (2)
		Assert.assertTrue(expected.equals(result)); // (3)
	}
	
	@Test
	public void testEquals(){
		Assert.assertTrue(!m12CHF.equals(null));
		Assert.assertEquals(m12CHF, m12CHF);
		Assert.assertEquals(m12CHF, new SommeArgent(12, "CHF")); // (1)
		Assert.assertTrue(!m12CHF.equals(m14CHF));
		Assert.assertTrue(!m14USD.equals(m14CHF));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println(++nbPasseDansAfter + "ime passage APRES exécution d'une méthode de test");
	}

}
