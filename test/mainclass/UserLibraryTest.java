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
public class UserLibraryTest {
    
    public UserLibraryTest() {
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
     * Test of toString method, of class UserLibrary.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        UserLibrary instance = new UserLibrary(0, 0, "", "", false);
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of logOut method, of class UserLibrary.
     */
    @Test
    public void testLogOut() {
        System.out.println("logOut");
        UserLibrary instance = new UserLibrary(0, 0, "", "", true);
        boolean expResult = true;
        boolean result = instance.logOut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of logIn method, of class UserLibrary.
     */
    @Test
    public void testLogIn() {
        System.out.println("logIn");
        int id = 0;
        int password = 0;
        UserLibrary instance = new UserLibrary(0, 0, "", "", false);
        boolean expResult = true;
        boolean result = instance.logIn(id, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
