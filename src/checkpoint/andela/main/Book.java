/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpoint.andela.main;

/**
 *
 * @author bendozy
 */
public class Book {

    private String bookName;
    private String author;
    private int numberOfCopies;
    private String isbnNumber;

    /**
     */
    public Book() {

    }

    /**
     * @param bookName
     * @param author
     * @param numberOfCopies
     * @param isbnNumber
     */
    public Book(String bookName, String author, int numberOfCopies, String isbnNumber) {
        this.bookName = bookName;
        this.author = author;
        this.numberOfCopies = numberOfCopies;
        this.isbnNumber = isbnNumber;

    }

    /**
     * @return the bookName
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * @param bookName the bookName to set
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the numberOfCopies
     */
    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    /**
     * @param numberOfCopies the numberOfCopies to set
     */
    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    /**
     * @return the isbnNumber
     */
    public String getIsbnNumber() {
        return isbnNumber;
    }

    /**
     * @param isbnNumber the isbnNumber to set
     */
    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }
}
