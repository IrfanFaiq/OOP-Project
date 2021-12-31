/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author jason
 */
public class Room extends Customer{
    
    protected int room_num;

       public void price(){
        switch (room_type){
        case "A":
                room_price = 80;
                break;
        }
    }
}
