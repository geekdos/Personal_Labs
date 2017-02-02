package testes;

import static org.junit.Assert.*;
import static org.easymock.EasyMock.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.ISimpleDao;
import classes.NotExistingException;
import classes.SimpleService;

public class SimpleServiceTest {

	private SimpleService simpleService;
	private ISimpleDao simpleDaoMock;

	@Before
	public void setUp() throws Exception {
		simpleDaoMock = createMock(ISimpleDao.class);
		simpleService = new SimpleService();
		simpleService.setDao(simpleDaoMock);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsert() {
	}

	@Test
	public void testSave() {
		simpleDaoMock.save("xyzzy");
		simpleDaoMock.save("xyzzy");
		simpleDaoMock.save("xyzzy");
		simpleDaoMock.save("xyzzy");
		simpleDaoMock.save("xyzzy");
		
		replay(simpleDaoMock);
		
		simpleService.save("xyzzy", "xyzzy", "xyzzy", "xyzzy", "xyzzy");
		
		verify(simpleDaoMock);
	}
	
	@Test
	public void testSave2() {
		simpleDaoMock.save("xyzzy");
		
		expectLastCall().times(5); // La methode save() doit etre appeler 5 fois
		expectLastCall().anyTimes(); // Le nomber des appeles de la methode save() est indéfini
		
		replay(simpleDaoMock);
		
		simpleService.save("xyzzy", "xyzzy", "xyzzy", "xyzzy", "xyzzy");
		
		verify(simpleDaoMock);
	}

	@Test
	public void testRemove() throws NotExistingException {
		simpleDaoMock.remove("Mary");

		replay(simpleDaoMock);

		assertTrue(simpleService.remove("Mary"));

		verify(simpleDaoMock);
	}

	// Avec exception
	@Test
	public void removeWithException() throws NotExistingException {
		simpleDaoMock.remove("Arthur");
		expectLastCall().andThrow(new NotExistingException());
		replay(simpleDaoMock);
		assertFalse(simpleService.remove("Arthur"));
		verify(simpleDaoMock);
	}

	@Test
	public void testSize() {
		expect(simpleDaoMock.count()).andReturn(30);

		replay(simpleDaoMock);

		assertEquals(30, simpleService.size());

		verify(simpleDaoMock);
	}

	@Test
	public void testDebug() {
		simpleDaoMock.debug();
		replay(simpleDaoMock);
		simpleService.debug();
		verify(simpleDaoMock);
	}

}
