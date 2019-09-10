import java.util.Scanner;
import java.lang.Math;

public class Windchill{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double tempurature;
        double windspeed;
        double windchill;

        System.out.println("Please enter the tempurature: ");
        tempurature = scan.nextDouble();
        System.out.println("Please enter the windspeed: ");
        windspeed = scan.nextDouble();

        if (tempurature < 3){
            windchill = tempurature;

        }
        else{
            windchill = (35.74 + 0.6215 * tempurature) - (35.75 * Math.pow(windspeed, 0.16)) + (0.4275 * tempurature * Math.pow(windspeed,0.16));
        }

        System.out.println(windchill);






    }


}