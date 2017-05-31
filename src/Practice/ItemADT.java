/*
 * Practice test interface
 */
package Practice;

/**
 *
 * @author Alex
 */
public interface ItemADT 
{
    public String descirption();
    public double suggestedRetailPrice();
    public boolean onSale();
    public double currentPrice();
    public void change(double amount);
    public void changeSaleStatus(boolean status);
    @Override
    public String toString();
}
