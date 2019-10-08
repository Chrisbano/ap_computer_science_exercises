
import java.util.*;

public class Exercise1
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner (System.in);
        Random rand = new Random ();

        System.out.println("I am thinking of a number 1-10");
        System.out.println("You have three tries.");
        int i = 0;
        int num = 0;
        num = rand.nextInt(11);

        while(i < 3){
            System.out.println("Enter a guess: ");
            int guess = scan.nextInt();
            if (guess == num)
            {
                System.out.println("Congrats");
                System.exit(0);
            }
            else
            {
                System.out.println("Wrong");
                i++;
            }
            if (i >= 3)
            {
                System.out.println("The answer was " + num);
            }
            

            
        }
    
        
        

    }

}