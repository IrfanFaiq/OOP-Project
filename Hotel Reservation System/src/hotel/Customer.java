/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author jason
 */
abstract public class Customer {
    protected String cust_id;
    protected String cust_name;
    protected String cust_numphone;
    protected String cust_email;
    protected double total_payment;
    protected double room_price;
    protected String room_type;
    protected Booking booking;
    
    public Customer(){
        this.cust_name = "Ahmad";
        this.cust_numphone = "011-33457860";
        this.cust_email = "ahmad123@gmail.com";
    }
    
    public void price(){
        switch (room_type){
        case "A":
                room_price = 80;
                break;
        }
    }

    /**
     * @return the cust_id
     */
    public String getCust_id() {
        return cust_id;
    }

    /**
     * @param cust_id the cust_id to set
     */
    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    /**
     * @return the cust_name
     */
    public String getCust_name() {
        return cust_name;
    }

    /**
     * @param cust_name the cust_name to set
     */
    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    /**
     * @return the cust_numphone
     */
    public String getCust_numphone() {
        return cust_numphone;
    }

    /**
     * @param cust_numphone the cust_numphone to set
     */
    public void setCust_numphone(String cust_numphone) {
        this.cust_numphone = cust_numphone;
    }

    /**
     * @return the cust_email
     */
    public String getCust_email() {
        return cust_email;
    }

    /**
     * @param cust_email the cust_email to set
     */
    public void setCust_email(String cust_email) {
        this.cust_email = cust_email;
    }

    /**
     * @return the total_payment
     */
    public double getTotal_payment() {
        return total_payment;
    }

    /**
     * @param total_payment the total_payment to set
     */
    public void setTotal_payment(double total_payment) {
        this.total_payment = total_payment;
    }

    /**
     * @return the room_type
     */
    public String getRoom_type() {
        return room_type;
    }

    /**
     * @param room_type the room_type to set
     */
    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    /**
     * @return the room_price
     */
    public double getRoom_price() {
        return room_price;
    }

    /**
     * @param room_price the room_price to set
     */
    public void setRoom_price(double room_price) {
        this.room_price = room_price;
    }
 
}

