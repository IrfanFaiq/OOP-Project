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
    
    public int room_num;
    public String date_in;

    /**
     * @return the room_num
     */
    public int getRoom_num() {
        return room_num;
    }

    /**
     * @param room_num the room_num to set
     */
    public void setRoom_num(int room_num) {
        this.room_num = room_num;
    }

    /**
     * @return the date_in
     */
    public String getDate_in() {
        return date_in;
    }

    /**
     * @param date_in the date_in to set
     */
    public void setDate_in(String date_in) {
        this.date_in = date_in;
    }

}
