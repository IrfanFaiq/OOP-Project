/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author jason
 */
public class Booking{
    protected int book_days;

   public Booking(){
       book_days = 1;
   }

    /**
     * @return the book_days
     */
    public int getBook_days() {
        return book_days;
    }

    /**
     * @param book_days the book_days to set
     */
    public void setBook_days(int book_days) {
        this.book_days = book_days;
    }
    }
