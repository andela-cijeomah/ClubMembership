/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpoint.andela.members;

import checkpoint.andela.main.Member;
import java.util.Date;

public class Staff extends Member {

    private long staffNumber;
    private double netPay;

    public Staff() {
    }

    public Staff(String fullName, char gender, Date dateOfBirth, String phoneNumber) {
        super(fullName, gender, dateOfBirth, phoneNumber);
    }

    /**
     * @return the staffNumber
     */
    public long getStaffNumber() {
        return staffNumber;
    }

    /**
     * @param staffNumber the staffNumber to set
     */
    public void setStaffNumber(long staffNumber) {
        this.staffNumber = staffNumber;
    }

    /**
     * @return the netPay
     */
    public double getNetPay() {
        return netPay;
    }

    /**
     * @param netPay the netPay to set
     */
    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }

}
