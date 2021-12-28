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
        
        Customer[] customer = new Customer[10];

      
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
                customer[i]= new Customer();
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
            }

        
            else if (a == 2){
            System.out.println("\nGoodbye, Thanks You for choosing our hotel");
        }
        else {
            System.out.println("\nError command not recognize, Please Try Aggain");
        }
    }
    
}
