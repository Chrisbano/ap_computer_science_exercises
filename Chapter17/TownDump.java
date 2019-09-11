import java.util.Scanner;

public class TownDump {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int trashinpounds;

        double trashcharge;

        System.out.println("How many pounds of trash will you be depositing:");
        trashinpounds = scan.nextInt();

        if (trashPounds < 200) {
            trashCharge = trashinpounds / 10;
        }
        else {
            trashCharge = 20 + ((trashinpounds - 200) / 12.5);
        }

        System.out.println("You Owe: $" + trashCharge);

    }
}