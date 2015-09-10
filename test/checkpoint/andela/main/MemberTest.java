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
public class MemberTest {
    
    private Member member;
    private Data data;
    private Book book;
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        member = new Member("Eric Abidal", 'M', new Date(98772323), "08033006978");
        member.setEmail("eabidal@club.com");
        member.setDateOfRegistration(new Date(99993232));
        
        data = new Data();
        member.setData(data);
        book = data.getBookByName("Things Fall Apart");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFullName method, of class Member.
     */
    @Test
    public void testGetFullName() {
        System.out.println("getFullName");
        String expResult = "Eric Abidal";
        String result = member.getFullName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFullName method, of class Member.
     */
    @Test
    public void testSetFullName() {
        System.out.println("setFullName");
        String fullName = "Syd Bates";
        member.setFullName(fullName);
        assertEquals(fullName, member.getFullName());
        
    }

    /**
     * Test of getGender method, of class Member.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        char expResult = 'M';
        char result = member.getGender();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGender method, of class Member.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        char gender = 'F';
        member.setGender(gender);
        assertEquals(gender, member.getGender());
    }

    /**
     * Test of getDateOfBirth method, of class Member.
     */
    @Test
    public void testGetDateOfBirth() {
        System.out.println("getDateOfBirth");
        Date expResult = new Date(98772323);
        Date result = member.getDateOfBirth();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateOfBirth method, of class Member.
     */
    @Test
    public void testSetDateOfBirth() {
        System.out.println("setDateOfBirth");
        Date dateOfBirth = new Date(21772323);
        member.setDateOfBirth(dateOfBirth);
        assertEquals(dateOfBirth, member.getDateOfBirth());
    }

    /**
     * Test of getEmail method, of class Member.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        String expResult = "eabidal@club.com";
        String result = member.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class Member.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "eabidalagain@club.com";
        member.setEmail(email);
        assertEquals(email, member.getEmail());
    }

    /**
     * Test of getPhoneNumber method, of class Member.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        String expResult = "08033006978";
        String result = member.getPhoneNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhoneNumber method, of class Member.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "09022331435";
        member.setPhoneNumber(phoneNumber);
        assertEquals(phoneNumber, member.getPhoneNumber());
    }

    /**
     * Test of getDateOfRegistration method, of class Member.
     */
    @Test
    public void testGetDateOfRegistration() {
        System.out.println("getDateOfRegistration");
        Date expResult = new Date(99993232);
        Date result = member.getDateOfRegistration();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateOfRegistration method, of class Member.
     */
    @Test
    public void testSetDateOfRegistration() {
        System.out.println("setDateOfRegistration");
        Date dateOfRegistration = new Date(97793232);
        member.setDateOfRegistration(dateOfRegistration);
        assertEquals(dateOfRegistration, member.getDateOfRegistration());
    }

    /**
     * Test of borrowBook method, of class Member.
     */
    @Test
    public void testBorrowBook() {
        System.out.println("borrowBook");
        member.borrowBook(book, new Date());
        assertFalse(data.getBorrowQueue().isEmpty());
    }

    /**
     * Test of returnBook method, of class Member.
     */
    @Test
    public void testReturnBook() {
        System.out.println("returnBook");
        member.returnBook(book);
        assertTrue(data.getLendingList().isEmpty());
    }
    
}
