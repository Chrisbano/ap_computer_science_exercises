import java.util.*;

public class Exercise8{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        String playerOne = "";
        String playerTwo = "";
        double playerOneGuess;
        double playerTwoGuess;
        int playOneScore = 0;
        int playTwoScore = 0;
        boolean turnSwitch = true;

        int rounds = 0;
        
        System.out.println("First player sign in ---->");
        playerOne = scan.nextLine();
        System.out.println("First player sign in ---->");
        playerTwo = scan.nextLine();

        System.out.println("How many rounds?: ");
        rounds = scan.nextInt();

        for(int i = 0; i < rounds; i++)
        {
            double randomNumber;
            randomNumber = rand.nextDouble() *  99 + 1;
            double randomsquareroot;
            randomsquareroot = Math.sqrt(randomNumber);
        
            System.out.println("What is the square root of " + randomNumber);
            if (turnSwitch)
            {
                System.out.println(playerOne + " your guess?: ");
                playerOneGuess = scan.nextDouble();
                System.out.println(playerTwo + " your guess?: ");
                playerTwoGuess =scan.nextDouble();


                double playOneDistance = Math.abs(randomsquareroot- playerOneGuess);
                double playTwoDistance = Math.abs(randomsquareroot- playerTwoGuess);

                if (playOneDistance < playTwoDistance)
                {
                    System.out.println(" The coreect square root is" + randomsquareroot);
                    System.out.println(playerOne + " is " + playOneDistance + " away.");
                    System.out.println(playerTwo + " is " + playTwoDistance + " away.");
                    System.out.println(playerOne + " wins!!");
                    playOneScore++;
                }
                else
                {
                    System.out.println(" The coreect square root is" + randomsquareroot);
                    System.out.println(playerOne + " is " + playOneDistance + " away.");
                    System.out.println(playerTwo + " is " + playTwoDistance + " away.");
                    System.out.println(playerTwo + " wins!!");
                    playTwoScore++;
                }
                turnSwitch = false;

            }
            else
            {
                System.out.println(playerTwo + " your guess?: ");
                playerTwoGuess = scan.nextDouble();
                System.out.println(playerOne + " your guess?: ");
                playerOneGuess =scan.nextDouble();

                double playOneDistance = Math.abs(randomsquareroot - playerOneGuess);
                double playTwoDistance = Math.abs(randomsquareroot - playerTwoGuess);

                if (playOneDistance < playTwoDistance)
                {
                    System.out.println(" The correct square root is: " + randomsquareroot);
                    System.out.println(playerOne + " is " + playOneDistance + " away.");
                    System.out.println(playerTwo + " is " + playTwoDistance + " away.");
                    System.out.println(playerOne + " wins!!");
                    playOneScore++;
                }
                else
                {
                    System.out.println(playerOne + " is " + playOneDistance + " away.");
                    System.out.println(playerTwo + " is " + playTwoDistance + " away.");
                    System.out.println(playerTwo + " wins!!");
                    playTwoScore++;
                }
                turnSwitch = true;
            }

    
        }

        System.out.println("-----Final Score-----");
        System.out.println(playerOne + ": " + playOneScore + " " + playerTwo + " :" + playTwoScore);




    }

}