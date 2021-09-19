/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package americanbreakfastbreads;

import java.util.Scanner;


public class AmericanBreakfastBreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner obj1 = new Scanner(System.in);
        
        Scanner obj2 = new Scanner(System.in);
        
        System.out.println("Welcome American BreakFast Bakery");
        System.out.println("Enter Bread Type: ");
        
        String type = obj1.nextLine();
        
        System.out.println("Enter Bread Quality: ");
        
        String quality = obj1.nextLine();
        
        System.out.println("Enter Price: ");
        double pricePerItem = obj2.nextDouble();
        
        System.out.println("Enter Number of Breads: ");
        double numOfItems = obj2.nextDouble();
        
        Breads bread = new Breads( quality, type, numOfItems, pricePerItem);
        
        System.out.println("\n Enter Customer: ");
        System.out.println("Enter Name: ");
        String name = obj1.nextLine();
        System.out.println("Enter Email: ");
        String email = obj1.nextLine();
        
        Customer customer = new Customer(name,email);
        
        System.out.println("\n");
        System.out.println(bread.toString());
        
        System.out.println("\n");
        System.out.println(customer.toString());
        
        System.out.println("Total Bill: "+bread.Bill());
        
        
    }
    
}
