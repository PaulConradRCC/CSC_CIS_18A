package pjc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rcc
 */
public class FractionsTest {
    
    public FractionsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNumerator method, of class Fractions.
     */
    @Test
    public void testGetNumerator() {
        System.out.println("getNumerator");
        Fractions instance = new Fractions();
        int expResult = 0;
        int result = instance.getNumerator();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setNumerator method, of class Fractions.
     */
    @Test
    public void testSetNumerator() {
        System.out.println("setNumerator");
        int numerator = 0;
        Fractions instance = new Fractions();
        instance.setNumerator(numerator);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDenominator method, of class Fractions.
     */
    @Test
    public void testGetDenominator() {
        System.out.println("getDenominator");
        Fractions instance = new Fractions();
        int expResult = 1;
        int result = instance.getDenominator();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setDenominator method, of class Fractions.
     */
    @Test
    public void testSetDenominator() {
        System.out.println("setDenominator");
        int denominator = 0;
        Fractions instance = new Fractions();
        instance.setDenominator(denominator);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Fractions.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Fractions instance = new Fractions();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Fractions.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Fractions op2 = new Fractions(3,9);
        Fractions instance = new Fractions(9,12);
        Fractions expResult = new Fractions(13,12);
        Fractions result = instance.add(op2);
        assertEquals(expResult.getNumerator(), result.getNumerator());        
        assertEquals(expResult.getDenominator(), result.getDenominator());        
    }

    /**
     * Test of sub method, of class Fractions.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        Fractions op2 = null;
        Fractions instance = new Fractions();
        Fractions expResult = null;
        Fractions result = instance.sub(op2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Fractions.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        Fractions op2 = null;
        Fractions instance = new Fractions();
        Fractions expResult = null;
        Fractions result = instance.multiply(op2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Fractions.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        Fractions op2 = null;
        Fractions instance = new Fractions();
        Fractions expResult = null;
        Fractions result = instance.divide(op2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
