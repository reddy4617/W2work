/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package americanbreakfastbreads;


public class Customer {
    
    
    private String name;
    private String email;
  

    
    
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

   

    @Override
    public String toString() {
        return "Customer{" +
                "\n name='" + getName() +
                ", \n email='" + getEmail() + 
                '}';
    }
    
}
