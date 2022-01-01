/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import java.util.Scanner;

/**
 *
 * @author jason
 */
public class Payment extends Customer{

    public String payment_date;
    public double payment_amount;
    protected double room_price;
    public String room_type;
    HolidayPackage a1 = new HolidayPackage();
    double a = a1.package_price;
   
    
    public Payment (Booking booking){
    this.booking = booking;
} 
    
    Scanner myObj = new Scanner(System.in); 
    
    public double CalculatePrice(){
        System.out.println("Please Choose Package:");
        System.out.println("A:Deluxe = RM 80\nB:Premium = RM70\nC:Normal = RM60");
        String room_type = myObj.next();
        
        switch (room_type){
            case "A": 
                room_price = 80;
                break;
            case "B":
                room_price = 70;
                break;
            case "C":
                room_price = 60;
                break;
        }
        payment_amount = room_price * booking.getBook_days();
        return payment_amount;
    }
    
    public double CalculatePriceHolidayPack(){
        System.out.println("Please Choose Package:");
        System.out.println("A:Deluxe = RM 80\nB:Premium = RM70\nC:Normal = RM60");
        String room_type = myObj.next();
        
        switch (room_type){
            case "A": 
                room_price = 80;
                break;
            case "B":
                room_price = 70;
                break;
            case "C":
                room_price = 60;
                break;
        }
        payment_amount = (room_price * booking.getBook_days())-(room_price * booking.getBook_days() * a);
        return payment_amount;
    }
    
    public void roomtype(){
        if (room_price == 80){
            System.out.println("Booking Room: Deluxe");
        }
        else if (room_price == 70){
            System.out.println("Booking Room: Premium");
        }
        else {
            System.out.println("Booking Room: Normal");            
        }
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

    /**
     * @return the payment_amount
     */
    public double getPayment_amount() {
        return payment_amount;
    }

    /**
     * @param payment_amount the payment_amount to set
     */
    public void setPayment_amount(double payment_amount) {
        this.payment_amount = payment_amount;
    }
   
 }
