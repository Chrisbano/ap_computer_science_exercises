import java.util.*;

public class Exercise5
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
       
        
        
        
        
        String guesspassword = "";
        String password = "";
        System.out.print("Enter a secret password-->");
        password = scan.nextLine();


        String characters = "abcdefghijklmnopqrstuvwxyz";
        guesspassword = "";
        int guesses = 0;
        int i = 0;

        for(guesses = 0; !guesspassword.equals(password); guesses++)
        {
    

            guesspassword = ""; 
            for (i = 0; i < rand.nextInt(5) + 1; i++)
            {
                guesspassword += characters.charAt(rand.nextInt(characters.length()));
                
            }

        }

        System.out.println("Your password is " + guesspassword);
        System.out.println("It took " + guesses + " to guess your password");
        




    }

}