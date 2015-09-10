/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpoint.andela.members;

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
public class StudentTest {
    private Student student;
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        student = new Student("Eric Abidal", 'M', new Date(98772323), "08033006978");
        student.setStudentNumber(12323222);
        student.setStudentClass("Violet");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getStudentNumber method, of class Student.
     */
    @Test
    public void testGetStudentNumber() {
        System.out.println("getStudentNumber");
        long expResult = 12323222L;
        long result = student.getStudentNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStudentNumber method, of class Student.
     */
    @Test
    public void testSetStudentNumber() {
        System.out.println("setStudentNumber");
        long studentNumber = 676766L;
        student.setStudentNumber(studentNumber);
        long result = student.getStudentNumber();
        assertEquals(studentNumber, result);
    }

    /**
     * Test of getStudentClass method, of class Student.
     */
    @Test
    public void testGetStudentClass() {
        System.out.println("getStudentClass");
        String expResult = "Violet";
        String result = student.getStudentClass();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStudentClass method, of class Student.
     */
    @Test
    public void testSetStudentClass() {
        System.out.println("setStudentClass");
        String studentClass = "Carat";
        student.setStudentClass(studentClass);
        String result = student.getStudentClass();
        assertEquals(studentClass, result);
    }
    
}
