package testes;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDureeLimitee {

	@Test(timeout = 1000)
	public void dureeRespectee() {
	}

	@Test(timeout = 1000)
	public void dureeNonRespectee() throws InterruptedException {
		Thread.sleep(10000); //give you the red bar
	}

}
