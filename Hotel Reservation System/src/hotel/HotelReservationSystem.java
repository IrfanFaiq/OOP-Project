/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel;

import java.util.Scanner;

/**
 *
 * @author jason
 */
public class HotelReservationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        
        Room[] customer = new Room[10];
        Booking booking = new Booking();
        Room cust2 = new Room();
        Payment cust1 = new Payment(booking);
        Payment cus1 = new Payment(booking);
        Option myOpt = new Option();
        HolidayPackage sug = new HolidayPackage();

      
        Scanner input = new Scanner (System.in);
      
     
     
        System.out.println("Welcome to Hotel Mania");
        System.out.println("==========================");
        System.out.println("\nPlease Enter your choice");
        System.out.println("1. Enter");
        System.out.println("2. Exit");
        int a = input.nextInt();
        
        if (a == 1 ){
            System.out.println("\nMain Menu");
            System.out.println("Number of Guests :");
            n = input.nextInt();
            
            for (int i=0;i<n;i++){
                System.out.println("Name "+(i+1) + ":");
                customer[i]= new Room();
                customer[i].setCust_name(input.next());
                
                System.out.println("Phone Number "+(i+1)+":");
                customer[i].setCust_numphone(input.next());
                
                System.out.println("Email "+(i+1)+":");
                customer[i].setCust_email(input.next());
            }
            System.out.println("Number of Days:");
            booking.setBook_days(input.nextInt());
            
            System.out.println("Would you like a package holiday?");
            System.out.println("1. Yes/ 2. No");
            int b = input.nextInt();           
            if(b == 2){
                cust1.CalculatePrice();
            }else{
                cus1.CalculatePriceHolidayPack();
            }            

            System.out.println("Enter Check-in Date:");
            cust2.setDate_in(input.next());
            System.out.println("Do you want to leave some suggestion?");
            System.out.println("1. Yes/ 2. No");
            int c = input.nextInt();
            if(c == 1){
                System.out.println("Leave your suggestion here: ");
                sug.setSuggest(input.next());
            }
            
            
            System.out.println("================================");
            System.out.println("Invoice");
             for (int i =0;i<n;i++){
                System.out.println("\nName:"+customer[i].getCust_name());
                System.out.println("Phone Number:" +customer[i].getCust_numphone());
                System.out.println("Email:" +customer[i].getCust_email());
            }
            if(b == 2){
                cust1.roomtype();
            }else{
                cus1.roomtype();
            }                      
            System.out.println("Check-in Date: " +cust2.getDate_in());    
            if(b == 2){
                System.out.println("Total price: " +cust1.getPayment_amount());
            }else{
                System.out.println("Total price: " +cus1.getPayment_amount());
                myOpt.holiday();
            }
            System.out.println(" ");
            if(c == 1){                
                myOpt.suggestion();
                myOpt.gratitiude();
            }else{
                myOpt.gratitiude();
            }            
        }
            else if (a == 2){
            System.out.println("\nThank You for booking with Hotel Mania. We look forward to welcome you soon");
        }
        else {
            System.out.println("\nError command not recognize, Please Try Again");
        }
    }
}
