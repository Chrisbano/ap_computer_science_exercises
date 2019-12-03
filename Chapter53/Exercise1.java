import java.util.*;

public class Exercise1
{
  public static void main ( String[] args ) 
  {
    System.out.println("Welcome to Mama Chris' Hubbard");

    Scanner scan = new Scanner( System.in );
    String inChars;
    int selection = 0;
    int oz = 0;

    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 16 );

    Pantry chrishubbard = new Pantry( goose, apple, rhub );

    

    
    while(selection != -1)
    {
        System.out.println("The available jams are: ");
        System.out.println( chrishubbard );

        System.out.println("Enter your selection (1, 2, or 3):");
        selection = scan.nextInt();

        System.out.println("How much would you like to spread?: ");
        oz = scan.nextInt();

        chrishubbard.select(selection);
        chrishubbard.spread(oz);


    }
    System.out.println("OK GOODBYE!!");

    

  }
}
