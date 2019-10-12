import java.util.*;

public class Exercise7 {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        double x = 0;
        double y = 0;
        double distance = 0;

        for(int i = 0; i <= 1000; i++)
        {
            x += rand.nextDouble() * 2 - 1;
            y += rand.nextDouble() * 2 - 1;
        }
        distance = Math.sqrt((x * x) + (y * y));
        System.out.println(" The ant walked too (" + x + "," + y + ")");
        System.out.println(" The and traveld " + distance + " from the orgin (0,0)");
        
        

        

    }
}