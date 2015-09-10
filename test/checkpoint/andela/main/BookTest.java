/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpoint.andela.main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bendozy
 */
public class BookTest {
    private Book book;
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
        book = new Book("Things Fall Apart", "Chinua Achebe", 2, "QMJDM1232AA");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBookName method, of class Book.
     */
    @Test
    public void testGetBookName() {
        System.out.println("getBookName");
        String expResult = "Things Fall Apart";
        String result = book.getBookName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBookName method, of class Book.
     */
    @Test
    public void testSetBookName() {
        System.out.println("setBookName");
        String bookName = "A Man of the people";
        book.setBookName(bookName);
        String expResult = bookName;
        assertEquals(expResult, book.getBookName());
    }

    /**
     * Test of getAuthor method, of class Book.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        String expResult = "Chinua Achebe";
        String result = book.getAuthor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAuthor method, of class Book.
     */
    @Test
    public void testSetAuthor() {
        System.out.println("setAuthor");
        String author = "Chris Allen";
        book.setAuthor(author);
        String expResult = author;
        assertEquals(expResult, book.getAuthor());
    }

    /**
     * Test of getNumberOfCopies method, of class Book.
     */
    @Test
    public void testGetNumberOfCopies() {
        System.out.println("getNumberOfCopies");
        int expResult = 2;
        int result = book.getNumberOfCopies();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumberOfCopies method, of class Book.
     */
    @Test
    public void testSetNumberOfCopies() {
        System.out.println("setNumberOfCopies");
        int numberOfCopies = 5;
        book.setNumberOfCopies(numberOfCopies);
        int expResult = numberOfCopies;
        assertEquals(expResult, book.getNumberOfCopies());
    }

    /**
     * Test of getIsbnNumber method, of class Book.
     */
    @Test
    public void testGetIsbnNumber() {
        System.out.println("getIsbnNumber");
        Book instance = new Book();
        String expResult = "QMJDM1232AA";
        String result = book.getIsbnNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIsbnNumber method, of class Book.
     */
    @Test
    public void testSetIsbnNumber() {
        System.out.println("setIsbnNumber");
        String isbnNumber = "SSWEQ889HH";
        book.setIsbnNumber(isbnNumber);
        String expResult = isbnNumber;
        assertEquals(expResult, book.getIsbnNumber());
    }
    
}
