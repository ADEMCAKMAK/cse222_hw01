/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import java.util.ArrayList;
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
public class UserStaffTest {
    
    public UserStaffTest() {
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
     * Test of addBook method, of class UserStaff.
     */
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        ArrayList<Book> bookList = new ArrayList<>();
        Book item = new Book(0, "", "", false);
        UserStaff instance = new UserStaff(0, 0, "", "", false);
        boolean expResult = true;
        boolean result = instance.addBook(bookList, item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        /**
     * Test of addBook method, of class UserStaff.
     */
    @Test ( expected = NullPointerException.class)
    public void testAddBookNPE() {
        System.out.println("addBook");
        ArrayList<Book> bookList = new ArrayList<>();
        Book item = null;
        UserStaff instance = new UserStaff(0, 0, "", "", false);
        boolean expResult = true;
        boolean result = instance.addBook(bookList, item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeBook method, of class UserStaff.
     */
    @Test
    public void testRemoveBook() {
        
        System.out.println("removeBook");
        ArrayList<Book> bookList = new ArrayList<>();
        Book item = new Book(0, "", "", false);
        UserStaff instance =  new UserStaff(0, 0, "", "", false);
        boolean expResult = true;
        instance.addBook(bookList, item);
        boolean result = instance.removeBook(bookList, item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test (expected =  NullPointerException.class)
    public void testRemoveBookNPE() {
        
        System.out.println("removeBook");
        ArrayList<Book> bookList = new ArrayList<>();
        Book item = null;
        UserStaff instance =  new UserStaff(0, 0, "", "", false);
        boolean expResult = true;
        instance.addBook(bookList, item);
        boolean result = instance.removeBook(bookList, item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class UserStaff.
     */
    @Test(expected =  NullPointerException.class)
    public void testAddUser_NPE() {
        System.out.println("addUser");
        ArrayList<UserLibrary> userList = null;
        UserLibrary item = null;
        UserStaff instance = null;
        boolean expResult = false;
        boolean result = instance.addUser(userList, item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of addUser method, of class UserStaff.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        ArrayList<UserLibrary> userList = new ArrayList<>();
        UserLibrary item = new UserLibrary(0, 0, "", "", true);
        UserStaff instance = new UserStaff(0, 0, "", "", true);
        boolean expResult = true;
        boolean result = instance.addUser(userList, item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeUser method, of class UserStaff.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        ArrayList<UserLibrary> userList = new ArrayList<>();
        UserLibrary item = new UserLibrary(0, 0, "", "", true);
        UserStaff instance = new UserStaff(0, 0, "", "", true);
        boolean expResult = true;
        instance.addUser(userList, item);
        boolean result = instance.removeUser(userList, item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of removeUser method, of class UserStaff.
     */
    @Test ( expected = NullPointerException.class)
    public void testRemoveUserNPE() {
        System.out.println("removeUser");
        ArrayList<UserLibrary> userList = new ArrayList<>();
        UserLibrary item = null;
        UserStaff instance = new UserStaff(0, 0, "", "", true);
        boolean expResult = true;
        instance.addUser(userList, item);
        boolean result = instance.removeUser(userList, item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class UserStaff.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        UserStaff instance = new UserStaff(0, 0, "", "", true);
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of logIn method, of class UserStaff.
     */
    @Test
    public void testLogIn() {
        System.out.println("logIn");
        int id = 0;
        int password = 0;
        UserStaff instance = new UserStaff(0, 0, "", "", false);
        boolean expResult = true;
        boolean result = instance.logIn(id, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of logOut method, of class UserStaff.
     */
    @Test
    public void testLogOut() {
        System.out.println("logOut");
        UserStaff instance = new UserStaff(0, 0, "", "", false);
        boolean expResult = false;
        boolean result = instance.logOut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
