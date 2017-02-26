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
public class UsersTest {
    
    public UsersTest() {
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
     * Test of isStatus method, of class Users.
     */
    @Test
    public void testIsStatus() {
        System.out.println("isStatus");
        Users instance = new Users();
        boolean expResult = true;
        boolean result = instance.isStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Users.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        boolean status = false;
        Users instance = new Users();
        instance.setStatus(status);
        assertEquals(status, instance.isStatus());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Users.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Users instance = new Users();
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Users.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Users instance = new Users();
        instance.setId(id);
        assertEquals(id, instance.getId());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Users.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Users instance = new Users();
        int expResult = 1;
        int result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Users.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        int password = 0;
        Users instance = new Users();
        instance.setPassword(password);
        assertEquals(password, instance.getPassword());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Users.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Users instance = new Users();
        String expResult = "adem";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Users.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Users instance = new Users();
        instance.setName(name);
        assertEquals(name, instance.getName());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getSurname method, of class Users.
     */
    @Test
    public void testGetSurname() {
        System.out.println("getSurname");
        Users instance = new Users();
        String expResult = "cakmak";
        String result = instance.getSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setSurname method, of class Users.
     */
    @Test
    public void testSetSurname() {
        System.out.println("setSurname");
        String surname = "";
        Users instance = new Users();
        instance.setSurname(surname);
        assertEquals(surname, instance.getSurname());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Users.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Users();
        Users instance = new Users();
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Users.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Users instance = new Users();
        int expResult = instance.hashCode();
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Users.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Users instance = new Users();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
