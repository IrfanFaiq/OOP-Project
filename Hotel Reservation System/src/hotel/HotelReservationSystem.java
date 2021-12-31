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
        Customer cust2 = new Room();
//        HolidayPackage cus2 = new HolidayPackage();//test new code line
//       HolidayPackage hol_pack = new HolidayPackage();//test new code line
        Payment cust1 = new Payment(booking);
        Payment cus = new Payment(booking);//test new code line
//        Payment cuz = new Payment (hol_pack);//test new code line

      
        Scanner input = new Scanner (System.in);
      
     
     
        System.out.println("Welcome to our Hotel");
        System.out.println("==========================");
        System.out.println("\nPlease Choose you Choice");
        System.out.println("1. Enter");
        System.out.println("2. Exit");
        int a = input.nextInt();
        
        if (a == 1 ){
            System.out.println("\nMain Menu");
            System.out.println("How many people:");
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
            for (int i =0;i<n;i++){
                System.out.println("Name:"+customer[i].getCust_name());
                System.out.println("Phone Number:" +customer[i].getCust_numphone());
                System.out.println("Email:" +customer[i].getCust_email());
            }
            
            System.out.println("How many days:");
            booking.setBook_days(input.nextInt());
            
            System.out.println("Choose Room type:");
            System.out.println("A = Deluxe \nB = Premium \nC = Normal");
            cust2.setRoom_type(input.next());            
            //new code line
            System.out.println("Do you want holiday package?: ");            
            System.out.println("1. Yes/ 2. No");
            int b = input.nextInt();
            if(b == 2)
            {
                System.out.println(cust2.getRoom_price());
                System.out.println("RM " + cust1.CalculatePrice());
            }
            else{
                System.out.println(cust2.getRoom_price());
                System.out.println("RM " + cus.CalculatePricePromo());
            }
                                    
            }

        
            else if (a == 2){
            System.out.println("\nGoodbye, Thanks You for choosing our hotel");
        }
        else {
            System.out.println("\nError command not recognize, Please Try Aggain");
        }
    }
}

