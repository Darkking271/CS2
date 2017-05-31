/*
 * Practice test implementation of interface
 */
package Practice;

/**
 *
 * @author Alex
 */
public class Item implements ItemADT
{
    private String description;
    private double suggestedRetailPrice;
    private boolean onSale;
    
    public Item(String detail, double value)
    {
        description = detail;
        suggestedRetailPrice = value;
        onSale = false;
    }
    public String descirption() 
    {
        return description;
    }
    public double suggestedRetailPrice() 
    {
        return suggestedRetailPrice;
    }
    public boolean onSale()
    {
        return onSale;
    }
    public double currentPrice()
    {
        double current;
        if (onSale)
            current = suggestedRetailPrice * .70;
        else
            current = suggestedRetailPrice;
        
        return current;
    }
    public void change(double amount)
    {
        suggestedRetailPrice += amount;
    }
    public void changeSaleStatus(boolean status)
    {
        onSale = status;
    }
    @Override
    public String toString()
    {
        String item = "<DESCRIPTION = " + description + 
                " |  SUGGESTED RETAIL PRICE = " + suggestedRetailPrice + 
                " |  ON SALE = " + onSale + " >";
        return item;
    }
}
