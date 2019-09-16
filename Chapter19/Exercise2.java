import java.util.Scanner;


public class Exercise2{
    public static void main( String[] args)
    {
        int number;
        int sum = 0;
        int counter = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number: ");
        number = scan.nextInt();

        while (counter < number)
        {
            counter = counter + 1;

            sum = sum + counter;

            

        }

        System.out.println(sum);



    }
}