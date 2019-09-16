import java.util.Scanner;

public class Exercise1{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int count;
        int limit;

        System.out.println("Enter the start");
        count = scan.nextInt();
        System.out.println("Enter the limit");
        limit = scan.nextInt();

        while (count <= limit)
        {
            System.out.println("The count is " + count);    
            count = count + 1;      


        }
        System.out.println("Limit reached");







    }


}