import java.util.Scanner;
import java.lang.Math;

public class Exercise3
{
    public static void main(String[]args)
    {
        int sum = 0;
        int n = 0;
        int maximun = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter what number you would like to check up to: ");
        maximun = scan.nextInt();

        for(int i = 0; i<=maximun; i++)
        {
            if (Math.sqrt(i) % 1 == 0)
            {
                for(n = 0, sum = 0; sum <= i; n++)
                {
                    sum += n;
                    if (sum==i)
                    {
                        System.out.println(i);
                    }
                }
            }
        }


        




    }
}