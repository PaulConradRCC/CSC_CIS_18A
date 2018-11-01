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
        int numerator = 2;
        Fractions instance = new Fractions();
        instance.setNumerator(numerator);
        int result = instance.getNumerator();
        assertEquals(result,numerator);
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
        Fractions instance = new Fractions();
        int denominator = 2;
        instance.setNumerator(1);        
        instance.setDenominator(denominator);        
        int result = instance.getDenominator();
        assertEquals(result,denominator);
    }

    /**
     * Test of toString method, of class Fractions.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Fractions instance = new Fractions();
        String expResult = "0 / 1";
        String result = instance.toString();
        assertEquals(expResult, result);        
    }

    /**
     * Test of add method, of class Fractions.
     */
    @Test
    public void testAdd1() {
        System.out.println("add test 1");
        Fractions op2 = new Fractions(3,9);
        Fractions instance = new Fractions(9,12);
        Fractions expResult = new Fractions(13,12);
        Fractions result = instance.add(op2);
        assertEquals(expResult.getNumerator(), result.getNumerator());        
        assertEquals(expResult.getDenominator(), result.getDenominator());        
    }

    @Test
    public void testAdd2() {
        System.out.println("add test 2");
        Fractions op2 = new Fractions(-9,18);
        Fractions instance = new Fractions(1,2);
        Fractions expResult = new Fractions(0,1);
        Fractions result = instance.add(op2);
        assertEquals(expResult.getNumerator(), result.getNumerator());        
        assertEquals(expResult.getDenominator(), result.getDenominator());        
    }
    /**
     * Test of sub method, of class Fractions.
     */
    @Test
    public void testSub1() {
        System.out.println("sub test 1");
        Fractions op2 = new Fractions(1,4);
        Fractions instance = new Fractions(7,8);
        Fractions expResult = new Fractions(5,8);
        Fractions result = instance.sub(op2);
        assertEquals(expResult.getNumerator(), result.getNumerator());
        assertEquals(expResult.getDenominator(), result.getDenominator());
    }

    @Test
    public void testSub2() {
        System.out.println("sub test 2");
        Fractions op2 = new Fractions(5,8);
        Fractions instance = new Fractions(7,8);
        Fractions expResult = new Fractions(1,4);
        Fractions result = instance.sub(op2);
        assertEquals(expResult.getNumerator(), result.getNumerator());
        assertEquals(expResult.getDenominator(), result.getDenominator());
    }
    
    /**
     * Test of multiply method, of class Fractions.
     */
    @Test
    public void testMultiply1() {
        System.out.println("multiply test 1");
        Fractions op2 = new Fractions(1,4);
        Fractions instance = new Fractions(7,8);
        Fractions expResult = new Fractions(7,32);
        Fractions result = instance.multiply(op2);
        assertEquals(expResult.getNumerator(), result.getNumerator());
        assertEquals(expResult.getDenominator(), result.getDenominator());
    }

    @Test
    public void testMultiply2() {
        System.out.println("multiply test 2");
        Fractions op2 = new Fractions(5,8);
        Fractions instance = new Fractions(7,8);
        Fractions expResult = new Fractions(35,64);
        Fractions result = instance.multiply(op2);
        assertEquals(expResult.getNumerator(), result.getNumerator());
        assertEquals(expResult.getDenominator(), result.getDenominator());
    }
    /**
     * Test of divide method, of class Fractions.
     */
    @Test
    public void testDivide1() {
        System.out.println("divide test 1");
        Fractions op2 = new Fractions(1,4);
        Fractions instance = new Fractions(7,8);
        Fractions expResult = new Fractions(7,2);
        Fractions result = instance.divide(op2);
        assertEquals(expResult.getNumerator(), result.getNumerator());
        assertEquals(expResult.getDenominator(), result.getDenominator());
    }
    
    @Test
    public void testDivide2() {
        System.out.println("divide test 2");
        Fractions op2 = new Fractions(5,8);
        Fractions instance = new Fractions(7,8);
        Fractions expResult = new Fractions(7,5);
        Fractions result = instance.divide(op2);
        assertEquals(expResult.getNumerator(), result.getNumerator());
        assertEquals(expResult.getDenominator(), result.getDenominator());
    }
    
    @Test
    public void testDivide3() {
        System.out.println("divide test 3");
        Fractions op2 = new Fractions(0,1);
        Fractions instance = new Fractions(7,8);
        Fractions expResult = null;
        try {
             expResult = new Fractions(7,0);
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage()+" on line 207");            
        }
        Fractions result = null;
        try {
            result = instance.divide(op2);
        }
        catch(Exception e)
        {
                System.err.println(e.getMessage()+" on line 215");
        }
        assertEquals(expResult.getNumerator(), result.getNumerator());
        assertEquals(expResult.getDenominator(), result.getDenominator());
    }
    
    @Test
    public void testCopyConstructor1() {
        System.out.println("copy constructor test 1");
        Fractions instance = new Fractions(7,8);
        Fractions expResult = new Fractions(7,8);
        Fractions result = new Fractions(instance);
        assertEquals(expResult.getNumerator(), result.getNumerator());
        assertEquals(expResult.getDenominator(), result.getDenominator());
    }
    
    @Test
    public void testCopyConstructor2() {
        System.out.println("copy constructor test 2");
        Fractions instance = new Fractions(9,18);
        Fractions expResult = new Fractions(1,2);
        Fractions result = new Fractions(instance);
        assertEquals(expResult.getNumerator(), result.getNumerator());
        assertEquals(expResult.getDenominator(), result.getDenominator());
    }
}
