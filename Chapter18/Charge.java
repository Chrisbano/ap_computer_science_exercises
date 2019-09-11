import java.util.Scanner;

public class Charge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double checking;
        double saving;
        final double servicecharge = 0.15;

        System.out.println("How much money do you have in checkings:");
        checking = scan.nextDouble();
        System.out.println("How much money do you have in savings:");
        saving = scan.nextDouble();

        if (checking > 1000 || saving > 1500) {
            System.out.println("There is no service charge");
        }
        else {
            System.out.println("you have a service charge of $" + servicecharge + " per check");
        }
    }
}