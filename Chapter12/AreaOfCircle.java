import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userdata;
        double area;

        System.out.println("What is the radius?");
        userdata = scan.nextInt();
        area = (userdata * userdata) * Math.PI;
        System.out.println("The radius is: " + userdata + " The area is: " + area);
        
    }
}