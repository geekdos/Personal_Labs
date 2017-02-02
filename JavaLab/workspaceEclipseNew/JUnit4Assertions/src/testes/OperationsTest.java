package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Operations;

public class OperationsTest {

	@Test
	public void additionAvecDeuxNombres() {
		final long lAddition = Operations.additionner(10, 20);
		assertEquals(30, lAddition);
	}

	@Test
	public void additionAvecCinqNombres() {
		final long lAddition = Operations.additionner(256, 512, 1024, 2048, 4096);
		assertEquals(7936, lAddition);
	}

	@Test
	public void mutiplicationAvecDeuxNombres() {
		final long lMultiplication = Operations.multiplier(10, 20, 10);
		
		assertEquals(2000, lMultiplication);
	}

}
