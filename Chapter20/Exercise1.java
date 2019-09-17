import java.util.Scanner;

public class Exercise1{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int amountOfnumbers = 0;
        int num = 0;

        System.out.println("How many intergers are their: ");
        amountOfnumbers = scan.nextInt();

        while (count < amountOfnumbers){
            System.out.println("Enter a integer: ");
            num = scan.nextInt();

            count = count + 1;
            sum = sum + num;
        }
        
        System.out.println("the sum is " + sum);




    }
}