/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class BookTest {
    
    public BookTest() {
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
     * Test of isStatus method, of class Book.
     */
    @Test
    public void testIsStatus() {
        System.out.println("isStatus");
        Book instance = new  Book(0, "", "", false);
        boolean expResult = false;
        boolean result = instance.isStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Book.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        boolean status = true;
        Book instance = new  Book(0, "", "", false);
        instance.setStatus(status);
        assertTrue(instance.isStatus());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Book.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Book instance = new  Book(0, "", "", false);
        Book instance2 = new  Book(0, "", "", false);
        int expResult = instance.hashCode();;
        int result = instance2.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Book.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Book(0, "", "", true);
        Book instance = new Book(0, "", "", true);;
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Book.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Book instance = new Book(0, "", "", true);;
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
