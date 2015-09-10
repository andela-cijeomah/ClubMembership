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
public class TestSolutionTest {
    
    private Data data;
    
    public TestSolutionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        data = new Data();
    }
    
    @After
    public void tearDown() {
    }

    

    /**
     * Test of processBorrowing method, of class TestSolution.
     */
    @Test
    public void testProcessBorrowing() {
        System.out.println("processBorrowing");
        MemberBorrowedBook mbb = null;
        TestSolution ts = new TestSolution();
        ts.processBorrowing(mbb);
    }
    
}
