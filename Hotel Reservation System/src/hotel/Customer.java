/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author User
 */
abstract public class Customer {
    protected String cust_id;
    protected String cust_name;
    protected String cust_numphone;
    protected String cust_email;
    protected Booking booking;
    
    public Customer(){
        this.cust_name = "Ahmad";
        this.cust_numphone = "011-33457860";
        this.cust_email = "ahmad123@gmail.com";
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


}
