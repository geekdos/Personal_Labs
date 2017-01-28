import org.junit.*;

/**
 * Created by theXuser on 1/14/2017.
 */
public class SommeArgentTest {

    private SommeArgent m12CHF;
    private SommeArgent m14CHF;
    private SommeArgent m14USD;
    private static int nbPasseDansInit = 0;
    private static int nbPasseDansAfter = 0;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("I'm the beforeClass method");
    }

    @Before
    public void before(){
        m12CHF = new SommeArgent(12, "CHF"); // (1)
        m14CHF = new SommeArgent(14, "CHF");
        m14USD = new SommeArgent(14, "USD");
        System.out.println(++nbPasseDansInit + "ime passage avant exécution d'une méthode de test");
        System.out.println("I'm the before test method");
    }

    @Test
    public void testAdd(){
        SommeArgent expect = new SommeArgent(26, "CHF");
        SommeArgent result = m12CHF.add(m14CHF);
        Assert.assertTrue(result.equals(expect));
        System.out.println("I'm the test 1");
    }

    /*
    @Test(expected = UniteDistincteException.class)
    public void testAdd2() throws UniteDistincteException {
        SommeArgent expected = new SommeArgent(26, "CHF");
        SommeArgent result = m12CHF.add(m14CHF); // (2)
        Assert.assertTrue(expected.equals(result)); // (3)
    }
    */

    @Test
    public void testEquals(){
        Assert.assertTrue(!m12CHF.equals(null));
        Assert.assertEquals(m12CHF, m12CHF);
        Assert.assertEquals(m12CHF, new SommeArgent(12, "CHF")); // (1)
        Assert.assertTrue(!m12CHF.equals(m14CHF));
        Assert.assertTrue(!m14USD.equals(m14CHF));
    }

    @Test
    public void test2(){
        System.out.println("I'm the test 2");
    }

    @After
    public void after(){
        System.out.println("I'm the after test method");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("I'm the afterClass method");
    }
}
