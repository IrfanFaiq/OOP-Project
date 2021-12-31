/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author jason
 */
public class Payment extends Customer{

    public String payment_date;
  
   
    
    public Payment (Booking booking){
    this.booking = booking;
}
/*    public Payment (HolidayPackage hol_pack){
        this.hol_pack = hol_pack;
    }*///test new code
            
    public double CalculatePrice(){
        total_payment= booking.getBook_days() * 100;
        return getTotal_payment();
    }
    
    public double CalculatePricePromo(){
       // total_payment= (booking.getBook_days() * 100)* hol_pack.getPackage_price();//test new code
        return getTotal_payment();
    }

    /**
     * @return the booking
     */
    public Booking getBooking() {
        return booking;
    }

    /**
     * @param booking the booking to set
     */
    public void setBooking(Booking booking) {
        this.booking = booking;
    }
 }
