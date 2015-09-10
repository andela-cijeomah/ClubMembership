/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpoint.andela.main;

import java.util.Date;

/**
 *
 * @author Chidozie Ijeomah
 */
public class Member {

    private String fullName;
    private char gender;
    private Date dateOfBirth;
    private String email;
    private String phoneNumber;
    private Date dateOfRegistration;
    private Data data;

    /**
     */
    public Member() {
        this.dateOfRegistration = new Date();
    }

    /**
     * @param fullName
     * @param gender
     * @param dateOfBirth
     * @param phoneNumber
     */
    public Member(String fullName, char gender, Date dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.dateOfRegistration = new Date();
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * @return the dateOfBirth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the dateOfRegistration
     */
    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    /**
     * @param dateOfRegistration the dateOfRegistration to set
     */
    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    /**
     * @return the data
     */
    public Data getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Data data) {
        this.data = data;
    }

    /**
     * @param book
     * @param date
     */
    public void borrowBook(Book book, Date date) {

        data.getBorrowQueue().offer(new MemberBorrowedBook(book, this, date));

    }

    /**
     * @param book
     */
    public void returnBook(Book book) {
        boolean isBorrower = false;
        MemberBorrowedBook memberBorrowedBook = null;
        for (MemberBorrowedBook mbb : data.getLendingList()) {
            if ((this.fullName.equalsIgnoreCase(mbb.getMember().getFullName()))
                    && book.getBookName().equalsIgnoreCase(mbb.getBook().getBookName())) {
                isBorrower = true;
                memberBorrowedBook = mbb;

            }
        }
        if (memberBorrowedBook != null) {
            System.out.printf("The name of the returner is %s \n", memberBorrowedBook.getMember().fullName);
            System.out.printf("The number of copies left is %d \n", memberBorrowedBook.getBook().getNumberOfCopies());
            book.setNumberOfCopies(book.getNumberOfCopies() + 1);
            data.getLendingList().remove(memberBorrowedBook);
            System.out.printf("The book was succesfully returned \n");
            System.out.printf("The number of copies left is %d \n", book.getNumberOfCopies());
        }
        if (isBorrower) {

        } else {
            System.out.printf("The name of this member is %s \n", this.fullName);
            System.out.printf("This member did not borrow the said book \n");
        }
    }

}
