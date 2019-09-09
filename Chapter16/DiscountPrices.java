import java.util.Scanner;

public class DiscountPrices 
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double discount = 0.10;
        double price;
        double afterdiscount;

        
        System.out.println("How much does your product cost?");
        price = scan.nextDouble();

        if (price > 10)
        {
            afterdiscount = (price) - (price * discount);
            System.out.println(afterdiscount + "dollars");
        }
        else
        {
            System.out.println(price + "dollars");
        }



        

    }







}