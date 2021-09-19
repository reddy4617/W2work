/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package americanbreakfastbreads;


public class Breads extends CalculateBill{
   
    private String breadQuality;
    private String BreadType;
    private double numberOfItems;
    private double pricePerItem;

    public Breads(String breadQuality, String BreadType, double numberOfItems, double pricePerItem) {
        this.breadQuality = breadQuality;
        this.BreadType = BreadType;
        this.numberOfItems = numberOfItems;
        this.pricePerItem = pricePerItem;
    }

    
    
    public String getBreadQuality() {
        return breadQuality;
    }

    public String getBreadType() {
        return BreadType;
    }

    public double getNumberOfItems() {
        return numberOfItems;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    @Override
    public double Bill() {
    
        return getNumberOfItems() * getPricePerItem();
        
    }

    @Override
    public String toString() {
        return "Breads{" + 
                " \n breadQuality=" + breadQuality + 
                " \n BreadType=" + BreadType +
                " \n numberOfItems=" + numberOfItems + 
                " \n pricePerItem=" + pricePerItem + '}';
    }

    
    
}
