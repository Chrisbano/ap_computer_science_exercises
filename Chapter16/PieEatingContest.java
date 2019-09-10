import java.util.Scanner;

public class PieEatingContest{
    public static void main( String[]args)
    {
        Scanner scan = new Scanner(System.in);
        double weight;

        System.out.println("Please enter your weight in pounds");
        weight = scan.nextDouble();
        if ((weight >= 30) && (weight <= 250)){
            System.out.println("Allowed");
        }
        else 
        {
            System.out.println("Not Allowed");
        }
            

        

        
        






    }





}