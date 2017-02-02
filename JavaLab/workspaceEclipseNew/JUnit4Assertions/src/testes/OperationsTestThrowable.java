package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Operations;

public class OperationsTestThrowable {

	@Test(expected = IllegalArgumentException.class)
	public void divisionAvecUnNombre() {
		Operations.diviser(1);
	}

	@Test(expected = ArithmeticException.class)
	public void divisionAvecDeuxNombresDontUnZero() {
		Operations.diviser(10, 0);
	}

	// Give you the red bare
	@Test(expected = ArithmeticException.class)
	public void divisionAvecDeuxNombres() {
		Operations.diviser(10, 5);
	}
}
