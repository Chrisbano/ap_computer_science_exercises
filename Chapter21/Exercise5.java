import java.util.Scanner;
import java.util.Random;

public class Exercise5{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        double question = 1;
        double random1 = 0;
        double random2 = 0;
        double answer = 0;
        while(question <= 10)
        {
            random1 = rand.getRandom(10,1);
            random2 = rand.getRandom(10,1);
            System.out.println("What is " + random1 + " * " + random2);
            answer = scan.nextDouble();


            if (answer == (random1 * random2))
            {
                System.out.println("Correct!");
                question = question + 1;
            }
            else{
                System.out.println("Incorrect...Restart");

            }

            if (question == answer)
            {
                System.out.println("Congratulations U Passed!");
            }

        }


    }

    
}
