import java.util.Scanner;


public class TestCylinder
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        double radius, height;

        System.out.println("Enter Height: ");
        height = scan.nextDouble();

        System.out.println("Enter Radius: ");
        radius = scan.nextDouble();

        Cylinder cyli = new Cylinder(height, radius);

        System.out.println("Surface Area: " + cyli.surfaceArea() + " Volume: " + cyli.volume());

    }
}

 