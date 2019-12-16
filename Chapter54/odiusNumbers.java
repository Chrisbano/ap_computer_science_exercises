import java.util.*;

public class odiusNumbers
{
    static boolean determOdius(int n)
    {
        int numOfOnes = 0;

        while (n >= 1)
        {
            if (n % 2 == 1)
            {
                ++numOfOnes;
            }
            n = n/2;
        }
        if (numOfOnes % 2 == 0)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        System.out.println("Please enter a number that is not negative");
        while (num >= 0)
        {
            num = scan.nextInt();
            System.out.println(determOdius(num));
        }
        System.exit(0);
    }
}