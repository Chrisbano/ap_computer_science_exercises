import java.util.Random;
import java.util.Scanner;

public class examples
{

  public static void main ( String[] args )
  {
    Scanner scan = new Scanner( System.in );
    Random rand = new Random( );
    
    while ( true )
    {
      System.out.print((rand.nextInt(6)+1) );
      String line = scan.nextLine();
    }
  } 
}