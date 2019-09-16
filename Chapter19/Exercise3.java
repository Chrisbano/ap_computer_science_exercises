import java.util.Scanner;


public class Exercise3{

    public static void main( String[] args)
    {
        String firstword;
        String secondword;
        Scanner scan = new Scanner(System.in);
        String string;


        System.out.println("Enter the first word: ");
        firstword = scan.nextLine();
        
        System.out.println("Enter the second word");
        secondword = scan.nextLine();

        int firstlength;
        int secondlength;

        secondlength = secondword.length();
        firstlength = firstword.length();

        int t = 30 - (secondlength + firstlength);
        System.out.print(firstword);
        while (t > 0) {
            System.out.print(".");
            t -= 1;
        }
        System.out.print(secondword);


    



    }
}
