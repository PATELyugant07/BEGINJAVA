import java.util.*;
class price_exception extends Exception
{
    public price_exception(String s)
    {
        super(s);
    }
}
class quantity_exception extends Exception
{
    public quantity_exception(String s)
    {
        super(s);
    }
}
class product
{
    Scanner sc = new Scanner(System.in);
    int itemcode,qty,rate;
    String description;
    product()
    {
        System.out.print("enter itemcode :- ");
        itemcode = sc.nextInt();
        System.out.print("enter description :- ");
        description = sc.next();
        System.out.print("Rate :- ");
        rate = sc.nextInt();
        System.out.print("quantity :- ");
        qty = sc.nextInt();
    }
    void display() throws price_exception , quantity_exception
    {
        if(rate >= 0)
        {
            throw new price_exception("low price ...");
        }
        if(qty >= 0)
        {
            throw new quantity_exception("low quantity ...");
        }
        else
        {
            System.out.println("item code :- " + itemcode);
            System.out.println("item name :- " + description);
            System.out.println("rate :- " + rate);
            System.out.println("quantity :- " + qty);
        }
    }
}
public class price_quantity
{
    public static void main(String[] args)
    {
        product p = new product();
        try
        {
            p.display();
        }
        catch(price_exception e)
        {
            System.out.println(e.getMessage());
        }
        catch(quantity_exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
