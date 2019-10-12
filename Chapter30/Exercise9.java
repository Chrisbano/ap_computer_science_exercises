import java.util.*;

public class Exercise9
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int playerScore = 0;
        int computerScore = 0;
        boolean turnSwitch = false;
        int workingSum = 0;
    
        while(playerScore < 100 || computerScore < 100)
        {
            // Spacing  
            // Variables
            int compRoll1 = 0;
            int compRoll2 = 0;
            int compRoll3 = 0;
            int compRollTotal = 0;
            int playerRoll = 0;
            
            boolean playerChoice = true;


            if(!turnSwitch)
            {
                compRoll1 = rand.nextInt(6) + 1;
                compRoll2 = rand.nextInt(6) + 1;
                compRoll3 = rand.nextInt(6) + 1;
                compRollTotal = compRoll1 + compRoll2 + compRoll3;
                System.out.println("Computer score: " + computerScore + "  " + "Player score: " + playerScore);
            
                computerScore += compRollTotal;

                System.out.println(" The computer rolled " + compRollTotal);
                turnSwitch = true;
            }
            else
            {

                playerRoll = rand.nextInt(6) + 1;
                System.out.println("You rolled a " + playerRoll);


                if (playerRoll == 1)
                {
                    System.out.println("You rolled a " + playerRoll + " your turn is over.");
                    workingSum = 0;
                    turnSwitch = false;
                    System.out.println("\n");
                    

                }
                else
                {
                    System.out.println("The working sum is " + workingSum);
                    System.out.println(" Would you like to keep rolling?");
                    playerChoice = scan.nextBoolean();

                    if(!playerChoice)
                    {
                        workingSum += playerRoll;
                        playerScore += workingSum;
                        playerRoll = 1;
                        turnSwitch = false;
                        
                    }
                    else
                    {
                        workingSum += playerRoll;
        
                        turnSwitch = true;
                        System.out.println("\n");
                    
                        
                    }

                }
                

            }
            
        }

        if (playerScore > computerScore)
        {
            System.out.println("\n ");
            System.out.println("You won congrats!!");
        }
        else{
            System.out.println("\n");
            
            System.out.println("The computer won,,,");

        }
    }
}

    





