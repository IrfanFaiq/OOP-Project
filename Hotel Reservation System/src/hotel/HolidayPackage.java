/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author jason
 */
public class HolidayPackage {
    public double package_price = 0.2;
    public String suggest;

    /**
     * @return the suggest
     */
    public String getSuggest() {
        return suggest;
    }

    /**
     * @param suggest the suggest to set
     */
    public void setSuggest(String suggest) {
        this.suggest = suggest;
    }
}


interface moreOption{
    public void holiday();
    public void suggestion();
    public void gratitiude();
    
}

class Option implements moreOption{
    public void holiday(){
        System.out.println("Thank you for choosing our package holiday");
    }
    public void suggestion(){
        System.out.println("We sincerely appreciate your comments and suggestions, thanks for pointing out what we can do better.");
    }
    public void gratitiude(){
        System.out.println("Thank You for choosing Hotel Mania, have a nice day!");
    }
    
}
