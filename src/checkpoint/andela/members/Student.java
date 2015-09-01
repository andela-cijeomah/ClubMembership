/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpoint.andela.members;

import checkpoint.andela.main.Member;
import java.util.Date;

public class Student extends Member {

    private long studentNumber;
    private String studentClass;

    public Student() {
    }

    public Student(String fullName, char gender, Date dateOfBirth, String phoneNumber) {
        super(fullName, gender, dateOfBirth, phoneNumber);
    }

    /**
     * @return the studentNumber
     */
    public long getStudentNumber() {
        return studentNumber;
    }

    /**
     * @param studentNumber the studentNumber to set
     */
    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    /**
     * @return the studentClass
     */
    public String getStudentClass() {
        return studentClass;
    }

    /**
     * @param studentClass the studentClass to set
     */
    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

}
