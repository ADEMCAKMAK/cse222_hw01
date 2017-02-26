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
public class UserAbstractTest extends UserAbstract {
    
    public UserAbstractTest() {
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
     * Test of logIn method, of class UserAbstract.
     */
    @Test
    public void testLogIn() {
        System.out.println("logIn");
        int id = 0;
        int password = 0;
        UserAbstractTest instance = new UserAbstractTest();
        boolean expResult = false;
        boolean result = instance.logIn(id, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of logOut method, of class UserAbstract.
     */
    @Test
    public void testLogOut() {
        System.out.println("logOut");
        UserAbstractTest instance = new UserAbstractTest();
        boolean expResult = true;
        boolean result = instance.logOut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of borrowBook method, of class UserAbstract.
     */
    @Test
    public void testBorrowBook() {
        System.out.println("borrowBook");
        ArrayList<Book> bookList = new ArrayList<>();
        Book item = new Book(0, "", "", false);
        UserAbstractTest instance = new UserAbstractTest();
        bookList.add(item);
        boolean expResult = true;
        boolean result = instance.borrowBook(bookList, item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test (expected =  NullPointerException.class)
    public void testBorrowBookNPE() {
        System.out.println("borrowBook");
        ArrayList<Book> bookList = null;
        Book item = null;
        UserAbstract instance = null;
        boolean expResult = false;
        boolean result = instance.borrowBook(bookList, item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of returnBook method, of class UserAbstract.
     */
    @Test
    public void testReturnBook() {
        System.out.println("returnBook");
        ArrayList<Book> bookList = new ArrayList<>();
        Book item = new Book(0, "", "", true);
        UserAbstractTest instance = new UserAbstractTest();
        bookList.add(item);
        boolean expResult = true;
        boolean result = instance.returnBook(bookList, item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class UserAbstractImpl extends UserAbstract {

        public UserAbstractImpl() {
            super(0, 0, "", "", false);
        }
    }
    
}
