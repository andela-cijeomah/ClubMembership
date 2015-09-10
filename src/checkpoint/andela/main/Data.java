/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpoint.andela.main;

import checkpoint.andela.members.Staff;
import checkpoint.andela.members.Student;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author bendozy
 */
public class Data {

    private HashSet<Book> bookList;
    private HashSet<Student> studentList;
    private HashSet<Staff> staffList;
    private ArrayList<MemberBorrowedBook>lendingList;
    private Queue<MemberBorrowedBook> borrowQueue;

    public Data() {
        lendingList = new ArrayList<>();
        
        bookList = new HashSet<>();
        bookList.add(new Book("Things Fall Apart", "Chinua Achebe", 2, 
                "QMJDM1232AA"));
        bookList.add(new Book("The Andela we know", "Aboyeji E", 2, 
                "QMJDM1232BB"));
        bookList.add(new Book("The Rails Way", "Obie Fernandez", 3, 
                "APJDM1232BB"));
        bookList.add(new Book("Apache Effect", "Obie Fernandez", 3, 
                "BPJDM1232BB"));
        bookList.add(new Book("Golf it", "Tiger Woods", 3, 
                "BPJDM1232SS"));

        studentList = new HashSet<>();
        studentList.add(new Student("Eric Abidal", 'M', getDate(1991, 8, 15), 
                "08033006978"));
        studentList.add(new Student("Georgia Adams", 'F', getDate(1991, 6, 15), 
                "08033006478"));
        studentList.add(new Student("Eric Bell", 'M', getDate(1993, 8, 17), 
                "08133006978"));
        studentList.add(new Student("Nancy Reed", 'F', getDate(1991, 8, 15), 
                "07033006978"));

        staffList = new HashSet<>();
        staffList.add(new Staff("Guy Mudoc", 'M', getDate(1961, 8, 15), 
                "08033406978"));
        staffList.add(new Staff("Fer gambit", 'F', getDate(1954, 6, 15), 
                "08033406478"));
        staffList.add(new Staff("Matt Manes", 'M', getDate(1967, 8, 17), 
                "08133006678"));
        staffList.add(new Staff("Nancy Debby", 'F', getDate(1981, 8, 15), 
                "07033056978"));

        borrowQueue
                = new PriorityQueue<>(new Comparator<MemberBorrowedBook>() {

                    @Override
                    public int compare(
                            MemberBorrowedBook mbb1, 
                            MemberBorrowedBook mbb2
                    ) {

                        Member member1 = mbb1.getMember();
                        Member member2 = mbb2.getMember();
                        if (mbb1.getBook().getBookName().equalsIgnoreCase(mbb2.getBook().getBookName())
                        && mbb1.getDateRequested().getTime() == mbb2.getDateRequested().getTime()) {
                            if (member1 instanceof Staff && member2 instanceof Student) {
                                return -1;
                            } else if (member1 instanceof Student && member2 instanceof Staff) {
                                return 1;
                            } else {
                                return (int) (member1.getDateOfRegistration().getTime() - member2.getDateOfRegistration().getTime());
                            }
                        } else {
                            return (int) (mbb1.getDateRequested().getTime() - mbb2.getDateRequested().getTime());
                        }
                    }
                });

    }

    public Book getBookByName(String bookName) {
        for (Book book : getBookList()) {
            if (book.getBookName().equalsIgnoreCase(bookName)) {
                return book;
            } else {
                return null;
            }
        }
        return null;
    }

    public Student getStudentByName(String studentName) {
        for (Student student : getStudentList()) {
            if (student.getFullName().equalsIgnoreCase(studentName)) {
                return student;
            }
        }
        return null;
    }

    public Staff getStaffByName(String staffName) {
        for (Staff staff : getStaffList()) {
            if (staff.getFullName().equalsIgnoreCase(staffName)) {
                return staff;
            }
        }
        return null;
    }

    private Date getDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.YEAR, year);
        Date date = calendar.getTime();
        return date;
    }

    /**
     * @return the bookList
     */
    public HashSet<Book> getBookList() {
        return bookList;
    }

    /**
     * @param bookList the bookList to set
     */
    public void setBookList(HashSet<Book> bookList) {
        this.bookList = bookList;
    }

    /**
     * @return the studentList
     */
    public HashSet<Student> getStudentList() {
        return studentList;
    }

    /**
     * @param studentList the studentList to set
     */
    public void setStudentList(HashSet<Student> studentList) {
        this.studentList = studentList;
    }

    /**
     * @return the staffList
     */
    public HashSet<Staff> getStaffList() {
        return staffList;
    }

    /**
     * @param staffList the staffList to set
     */
    public void setStaffList(HashSet<Staff> staffList) {
        this.staffList = staffList;
    }

    /**
     * @return the borrowQueue
     */
    public Queue<MemberBorrowedBook> getBorrowQueue() {
        return borrowQueue;
    }

    /**
     * @param borrowQueue the borrowQueue to set
     */
    public void setBorrowQueue(Queue<MemberBorrowedBook> borrowQueue) {
        this.borrowQueue = borrowQueue;
    }

    /**
     * @return the lendingList
     */
    public ArrayList<MemberBorrowedBook> getLendingList() {
        return lendingList;
    }

    /**
     * @param lendingList the lendingList to set
     */
    public void setLendingList(ArrayList<MemberBorrowedBook> lendingList) {
        this.lendingList = lendingList;
    }

}
