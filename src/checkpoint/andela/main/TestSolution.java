/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpoint.andela.main;

import checkpoint.andela.members.Staff;
import checkpoint.andela.members.Student;
import java.util.Date;

/**
 *
 * @author bendozy
 */
public class TestSolution {

    private Data data;
    private Student student1;
    private Student student2;
    private Staff staff1;
    private Book book1;

    public TestSolution() {

        data = new Data();
        student1 = data.getStudentByName("Eric Bell");
        student2 = data.getStudentByName("Eric Abidal");
        staff1 = data.getStaffByName("Nancy Debby");
        book1 = data.getBookByName("Things Fall Apart");

        student1.setData(data);
        student2.setData(data);
        staff1.setData(data);

    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        TestSolution testSolution = new TestSolution();
        testSolution.addBorrowersToQueue();
        testSolution.returnBooks();

    }

    public void processBorrowing(MemberBorrowedBook mbb) {
        Book book = data.getBookByName(mbb.getBook().getBookName());
        if (book != null) {
            System.out.printf("The borrower is %s \n", mbb.getMember().getFullName());
            System.out.printf("The book to be borrowed is %s \n", book.getBookName());
            if (book.getNumberOfCopies() > 0) {
                System.out.printf("The number of copies left is %d \n", book.getNumberOfCopies());
                book.setNumberOfCopies(book.getNumberOfCopies() - 1);
                data.getLendingList().add(mbb);
                System.out.printf("The book was succesfully borrowed \n");
                System.out.printf("The number of copies left is %d \n", book.getNumberOfCopies());

            } else {
                System.out.printf("This book is currently not available \n");
            }
        }
    }

    private void addBorrowersToQueue() {

        student1.borrowBook(book1, new Date(121111111));
        student2.borrowBook(book1, new Date(121111111));
        staff1.borrowBook(book1, new Date(121111111));

        while (data.getBorrowQueue().size() > 0) {
            MemberBorrowedBook mbb = data.getBorrowQueue().poll();
            processBorrowing(mbb);
        }
        
    }

    private void returnBooks() {
        student1.returnBook(book1);
        student2.returnBook(book1);
        staff1.returnBook(book1);
    }
}
