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
public class SystemInterfaceTest {
    
    public SystemInterfaceTest() {
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
     * Test of logIn method, of class SystemInterface.
     */
    @Test
    public void testLogIn() {
        System.out.println("logIn");
        int id = 0;
        int password = 0;
        SystemInterface instance = new SystemInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.logIn(id, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of logOut method, of class SystemInterface.
     */
    @Test
    public void testLogOut() {
        System.out.println("logOut");
        SystemInterface instance = new SystemInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.logOut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class SystemInterfaceImpl implements SystemInterface {

        public boolean logIn(int id, int password) {
            return false;
        }

        public boolean logOut() {
            return false;
        }
    }
    
}
