import java.util.Scanner;

public class InternetDeli{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String item;
        double price;
        double overnight;
        double total;
        double shippingprice;

        System.out.println("Enter this item: ");
        item = scan.nextLine();

        System.out.println("Enter the price: ");
        price = scan.nextDouble();

        System.out.println("Overnight delivery (0==no, 1==yes)");
        overnight = scan.nextDouble();

        if (price < 10 && overnight == 1 )
        {
            shippingprice = 2.0 + 10.0;
        }
        else{
            shippingprice = 2.0;
        }
        if (price > 10)
        {
            shippingprice = 0;
        }
        if (price > 10 || overnight == 1 )
        {
            shippingprice = 10;
        }
           
        total = shippingprice + price;


        System.out.println(total);
        
        













    }
    








}


