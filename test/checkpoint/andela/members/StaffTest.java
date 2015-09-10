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
public class StaffTest {

    private Staff staff;

    public StaffTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        staff = new Staff("Guy Mudoc", 'M', new Date(999232343), "08033406978");
        staff.setNetPay(300000);
        staff.setStaffNumber(213345);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getStaffNumber method, of class Staff.
     */
    @Test
    public void testGetStaffNumber() {
        System.out.println("getStaffNumber");
        long expResult = 213345L;
        long result = staff.getStaffNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStaffNumber method, of class Staff.
     */
    @Test
    public void testSetStaffNumber() {
        System.out.println("setStaffNumber");
        long staffNumber = 321112L;
        staff.setStaffNumber(staffNumber);
        long expResult = staff.getStaffNumber();
        assertEquals(staffNumber, expResult);

    }

    /**
     * Test of getNetPay method, of class Staff.
     */
    @Test
    public void testGetNetPay() {
        System.out.println("getNetPay");
        double expResult = 300000.0;
        double result = staff.getNetPay();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setNetPay method, of class Staff.
     */
    @Test
    public void testSetNetPay() {
        System.out.println("setNetPay");
        double netPay = 43000.0;
        staff.setNetPay(netPay);
        double expResult = staff.getNetPay();
        assertEquals(netPay, expResult, 0.0);
    }

}
