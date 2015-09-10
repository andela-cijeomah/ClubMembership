/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpoint.andela.main;

import java.util.Date;
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
public class MemberBorrowedBookTest {

    private MemberBorrowedBook mbb;

    public MemberBorrowedBookTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        mbb = new MemberBorrowedBook(new Book("Things Fall Apart",
                "Chinua Achebe", 2, "QMJDM1232AA"),
                new Member("Guy Mudoc", 'M', new Date(999232343),
                        "08033406978"), new Date(999999343));
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getBook method, of class MemberBorrowedBook.
     */
    @Test
    public void testGetBook() {
        System.out.println("getBook");
        MemberBorrowedBook instance = new MemberBorrowedBook();
        String expResult = "Chinua Achebe";
        String result = mbb.getBook().getAuthor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBook method, of class MemberBorrowedBook.
     */
    @Test
    public void testSetBook() {
        System.out.println("setBook");
        Book book = new Book("Baby Steps",
                "Sall Bean", 2, "ZFJDM1232AA");
        mbb.setBook(book);
        assertEquals(book, mbb.getBook());
    }

    /**
     * Test of getMember method, of class MemberBorrowedBook.
     */
    @Test
    public void testGetMember() {
        System.out.println("getMember");
        String expResult = "Guy Mudoc";
        String result = mbb.getMember().getFullName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMember method, of class MemberBorrowedBook.
     */
    @Test
    public void testSetMember() {
        System.out.println("setMember");
        Member member = new Member("Avery Allo", 'M', new Date(999232343),
                        "09033406978");
        mbb.setMember(member);
        assertEquals(member, mbb.getMember());
    }

    /**
     * Test of getDateRequested method, of class MemberBorrowedBook.
     */
    @Test
    public void testGetDateRequested() {
        System.out.println("getDateRequested");
        Date expResult = new Date(999999343);
        Date result = mbb.getDateRequested();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDateRequested method, of class MemberBorrowedBook.
     */
    @Test
    public void testSetDateRequested() {
        System.out.println("setDateRequested");
        Date dateRequested = new Date(339999343);
        mbb.setDateRequested(dateRequested);
        assertEquals(dateRequested, mbb.getDateRequested());
    }

}
