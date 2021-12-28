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
        
        int n;
        
        String [] cust1 = new String[9];
        
        Scanner input = new Scanner(System.in);
        
        
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
            
            System.out.print("Enter Your name:");
            String cust_name = input.next();
            System.out.print("Enter Your Phone Num:");
            String cust_phonenum = input.next();
            System.out.print("Enter Your email:");
            String cust_email = input.next();
            
            System.out.println("How many days:");
            int book_days = input.nextInt();
            
            
            }

        
            else if (a == 2){
            System.out.println("\nGoodbye, Thanks You for choosing our hotel");
        }
        else {
            System.out.println("\nError command not recognize, Please Try Aggain");
        }
    }
    
}
