/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpoint.andela.main;

import java.util.Date;

/**
 *
 * @author bendozy
 */
public class MemberBorrowedBook {

    private Book book;
    private Member member;
    private Date dateRequested;

    public MemberBorrowedBook() {
    }

    public MemberBorrowedBook(Book book, Member member, Date dateRequested) {
        this.book = book;
        this.member = member;
        this.dateRequested = dateRequested;
    }

    /**
     * @return the book
     */
    public Book getBook() {
        return book;
    }

    /**
     * @param book the book to set
     */
    public void setBook(Book book) {
        this.book = book;
    }

    /**
     * @return the member
     */
    public Member getMember() {
        return member;
    }

    /**
     * @param member the member to set
     */
    public void setMember(Member member) {
        this.member = member;
    }

    /**
     * @return the dateRequested
     */
    public Date getDateRequested() {
        return dateRequested;
    }

    /**
     * @param dateRequested the dateRequested to set
     */
    public void setDateRequested(Date dateRequested) {
        this.dateRequested = dateRequested;
    }
}
